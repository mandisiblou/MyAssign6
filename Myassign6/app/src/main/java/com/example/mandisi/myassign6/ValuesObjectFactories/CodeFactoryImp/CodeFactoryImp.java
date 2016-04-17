package com.example.mandisi.myassign6.ValuesObjectFactories.CodeFactoryImp;

/**
 * Created by 211014486 on 4/17/2016.
 */
import com.example.mandisi.myassign6.ValuesObjectFactories.CodeFactory;
import com.example.mandisi.myassign6.ValuesObjects.Code;

import java.util.UUID;


public class CodeFactoryImp implements CodeFactory {
    private static CodeFactoryImp factory = null;

    private  CodeFactoryImp() {
    }
    public static CodeFactoryImp getInstance(){
        if(factory ==null)
            factory = new CodeFactoryImp();
        return factory;
    }
    public Code createCode(String codeId, String name) {
        Code code = new Code
                .Builder()
                .codeId(UUID.randomUUID().toString())
                .name(name)
                .build();
        return code;
    }
}

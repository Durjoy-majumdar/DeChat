package com.tencent.tav.decoder;

import java.util.HashMap;

public class RenderContextParams {
    private HashMap<String, Object> params = new HashMap<>();

    public Object getParam(String str) {
        return this.params.get(str);
    }

    public void putParam(String str, Object obj) {
        this.params.put(str, obj);
    }
}

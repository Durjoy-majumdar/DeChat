package ml0;

import com.tencent.live2.jsplugin.V2TXJSAdapterError;
import java.util.Map;

/* renamed from: ml0.u */
public class C21511u {

    /* renamed from: a */
    public int f60905a;

    /* renamed from: b */
    public String f60906b;

    /* renamed from: c */
    public Map<String, Object> f60907c;

    public C21511u() {
        this.f60905a = 0;
        this.f60906b = "Success";
        this.f60907c = null;
    }

    public C21511u(int i, String str) {
        this.f60907c = null;
        this.f60905a = i;
        this.f60906b = str;
    }

    public C21511u(V2TXJSAdapterError v2TXJSAdapterError) {
        this.f60905a = 0;
        this.f60906b = "Success";
        this.f60907c = null;
        this.f60905a = v2TXJSAdapterError.errorCode;
        this.f60906b = v2TXJSAdapterError.errorInfo;
        this.f60907c = v2TXJSAdapterError.resultMap;
    }
}

package tt3;

import ot3.C117896h;
import ot3.C21885g;

/* renamed from: tt3.e */
public abstract class C22553e<T> extends C21885g {

    /* renamed from: c */
    public T f64864c;

    public C22553e() {
        super(-1);
        this.f64864c = null;
    }

    public String toString() {
        if (this.f64864c == null) {
            return super.toString();
        }
        return String.format("total: %s, extData: %s", new Object[]{super.toString(), this.f64864c.toString()});
    }

    public C22553e(int i, String str, T t) {
        super(i, str);
        this.f64864c = null;
        if (i == 1008) {
            this.f61887b = "not initialized yet. please make sure you've already called SoterWrapperApi.init(...) and call backed";
        } else if (i == 1011) {
            this.f61887b = "context instance already released. should not happen normally, you can try to call again";
        } else if (i == 1019) {
            this.f61887b = "upload or verify signature in server side failed";
        } else if (i == 1013) {
            this.f61887b = "there must be at least 1 biometric enrolled in system to complete this process. please check it previously";
        } else if (i != 1014) {
            switch (i) {
                case 1002:
                    this.f61887b = "get support soter failed remotely";
                    break;
                case 1003:
                    this.f61887b = "upload app secure key";
                    break;
                case 1004:
                    this.f61887b = "upload auth key failed";
                    break;
            }
        } else {
            this.f61887b = "get challenge failed";
        }
        if (!C117896h.m166297b(str)) {
            this.f61887b = str;
        }
        this.f64864c = t;
    }

    public C22553e(int i) {
        this(i, "", (Object) null);
    }

    public C22553e(int i, T t) {
        this(i, "", t);
    }
}

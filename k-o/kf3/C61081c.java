package kf3;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import gy3.C87412m;

/* renamed from: kf3.c */
public abstract class C61081c extends C61083f {
    /* renamed from: f */
    public String mo86002f() {
        return "Int";
    }

    /* renamed from: g */
    public Object mo54534g() {
        if (C87412m.m108589b(mo86002f(), "Int")) {
            return 0;
        }
        if (C87412m.m108589b(mo86002f(), "Float")) {
            return Float.valueOf(0.0f);
        }
        if (C87412m.m108589b(mo86002f(), "String")) {
            return "";
        }
        if (C87412m.m108589b(mo86002f(), "Long")) {
            return 0L;
        }
        if (!BuildInfo.DEBUG) {
            return "";
        }
        throw new RuntimeException("invalid data type " + mo86002f());
    }

    /* renamed from: h */
    public String mo86003h() {
        return "";
    }

    /* renamed from: i */
    public String mo54535i() {
        return "";
    }

    /* renamed from: j */
    public String mo86004j() {
        return mo54531a() + '_' + mo86002f();
    }
}

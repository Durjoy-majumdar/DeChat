package com.tencent.tmsqmsp.oaid2;

import android.content.Context;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.tmsqmsp.oaid2.C86060j;
import java.security.MessageDigest;

/* renamed from: com.tencent.tmsqmsp.oaid2.l */
public class C116468l implements C116443b {

    /* renamed from: a */
    public Context f349398a;

    /* renamed from: b */
    public IVendorCallback f349399b;

    /* renamed from: c */
    public String f349400c = null;

    /* renamed from: d */
    public boolean f349401d = false;

    /* renamed from: com.tencent.tmsqmsp.oaid2.l$a */
    public class C116469a implements Runnable {
        public C116469a() {
        }

        public void run() {
            try {
                C86060j.C86061a a = C86060j.m106555a(C116468l.this.f349398a);
                String unused = C116468l.this.f349400c = a.mo120378a();
                a.mo120379b();
                if (!TextUtils.isEmpty(C116468l.this.f349400c)) {
                    boolean unused2 = C116468l.this.f349401d = true;
                }
                if (C116468l.this.f349399b != null) {
                    IVendorCallback d = C116468l.this.f349399b;
                    boolean c = C116468l.this.f349401d;
                    C116468l lVar = C116468l.this;
                    d.onResult(c, lVar.mo179915a(C86057e.m106549a(lVar.f349398a)), C116468l.this.f349400c);
                }
            } catch (Exception unused3) {
                if (TextUtils.isEmpty(C116468l.this.f349400c)) {
                    boolean unused4 = C116468l.this.f349401d = false;
                }
                if (C116468l.this.f349399b != null) {
                    IVendorCallback d2 = C116468l.this.f349399b;
                    boolean c2 = C116468l.this.f349401d;
                    C116468l lVar2 = C116468l.this;
                    d2.onResult(c2, lVar2.mo179915a(C86057e.m106549a(lVar2.f349398a)), C116468l.this.f349400c);
                }
            }
        }
    }

    /* renamed from: e */
    public boolean mo120390e() {
        return false;
    }

    /* renamed from: j */
    public void mo120391j() {
        new Thread(new C116469a()).start();
    }

    /* renamed from: k */
    public boolean mo120392k() {
        return false;
    }

    /* renamed from: l */
    public void mo120393l() {
    }

    /* renamed from: d */
    public String mo120389d() {
        return mo179915a(C86057e.m106549a(this.f349398a));
    }

    /* renamed from: b */
    public final String mo179916b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String str2 = "";
            for (byte b : MessageDigest.getInstance("MD5").digest(str.getBytes())) {
                String hexString = Integer.toHexString(b & ExifInterface.MARKER);
                if (hexString.length() == 1) {
                    hexString = "0".concat(hexString);
                }
                str2 = str2 + hexString;
            }
            return str2;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public final String mo179915a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            return mo179916b("0x1008611" + str + "0xdzfdweiwu");
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public void mo120388a(Context context, IVendorCallback iVendorCallback) {
        this.f349398a = context;
        this.f349399b = iVendorCallback;
    }

    /* renamed from: a */
    public String mo120387a() {
        return this.f349400c;
    }
}

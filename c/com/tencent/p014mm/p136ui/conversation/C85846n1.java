package com.tencent.p014mm.p136ui.conversation;

import android.graphics.Bitmap;
import ck3.C67391b;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import java.io.ByteArrayOutputStream;
import lb0.C88394b;
import org.json.JSONObject;
import te3.C90449z73;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.conversation.n1 */
public final class C85846n1 implements C74710m0 {

    /* renamed from: a */
    public static final C85846n1 f250046a = new C85846n1();

    /* renamed from: com.tencent.mm.ui.conversation.n1$a */
    public static final class C85847a implements Runnable {

        /* renamed from: d */
        public C68070l.C68072b f250047d;

        /* renamed from: e */
        public String f250048e;

        /* renamed from: f */
        public String f250049f;

        /* renamed from: g */
        public String f250050g;

        /* renamed from: h */
        public String f250051h;

        /* renamed from: i */
        public String f250052i;

        /* renamed from: j */
        public boolean f250053j;

        /* renamed from: n */
        public byte[] f250054n;

        public void run() {
            Bitmap bitmap;
            byte[] bArr;
            boolean z = true;
            if (!Util.isNullOrNil(this.f250049f)) {
                String str = C88394b.f255384g;
                C88394b bVar = C88394b.C88418q.f255427a;
                bitmap = bVar.mo122791g("file://" + this.f250049f, (C88394b.C88405h) null);
                if (bitmap == null || bitmap.isRecycled()) {
                    bitmap = BitmapUtil.getBitmapNative(this.f250050g);
                    if (this.f250053j) {
                        Log.m105927v("MicroMsg.OpenImKefuQuickBubbleDefaultHandler", "decode thumb icon bitmap by path(%s), and deleted(%s) file.", this.f250050g, Boolean.valueOf(C86013q1.m106447h(this.f250049f)));
                    }
                }
            } else {
                String str2 = C88394b.f255384g;
                bitmap = C88394b.C88418q.f255427a.mo122791g(this.f250050g, (C88394b.C88405h) null);
            }
            if (bitmap == null || bitmap.isRecycled()) {
                Object[] objArr = new Object[1];
                if (this.f250054n == null) {
                    z = false;
                }
                objArr[0] = Boolean.valueOf(z);
                Log.m105921e("MicroMsg.OpenImKefuQuickBubbleDefaultHandler", "thumb image is null sendMessageDefaultImg:%b", objArr);
                bArr = this.f250054n;
            } else {
                Log.m105924i("MicroMsg.OpenImKefuQuickBubbleDefaultHandler", "thumb image is not null ");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
            }
            C72695v.m85052E(this.f250047d, this.f250048e, this.f250052i, this.f250051h, (String) null, bArr);
        }
    }

    /* renamed from: a */
    public boolean mo103866a(C74708l1 l1Var, JSONObject jSONObject) {
        C87412m.m108594g(l1Var, "context");
        if (jSONObject != null) {
            Log.m105924i("MicroMsg.OpenImKefuQuickBubbleDefaultHandler", "handle, can not, customExtraInfo is not null");
            return false;
        }
        C67391b bVar = l1Var.f219658a;
        C90449z73 z732 = l1Var.f219659b;
        byte[] bArr = l1Var.f219660c;
        C68070l.C68072b bVar2 = new C68070l.C68072b();
        bVar2.f195570f = z732.f259952e;
        bVar2.f195582i = 33;
        String str = z732.f259958n;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        bVar2.f195573f2 = str;
        bVar2.f195569e2 = z732.f259953f;
        String str3 = z732.f259957j;
        if (str3 == null) {
            str3 = str2;
        }
        bVar2.f195577g2 = str3;
        bVar2.f195653z2 = z732.f259961q;
        bVar2.f195467A2 = z732.f259962r;
        String str4 = z732.f259963s;
        if (str4 == null) {
            str4 = str2;
        }
        bVar2.f195585i2 = str4;
        bVar2.f195581h2 = 2;
        String str5 = z732.f259966v;
        if (str5 == null) {
            str5 = str2;
        }
        bVar2.f195586j = str5;
        String str6 = z732.f259960p;
        if (str6 == null) {
            str6 = str2;
        }
        bVar2.f195471B2 = str6;
        bVar2.f195494H1 = "wxapp_" + z732.f259957j + z732.f259965u;
        String str7 = z732.f259958n;
        if (str7 == null) {
            str7 = str2;
        }
        bVar2.f195634v = str7;
        String str8 = z732.f259959o;
        if (str8 == null) {
            str8 = str2;
        }
        bVar2.f195638w = str8;
        C85847a aVar = new C85847a();
        String str9 = z732.f259957j;
        if (str9 != null) {
            str2 = str9;
        }
        aVar.f250048e = str2;
        aVar.f250047d = bVar2;
        aVar.f250052i = z732.f259952e;
        aVar.f250050g = z732.f259954g;
        aVar.f250049f = z732.f259956i;
        aVar.f250051h = bVar.mo91577r();
        aVar.f250053j = z732.f259955h;
        aVar.f250054n = bArr;
        ((C119157j) C119157j.f356862d).mo183875f(aVar);
        return true;
    }
}

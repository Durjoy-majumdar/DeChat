package com.tencent.p014mm.p136ui.conversation;

import android.app.Activity;
import android.graphics.Bitmap;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.message.C80996q;
import com.tencent.p014mm.pluginsdk.model.app.C72695v;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C46106g;
import ht1.C60175i;
import java.io.ByteArrayOutputStream;
import java.util.LinkedList;
import lb0.C88394b;
import nj3.C76912y0;
import org.json.JSONObject;
import p565ir.C60613r;
import rx3.C13598b0;
import sx3.C64197v;
import te3.C48720ai3;
import te3.C49557gg1;
import te3.C49805i60;
import te3.C50077k40;
import te3.C50359m60;
import te3.C50545nh3;
import te3.C50858pp0;
import te3.C52266zh3;
import te3.C64287ci1;
import te3.C64370fp1;
import te3.C64513l40;
import te3.C90449z73;
import te3.k45;
import te3.q85;
import zt3.C119157j;

/* renamed from: com.tencent.mm.ui.conversation.p1 */
public final class C85848p1 implements C74710m0 {

    /* renamed from: a */
    public static final C85848p1 f250055a = new C85848p1();

    /* renamed from: com.tencent.mm.ui.conversation.p1$b */
    public static final class C45000b extends C87413o implements C32226l<C49805i60, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C68070l.C68072b f122059d;

        /* renamed from: e */
        public final /* synthetic */ C67391b f122060e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45000b(C68070l.C68072b bVar, C67391b bVar2) {
            super(1);
            this.f122059d = bVar;
            this.f122060e = bVar2;
        }

        public Object invoke(Object obj) {
            String str;
            C50545nh3 nh32;
            C50545nh3 nh33;
            C50077k40 k402;
            k45 k45;
            C50077k40 k403;
            k45 k452;
            LinkedList<C52266zh3> linkedList;
            C48720ai3 ai32;
            q85 q85;
            C50077k40 k404;
            k45 k453;
            C49805i60 i602 = (C49805i60) obj;
            C46106g gVar = new C46106g();
            String str2 = null;
            C50359m60 m602 = i602 != null ? i602.f135125d : null;
            C49557gg1 gg12 = new C49557gg1();
            gg12.f134037j = (m602 == null || (k404 = m602.f137873n) == null || (k453 = k404.f136540d) == null) ? null : k453.f136556e;
            gg12.f134031d = m602 != null ? m602.f137866d : null;
            String str3 = "";
            int i = 0;
            if (m602 == null || (linkedList = m602.f137868f) == null) {
                str = str3;
            } else {
                String str4 = str3;
                str = str4;
                int i2 = 0;
                for (T next : linkedList) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        C52266zh3 zh32 = (C52266zh3) next;
                        LinkedList<C52266zh3> linkedList2 = m602.f137868f;
                        boolean z = true;
                        if (i2 < (linkedList2 != null ? linkedList2.size() : 0) - 1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str4);
                            C48720ai3 ai33 = zh32.f145963d;
                            sb.append(ai33 != null ? ai33.f130555f : null);
                            sb.append(12289);
                            str4 = sb.toString();
                        } else {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(str4);
                            C48720ai3 ai34 = zh32.f145963d;
                            sb4.append(ai34 != null ? ai34.f130555f : null);
                            str4 = sb4.toString();
                        }
                        if (str.length() != 0) {
                            z = false;
                        }
                        if (z) {
                            str = (zh32 == null || (ai32 = zh32.f145963d) == null || (q85 = ai32.f130558i) == null) ? null : q85.f140188e;
                            if (str == null) {
                                str = str3;
                            }
                        }
                        i2 = i3;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                str3 = str4;
            }
            gg12.f134032e = str3;
            gg12.f134036i = str;
            gg12.f134038n = (m602 == null || (k403 = m602.f137873n) == null || (k452 = k403.f136540d) == null) ? null : k452.f136555d;
            gg12.f134037j = (m602 == null || (k402 = m602.f137873n) == null || (k45 = k402.f136540d) == null) ? null : k45.f136556e;
            gg12.f134035h = m602 != null ? m602.f137872j : null;
            StringBuilder sb5 = new StringBuilder();
            sb5.append((m602 == null || (nh33 = m602.f137870h) == null) ? null : nh33.f138611f);
            if (!(m602 == null || (nh32 = m602.f137870h) == null)) {
                str2 = nh32.f138610e;
            }
            sb5.append(str2);
            gg12.f134034g = sb5.toString();
            gg12.f134032e = str3;
            if (m602 != null) {
                i = m602.f137869g;
            }
            gg12.f134033f = i;
            gVar.f124277b = gg12;
            this.f122059d.mo93545f(gVar);
            C80996q.C1279a.m1369a().mo112828y0(this.f122059d, "", "", this.f122060e.mo91577r(), "", (byte[]) null, false);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.p1$c */
    public static final class C57832c extends C87413o implements C32226l<C50858pp0, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C64287ci1 f165455d;

        /* renamed from: e */
        public final /* synthetic */ C67391b f165456e;

        /* renamed from: f */
        public final /* synthetic */ C74708l1 f165457f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57832c(C64287ci1 ci12, C67391b bVar, C74708l1 l1Var) {
            super(1);
            this.f165455d = ci12;
            this.f165456e = bVar;
            this.f165457f = l1Var;
        }

        public Object invoke(Object obj) {
            String str;
            C64513l40 l402;
            C64513l40 l403;
            C50858pp0 pp02 = (C50858pp0) obj;
            String str2 = null;
            if ((pp02 != null ? pp02.f139889d : null) != null) {
                C64287ci1 ci12 = this.f165455d;
                C64370fp1 fp12 = pp02.f139889d;
                if (!(fp12 == null || (l403 = fp12.f183185p) == null)) {
                    str2 = l403.f184033f;
                }
                ci12.f182507s = str2;
                if (fp12 == null || (l402 = fp12.f183185p) == null || (str = l402.f184034g) == null) {
                    str = "";
                }
                ci12.f182508t = str;
                C68070l.C68072b bVar = new C68070l.C68072b();
                bVar.f195582i = 82;
                C60175i iVar = new C60175i();
                C64287ci1 ci13 = this.f165455d;
                C87412m.m108594g(ci13, "<set-?>");
                iVar.f171712b = ci13;
                bVar.mo93545f(iVar);
                bVar.f195582i = 82;
                bVar.f195570f = MMApplicationContext.getContext().getString(C0966R.string.ge7);
                bVar.f195586j = MMApplicationContext.getContext().getString(C0966R.string.ge8);
                C80996q.C1279a.m1369a().mo112828y0(bVar, "", "", this.f165456e.mo91577r(), "", (byte[]) null, false);
            } else {
                C76912y0.m92767f(this.f165457f.f219658a.mo91565f(), this.f165457f.f219658a.mo91565f().getResources().getString(C0966R.string.f361475k61));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.ui.conversation.p1$a */
    public static final class C85849a implements Runnable {

        /* renamed from: d */
        public C68070l.C68072b f250056d;

        /* renamed from: e */
        public String f250057e;

        /* renamed from: f */
        public String f250058f;

        /* renamed from: g */
        public String f250059g;

        /* renamed from: h */
        public String f250060h;

        /* renamed from: i */
        public String f250061i;

        /* renamed from: j */
        public boolean f250062j;

        /* renamed from: n */
        public byte[] f250063n;

        public void run() {
            Bitmap bitmap;
            byte[] bArr;
            boolean z = true;
            if (!Util.isNullOrNil(this.f250058f)) {
                String str = C88394b.f255384g;
                C88394b bVar = C88394b.C88418q.f255427a;
                bitmap = bVar.mo122791g("file://" + this.f250058f, (C88394b.C88405h) null);
                if (bitmap == null || bitmap.isRecycled()) {
                    bitmap = BitmapUtil.getBitmapNative(this.f250059g);
                    if (this.f250062j) {
                        Log.m105927v("MicroMsg.OpenImKefuQuickBubbleDefaultHandler", "decode thumb icon bitmap by path(%s), and deleted(%s) file.", this.f250059g, Boolean.valueOf(C86013q1.m106447h(this.f250058f)));
                    }
                }
            } else {
                String str2 = C88394b.f255384g;
                bitmap = C88394b.C88418q.f255427a.mo122791g(this.f250059g, (C88394b.C88405h) null);
            }
            if (bitmap == null || bitmap.isRecycled()) {
                Object[] objArr = new Object[1];
                if (this.f250063n == null) {
                    z = false;
                }
                objArr[0] = Boolean.valueOf(z);
                Log.m105921e("MicroMsg.OpenImKefuQuickBubbleDefaultHandler", "thumb image is null sendMessageDefaultImg:%b", objArr);
                bArr = this.f250063n;
            } else {
                Log.m105924i("MicroMsg.OpenImKefuQuickBubbleDefaultHandler", "thumb image is not null ");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
            }
            C72695v.m85052E(this.f250056d, this.f250057e, this.f250061i, this.f250060h, (String) null, bArr);
        }
    }

    /* renamed from: a */
    public boolean mo103866a(C74708l1 l1Var, JSONObject jSONObject) {
        Class cls = C60613r.class;
        C87412m.m108594g(l1Var, "context");
        boolean z = false;
        if (jSONObject == null) {
            Log.m105924i("MicroMsg.OpenImKefuQuickBubbleDefaultHandler", "handle, can not, customExtraInfo is null");
            return false;
        }
        C67391b bVar = l1Var.f219658a;
        C90449z73 z732 = l1Var.f219659b;
        byte[] bArr = l1Var.f219660c;
        boolean optBoolean = jSONObject.optBoolean("isOrderMsg");
        JSONObject optJSONObject = jSONObject.optJSONObject("orderParam");
        String str = null;
        String optString = optJSONObject != null ? optJSONObject.optString("orderID") : null;
        boolean optBoolean2 = jSONObject.optBoolean("isProductMsg");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("productParam");
        String optString2 = optJSONObject2 != null ? optJSONObject2.optString("productID") : null;
        String optString3 = optJSONObject2 != null ? optJSONObject2.optString("finderUsername") : null;
        if (optJSONObject2 != null) {
            str = optJSONObject2.optString("ecSource");
        }
        if (optString == null || !optBoolean) {
            if (optBoolean2) {
                if (optString2 == null || optString2.length() == 0) {
                    z = true;
                }
                if (!z) {
                    C64287ci1 ci12 = new C64287ci1();
                    ci12.f182502n = optString2;
                    ci12.f182512x = str;
                    ci12.f182496e = optString3;
                    Activity f = l1Var.f219658a.mo91565f();
                    C87412m.m108593f(f, "context.chattingContext.context");
                    ((C60613r) C86312j.m106911c(cls)).Se0(f, ci12, new C57832c(ci12, bVar, l1Var));
                    return true;
                }
            }
            C68070l.C68072b bVar2 = new C68070l.C68072b();
            bVar2.f195570f = z732.f259952e;
            bVar2.f195582i = 33;
            String str2 = z732.f259958n;
            String str3 = "";
            if (str2 == null) {
                str2 = str3;
            }
            bVar2.f195573f2 = str2;
            bVar2.f195569e2 = z732.f259953f;
            String str4 = z732.f259957j;
            if (str4 == null) {
                str4 = str3;
            }
            bVar2.f195577g2 = str4;
            bVar2.f195653z2 = z732.f259961q;
            bVar2.f195467A2 = z732.f259962r;
            String str5 = z732.f259963s;
            if (str5 == null) {
                str5 = str3;
            }
            bVar2.f195585i2 = str5;
            bVar2.f195581h2 = 2;
            String str6 = z732.f259966v;
            if (str6 == null) {
                str6 = str3;
            }
            bVar2.f195586j = str6;
            String str7 = z732.f259960p;
            if (str7 == null) {
                str7 = str3;
            }
            bVar2.f195471B2 = str7;
            bVar2.f195494H1 = "wxapp_" + z732.f259957j + z732.f259965u;
            String str8 = z732.f259958n;
            if (str8 == null) {
                str8 = str3;
            }
            bVar2.f195634v = str8;
            String str9 = z732.f259959o;
            if (str9 == null) {
                str9 = str3;
            }
            bVar2.f195638w = str9;
            C85849a aVar = new C85849a();
            String str10 = z732.f259957j;
            if (str10 != null) {
                str3 = str10;
            }
            aVar.f250057e = str3;
            aVar.f250056d = bVar2;
            aVar.f250061i = z732.f259952e;
            aVar.f250059g = z732.f259954g;
            aVar.f250058f = z732.f259956i;
            aVar.f250060h = bVar.mo91577r();
            aVar.f250062j = z732.f259955h;
            aVar.f250063n = bArr;
            ((C119157j) C119157j.f356862d).mo183875f(aVar);
            return true;
        }
        C68070l.C68072b bVar3 = new C68070l.C68072b();
        bVar3.f195570f = z732.f259952e;
        bVar3.f195582i = 96;
        bVar3.f195570f = MMApplicationContext.getContext().getString(C0966R.string.ge7);
        bVar3.f195586j = MMApplicationContext.getContext().getString(C0966R.string.ge8);
        Activity f2 = l1Var.f219658a.mo91565f();
        C87412m.m108593f(f2, "context.chattingContext.context");
        ((C60613r) C86312j.m106911c(cls)).zq0(f2, optString, new C45000b(bVar3, bVar));
        return true;
    }
}

package hl2;

import android.graphics.BitmapFactory;
import android.graphics.Point;
import com.tencent.p014mm.graphics.MMBitmapFactory;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.plugin.scanner.model.C94480u0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32228q;
import gy3.C8477a0;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import hl2.C98481i;
import hl2.C98489n;
import java.util.ArrayList;
import java.util.Arrays;
import p158gt.C98201k;
import rx3.C13598b0;
import sk2.C101645e;
import te3.C101856vd;

/* renamed from: hl2.e */
public final class C98473e extends C98477g {

    /* renamed from: hl2.e$a */
    public static final class C98474a extends C87413o implements C32228q<String, Boolean, Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<String> f288819d;

        /* renamed from: e */
        public final /* synthetic */ C8477a0 f288820e;

        /* renamed from: f */
        public final /* synthetic */ C8477a0 f288821f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C98474a(C8479f0<String> f0Var, C8477a0 a0Var, C8477a0 a0Var2) {
            super(3);
            this.f288819d = f0Var;
            this.f288820e = a0Var;
            this.f288821f = a0Var2;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            T t = (String) obj;
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            boolean booleanValue2 = ((Boolean) obj3).booleanValue();
            Log.m105919d("MicroMsg.AiScanChatImageStrategy", "alvinluo getCDNImageInfoList-chat getHdImagePath %s, isHd: %s, hasHd: %b", t, Boolean.valueOf(booleanValue), Boolean.valueOf(booleanValue2));
            C8479f0<String> f0Var = this.f288819d;
            if (t == null) {
                t = "";
            }
            f0Var.f27484d = t;
            this.f288820e.f27482d = booleanValue;
            this.f288821f.f27482d = booleanValue2;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: hl2.e$b */
    public static final class C98475b implements C98481i.C98482a {

        /* renamed from: a */
        public final /* synthetic */ C8479f0<C101856vd> f288822a;

        /* renamed from: b */
        public final /* synthetic */ C8479f0<C101856vd> f288823b;

        /* renamed from: c */
        public final /* synthetic */ ArrayList<C101856vd> f288824c;

        /* renamed from: d */
        public final /* synthetic */ C8477a0 f288825d;

        /* renamed from: e */
        public final /* synthetic */ C8477a0 f288826e;

        /* renamed from: f */
        public final /* synthetic */ long f288827f;

        /* renamed from: g */
        public final /* synthetic */ C101645e f288828g;

        /* renamed from: h */
        public final /* synthetic */ C98481i.C98483b f288829h;

        /* renamed from: i */
        public final /* synthetic */ C98481i.C98483b f288830i;

        /* renamed from: j */
        public final /* synthetic */ C98489n.C98490a f288831j;

        public C98475b(C8479f0<C101856vd> f0Var, C8479f0<C101856vd> f0Var2, ArrayList<C101856vd> arrayList, C8477a0 a0Var, C8477a0 a0Var2, long j, C101645e eVar, C98481i.C98483b bVar, C98481i.C98483b bVar2, C98489n.C98490a aVar) {
            this.f288822a = f0Var;
            this.f288823b = f0Var2;
            this.f288824c = arrayList;
            this.f288825d = a0Var;
            this.f288826e = a0Var2;
            this.f288827f = j;
            this.f288828g = eVar;
            this.f288829h = bVar;
            this.f288830i = bVar2;
            this.f288831j = aVar;
        }

        /* renamed from: a */
        public void mo137842a(C98481i.C98484c cVar) {
            String str;
            boolean z;
            C87412m.m108594g(cVar, "checkImageResult");
            StringBuilder sb = new StringBuilder();
            sb.append("alvinluo getCDNImageInfoList-chat checkImageStatus result errType: ");
            sb.append(cVar.f288847c);
            sb.append(", errCode: ");
            sb.append(cVar.f288848d);
            sb.append(", reUploadInfo: ");
            C101856vd vdVar = cVar.f288846b;
            boolean z2 = false;
            if (vdVar != null) {
                str = String.format("BizAiScanCdnImg fileId: %s, size: [%s, %s], cdn_src: %s, cdn_status: %s", Arrays.copyOf(new Object[]{vdVar.f299668g, Integer.valueOf(vdVar.f299666e), Integer.valueOf(vdVar.f299667f), Integer.valueOf(vdVar.f299665d), Integer.valueOf(vdVar.f299670i)}, 5));
                C87412m.m108593f(str, "format(format, *args)");
            } else {
                str = null;
            }
            sb.append(str);
            Log.m105924i("MicroMsg.AiScanChatImageStrategy", sb.toString());
            int i = cVar.f288847c;
            if (i == 0 && cVar.f288848d == 0) {
                C101856vd vdVar2 = cVar.f288846b;
                if (vdVar2 != null) {
                    C101856vd vdVar3 = (C101856vd) this.f288822a.f27484d;
                    if (vdVar3 != null) {
                        vdVar3.f299670i = 2;
                    }
                    C101856vd vdVar4 = (C101856vd) this.f288823b.f27484d;
                    if (vdVar4 != null) {
                        vdVar4.f299670i = 2;
                    }
                    ArrayList<C101856vd> arrayList = this.f288824c;
                    C87412m.m108591d(vdVar2);
                    arrayList.add(vdVar2);
                    z = true;
                } else {
                    C101856vd vdVar5 = (C101856vd) this.f288822a.f27484d;
                    if (vdVar5 != null) {
                        vdVar5.f299670i = 1;
                    }
                    C101856vd vdVar6 = (C101856vd) this.f288823b.f27484d;
                    if (vdVar6 != null) {
                        vdVar6.f299670i = 1;
                    }
                    z = false;
                }
                boolean z3 = this.f288825d.f27482d;
                if (z3) {
                    C101856vd vdVar7 = (C101856vd) this.f288823b.f27484d;
                    if (vdVar7 != null) {
                        this.f288824c.add(vdVar7);
                    }
                    C101856vd vdVar8 = (C101856vd) this.f288822a.f27484d;
                    if (vdVar8 != null) {
                        ArrayList<C101856vd> arrayList2 = this.f288824c;
                        vdVar8.f299666e = 0;
                        vdVar8.f299667f = 0;
                        arrayList2.add(vdVar8);
                    }
                } else if (!this.f288826e.f27482d || z3) {
                    C101856vd vdVar9 = (C101856vd) this.f288823b.f27484d;
                    if (vdVar9 != null) {
                        this.f288824c.add(vdVar9);
                    }
                } else {
                    Log.m105924i("MicroMsg.AiScanChatImageStrategy", "alvinluo getCDNImageInfoList-chat hasHd but hd not exist");
                    C98481i.C98483b bVar = new C98481i.C98483b(this.f288827f, 1);
                    C98476f.m127926a(bVar, this.f288828g.f297534c, 1);
                    C101856vd a = bVar.mo137847a();
                    a.f299665d = 1;
                    this.f288824c.add(a);
                    C101856vd vdVar10 = (C101856vd) this.f288823b.f27484d;
                    if (vdVar10 != null) {
                        this.f288824c.add(vdVar10);
                    }
                }
                C101645e eVar = this.f288828g;
                Log.m105925i("MicroMsg.AiScanChatImageStrategy", "alvinluo getCDNImageInfoList-chat checkImageStatus result reUpload: %s, list size: %s, request.pHash: %s, needPHash: %s", Boolean.valueOf(z), Integer.valueOf(this.f288824c.size()), eVar.f297540i, Boolean.valueOf(eVar.f297541j));
                C101645e eVar2 = this.f288828g;
                if (eVar2.f297540i == null && eVar2.f297541j) {
                    String str2 = C86013q1.m106450k(this.f288829h.f288839b) ? this.f288829h.f288839b : C86013q1.m106450k(this.f288830i.f288839b) ? this.f288830i.f288839b : "";
                    if (str2.length() > 0) {
                        z2 = true;
                    }
                    if (z2) {
                        this.f288828g.f297540i = C94480u0.f273191a.mo129952a(str2);
                    }
                }
                C98489n.C98490a aVar = this.f288831j;
                if (aVar != null) {
                    aVar.mo137850f(this.f288824c);
                    return;
                }
                return;
            }
            C98489n.C98490a aVar2 = this.f288831j;
            if (aVar2 != null) {
                aVar2.mo137849e(i, cVar.f288848d, cVar.f288849e);
            }
        }

        /* renamed from: b */
        public void mo137843b(String str) {
            C87412m.m108594g(str, "mediaId");
            C98489n.C98490a aVar = this.f288831j;
            if (aVar != null) {
                aVar.mo137851g(str);
            }
        }
    }

    /* renamed from: a */
    public void mo137839a(C101645e eVar, C98489n.C98490a aVar) {
        ArrayList arrayList;
        C101645e eVar2 = eVar;
        C87412m.m108594g(eVar2, "request");
        long j = eVar2.f297532a;
        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(eVar2.f297534c);
        ArrayList arrayList2 = new ArrayList();
        C8479f0 f0Var = new C8479f0();
        f0Var.f27484d = "";
        C8477a0 a0Var = new C8477a0();
        C8477a0 a0Var2 = new C8477a0();
        C98474a aVar2 = new C98474a(f0Var, a0Var, a0Var2);
        Class cls = C98201k.class;
        if (!b002.mo100979R3() && !b002.mo100961A3()) {
            Boolean bool = Boolean.FALSE;
            aVar2.invoke((Object) null, bool, bool);
            arrayList = arrayList2;
        } else if (b002.mo108769t2() == 1) {
            C92836k vP = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127200vP(b002.mo108768t(), b002.getMsgId());
            if (vP.f267374a == 0) {
                long y2 = b002.mo108774y2();
                Log.m105919d("MicroMsg.AiScanChatImageUtils", "alvinluo getImagePath img invalid and try get by msgSvrId: %s", Long.valueOf(y2));
                vP = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127168NQ(b002.mo108768t(), y2);
            }
            String r502 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).r50(b002.mo108768t(), vP);
            String TY = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(r502, "", "", true);
            arrayList = arrayList2;
            Log.m105919d("MicroMsg.AiScanChatImageUtils", "alvinluo getImagePath hdImagePath %s, %s", r502, TY);
            if (C86013q1.m106450k(TY)) {
                Boolean bool2 = Boolean.TRUE;
                aVar2.invoke(TY, bool2, bool2);
            } else {
                String str = vP.f267378e;
                String TY2 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(str, "", "", true);
                Log.m105919d("MicroMsg.AiScanChatImageUtils", "alvinluo getImagePath bigImagePath %s, %s", str, TY2);
                if (C86013q1.m106450k(TY2)) {
                    Boolean bool3 = Boolean.FALSE;
                    aVar2.invoke(TY2, bool3, bool3);
                }
            }
        } else {
            arrayList = arrayList2;
            C92836k NQ = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127168NQ(b002.mo108768t(), b002.mo108774y2());
            if (NQ.mo127145p()) {
                String r503 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).r50(b002.mo108768t(), NQ);
                String TY3 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(r503, "", "", true);
                Log.m105919d("MicroMsg.AiScanChatImageUtils", "alvinluo getImagePath receiver hdImagePath %s, %s", r503, TY3);
                if (C86013q1.m106450k(TY3)) {
                    Boolean bool4 = Boolean.TRUE;
                    aVar2.invoke(TY3, bool4, bool4);
                }
            }
            String str2 = NQ.f267378e;
            String TY4 = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127174TY(str2, "", "", true);
            Log.m105919d("MicroMsg.AiScanChatImageUtils", "alvinluo getImagePath receiver bigImagePath %s, %s", str2, TY4);
            if (C86013q1.m106450k(TY4)) {
                aVar2.invoke(TY4, Boolean.FALSE, Boolean.valueOf(NQ.mo127145p()));
            }
        }
        C101645e eVar3 = eVar;
        Log.m105925i("MicroMsg.AiScanChatImageStrategy", "alvinluo getCDNImageInfoList-chat msgId: %s, session: %s, isHdImageValid: %s, hasHd: %s", Long.valueOf(eVar3.f297534c), Long.valueOf(j), Boolean.valueOf(a0Var.f27482d), Boolean.valueOf(a0Var2.f27482d));
        C8479f0 f0Var2 = new C8479f0();
        C8479f0 f0Var3 = new C8479f0();
        C98481i.C98483b bVar = new C98481i.C98483b(j, 2);
        mo137840c(eVar3.f297534c, bVar, a0Var.f27482d);
        C98481i.C98483b bVar2 = new C98481i.C98483b(j, 1);
        String str3 = (String) f0Var.f27484d;
        C87412m.m108594g(str3, "<set-?>");
        bVar2.f288839b = str3;
        mo137840c(eVar3.f297534c, bVar2, a0Var.f27482d);
        C98481i.C98484c a = C98481i.m127933a(bVar, C8596a.m8446a(eVar3.f297533b));
        C98481i.C98484c a2 = C98481i.m127933a(bVar2, C8596a.m8446a(eVar3.f297533b));
        String str4 = eVar3.f297535d;
        if (str4 == null || str4.length() == 0) {
            if (C86013q1.m106450k(bVar2.f288839b)) {
                eVar3.f297535d = bVar2.f288839b;
            } else if (C86013q1.m106450k(bVar.f288839b)) {
                eVar3.f297535d = bVar.f288839b;
            }
        }
        Log.m105925i("MicroMsg.AiScanChatImageStrategy", "alvinluo getCDNImageInfoList-chat result midImage fileId: %s, aesKey: %s, hdImage fileId: %s aesKey: %s", bVar.f288841d, Util.secPrint(bVar.f288842e), bVar2.f288841d, Util.secPrint(bVar2.f288842e));
        C98481i.C98484c cVar = a2;
        C98475b bVar3 = r1;
        C98481i.C98483b bVar4 = bVar2;
        C98481i.C98483b bVar5 = bVar;
        C98475b bVar6 = new C98475b(f0Var2, f0Var3, arrayList, a0Var, a0Var2, j, eVar, bVar, bVar4, aVar);
        f0Var2.f27484d = bVar5.mo137847a();
        f0Var3.f27484d = bVar4.mo137847a();
        int i = a.f288845a;
        if (i == 1) {
            mo137845b(eVar, bVar5, bVar3);
            return;
        }
        C101645e eVar4 = eVar;
        C98481i.C98483b bVar7 = bVar5;
        int i2 = cVar.f288845a;
        if (i2 == 1) {
            mo137845b(eVar4, bVar4, bVar3);
            return;
        }
        C98481i.C98483b bVar8 = bVar4;
        if (i2 == 2) {
            mo137845b(eVar4, bVar8, bVar3);
        } else if (i == 2) {
            mo137845b(eVar4, bVar7, bVar3);
        } else {
            C98481i.C98484c cVar2 = new C98481i.C98484c();
            cVar2.f288847c = 3;
            cVar2.f288848d = 401;
            bVar3.mo137842a(cVar2);
        }
    }

    /* renamed from: c */
    public final void mo137840c(long j, C98481i.C98483b bVar, boolean z) {
        int i = bVar.f288838a;
        boolean z2 = false;
        if (i == 2) {
            bVar.f288843f = 0;
            String b = C98476f.f288832a.mo137844b(((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(j));
            if (b == null) {
                b = "";
            }
            bVar.f288839b = b;
        } else if (i == 1) {
            bVar.f288843f = z ? 1 : 0;
        }
        String str = bVar.f288839b;
        if (str == null || str.length() == 0) {
            z2 = true;
        }
        Point point = null;
        if (!z2 && C86013q1.m106450k(str)) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            MMBitmapFactory.m98735d(str, options);
            point = new Point(options.outWidth, options.outHeight);
        }
        bVar.f288840c = point;
        C98476f.m127926a(bVar, j, bVar.f288843f);
    }

    public String name() {
        return "MicroMsg.AiScanChatImageStrategy";
    }
}

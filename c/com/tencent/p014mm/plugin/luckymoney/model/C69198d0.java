package com.tencent.p014mm.plugin.luckymoney.model;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.chatting.component.ListScrollPAGView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.vfs.VFSStrategy;
import com.tencent.p014mm.wallet_core.model.C75142u0;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import org.libpag.PAGFile;
import org.libpag.PAGImage;
import org.libpag.PAGView;
import rx3.C13598b0;
import te3.C77994sf2;
import te3.C77999tf2;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.luckymoney.model.d0 */
public final class C69198d0 {

    /* renamed from: a */
    public static final C69198d0 f199107a = new C69198d0();

    /* renamed from: b */
    public static final String f199108b = (VFSStrategy.m163776d("luckymoney_resource") + "/dynamicPagResource/");

    /* renamed from: c */
    public static final String f199109c = "bubble/";

    /* renamed from: d */
    public static final String f199110d = "crop/";

    /* renamed from: e */
    public static final String f199111e = "cover/";

    /* renamed from: f */
    public static final String f199112f = "detail/";

    /* renamed from: g */
    public static final String f199113g = ".pag";

    @C91590f(mo125468c = "com.tencent.mm.plugin.luckymoney.model.LuckyMoneyEnvelopePagLogic$downloadPagRes$1", mo125469f = "LuckyMoneyEnvelopePagLogic.kt", mo125470l = {208}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.luckymoney.model.d0$a */
    public static final class C69199a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f199114d;

        /* renamed from: e */
        public final /* synthetic */ String f199115e;

        /* renamed from: f */
        public final /* synthetic */ String f199116f;

        /* renamed from: g */
        public final /* synthetic */ C75142u0.C75149e f199117g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C69199a(String str, String str2, C75142u0.C75149e eVar, C15601d<? super C69199a> dVar) {
            super(2, dVar);
            this.f199115e = str;
            this.f199116f = str2;
            this.f199117g = eVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C69199a(this.f199115e, this.f199116f, this.f199117g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C69199a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f199114d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C75142u0 u0Var = C75142u0.f221103a;
                String str = this.f199115e;
                String str2 = this.f199116f;
                this.f199114d = 1;
                obj = u0Var.mo104866b(str, str2, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C75142u0.C75143a aVar2 = (C75142u0.C75143a) obj;
            C75142u0.C75149e eVar = this.f199117g;
            if (eVar != null) {
                eVar.mo95346a(aVar2);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.luckymoney.model.d0$b */
    public static final class C69200b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f199118d;

        /* renamed from: e */
        public final /* synthetic */ String f199119e;

        /* renamed from: f */
        public final /* synthetic */ ListScrollPAGView f199120f;

        /* renamed from: g */
        public final /* synthetic */ boolean f199121g;

        /* renamed from: com.tencent.mm.plugin.luckymoney.model.d0$b$a */
        public static final class C69201a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ListScrollPAGView f199122d;

            public C69201a(ListScrollPAGView listScrollPAGView) {
                this.f199122d = listScrollPAGView;
            }

            public final void run() {
                ListScrollPAGView listScrollPAGView = this.f199122d;
                listScrollPAGView.f48757i = true;
                listScrollPAGView.f48758j = null;
                listScrollPAGView.mo21215g();
            }
        }

        /* renamed from: com.tencent.mm.plugin.luckymoney.model.d0$b$b */
        public static final class C69202b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ ListScrollPAGView f199123d;

            public C69202b(ListScrollPAGView listScrollPAGView) {
                this.f199123d = listScrollPAGView;
            }

            public final void run() {
                ListScrollPAGView listScrollPAGView = this.f199123d;
                listScrollPAGView.f48757i = true;
                listScrollPAGView.f48758j = null;
                listScrollPAGView.mo21215g();
            }
        }

        public C69200b(int i, String str, ListScrollPAGView listScrollPAGView, boolean z) {
            this.f199118d = i;
            this.f199119e = str;
            this.f199120f = listScrollPAGView;
            this.f199121g = z;
        }

        public final void run() {
            int i = this.f199118d;
            if (i != 0) {
                if (i != 1) {
                    this.f199120f.mo21224k(this.f199119e);
                } else {
                    Drawable drawable = MMApplicationContext.getContext().getResources().getDrawable(C0966R.C0969drawable.cot);
                    C87412m.m108593f(drawable, "getContext().resources.g…money_envelop_pag_red_bg)");
                    Bitmap transformDrawableToBitmap = BitmapUtil.transformDrawableToBitmap(drawable);
                    C87412m.m108593f(transformDrawableToBitmap, "transformDrawableToBitmap(drawable)");
                    PAGImage FromBitmap = PAGImage.FromBitmap(transformDrawableToBitmap);
                    String str = this.f199119e;
                    if (!(str == null || str.length() == 0)) {
                        PAGFile Load = PAGFile.Load(this.f199119e);
                        if (Load == null) {
                            Log.m105925i("MicroMsg.LuckyMoneyEnvelopePagLogic", "file == null，targetFilePath is %s", this.f199119e);
                            if (C86013q1.m106450k(this.f199119e)) {
                                C86013q1.m106447h(this.f199119e);
                                return;
                            }
                            return;
                        }
                        Load.replaceImage(0, FromBitmap);
                        this.f199120f.setComposition(Load);
                    } else {
                        return;
                    }
                }
                this.f199120f.setProgress(0.0d);
                this.f199120f.mo21221h();
                if (this.f199121g) {
                    ((C119157j) C119157j.f356862d).mo183895z(new C69202b(this.f199120f));
                }
            } else if (!this.f199120f.mo21224k(this.f199119e)) {
                Log.m105925i("MicroMsg.LuckyMoneyEnvelopePagLogic", "file == null：bubble，targetFilePath is %s", this.f199119e);
                if (C86013q1.m106450k(this.f199119e)) {
                    Log.m105925i("MicroMsg.LuckyMoneyEnvelopePagLogic", "delete：bubble targetFilePath is %s", this.f199119e);
                    C86013q1.m106447h(this.f199119e);
                }
            } else {
                this.f199120f.setProgress(0.0d);
                this.f199120f.mo21221h();
                C119179t tVar = C119157j.f356862d;
                C69201a aVar = new C69201a(this.f199120f);
                C119157j jVar = (C119157j) tVar;
                jVar.getClass();
                jVar.mo183892w(aVar, 150, false);
            }
        }
    }

    /* renamed from: a */
    public final void mo95351a(String str, String str2, C0000n0 n0Var, C75142u0.C75149e eVar) {
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (!z) {
                if (C86013q1.m106450k(str2)) {
                    Log.m105918d("MicroMsg.LuckyMoneyEnvelopePagLogic", "fileExist，do not download");
                    if (eVar != null) {
                        eVar.mo95346a(new C75142u0.C75143a.C75145b(str2));
                        return;
                    }
                    return;
                } else if (n0Var != null) {
                    C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C69199a(str, str2, eVar, (C15601d<? super C69199a>) null), 3, (Object) null);
                    return;
                } else {
                    return;
                }
            }
        }
        if (eVar != null) {
            C75142u0.f221103a.getClass();
            eVar.mo95346a(new C75142u0.C75143a.C75144a(C75142u0.f221108f));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00db  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo95352b(te3.C77994sf2 r9, int r10, a14.C0000n0 r11, com.tencent.p014mm.wallet_core.model.C75142u0.C75149e r12) {
        /*
            r8 = this;
            java.lang.String r0 = "callback"
            gy3.C87412m.m108594g(r12, r0)
            java.lang.String r0 = "MicroMsg.LuckyMoneyEnvelopePagLogic"
            if (r9 != 0) goto L_0x001e
            java.lang.String r9 = "hbEnvelopSource is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r9)
            com.tencent.mm.wallet_core.model.u0$a$a r9 = new com.tencent.mm.wallet_core.model.u0$a$a
            com.tencent.mm.wallet_core.model.u0 r10 = com.tencent.p014mm.wallet_core.model.C75142u0.f221103a
            r10.getClass()
            int r10 = com.tencent.p014mm.wallet_core.model.C75142u0.f221108f
            r9.<init>(r10)
            r12.mo95346a(r9)
            return
        L_0x001e:
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r4 = 0
            r2[r4] = r3
            int r3 = r9.f228201e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 1
            r2[r5] = r3
            java.lang.String r3 = "[get luckymoney pag resource] type : %s, subtype：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r2)
            int r2 = r9.f228201e
            if (r2 <= 0) goto L_0x00f1
            java.lang.String r3 = com.tencent.p014mm.plugin.luckymoney.model.C69266u0.m81635d(r2)
            com.tencent.mm.plugin.luckymoney.model.w0 r6 = new com.tencent.mm.plugin.luckymoney.model.w0
            r6.<init>()
            r6.field_subtype = r2
            g32.b r2 = g32.C75846b.zx0()
            nr3.g<com.tencent.mm.plugin.luckymoney.model.x0> r2 = r2.f222492j
            java.lang.Object r2 = r2.mo59825a()
            com.tencent.mm.plugin.luckymoney.model.x0 r2 = (com.tencent.p014mm.plugin.luckymoney.model.C30170x0) r2
            java.lang.String[] r7 = new java.lang.String[r4]
            boolean r2 = r2.get(r6, (java.lang.String[]) r7)
            java.lang.String r6 = ""
            if (r2 == 0) goto L_0x00ad
            if (r10 == 0) goto L_0x009b
            if (r10 == r5) goto L_0x0089
            if (r10 == r1) goto L_0x0077
            r1 = 3
            if (r10 == r1) goto L_0x0065
            goto L_0x00ad
        L_0x0065:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = "minilogo.pag"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L_0x00ae
        L_0x0077:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = "detail.pag"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L_0x00ae
        L_0x0089:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = "cover.pag"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L_0x00ae
        L_0x009b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = "bubble.pag"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L_0x00ae
        L_0x00ad:
            r1 = r6
        L_0x00ae:
            int r2 = r1.length()
            if (r2 != 0) goto L_0x00b6
            r2 = 1
            goto L_0x00b7
        L_0x00b6:
            r2 = 0
        L_0x00b7:
            if (r2 != 0) goto L_0x00c0
            boolean r2 = com.tencent.p014mm.vfs.C86013q1.m106450k(r1)
            if (r2 == 0) goto L_0x00c0
            r6 = r1
        L_0x00c0:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r1[r4] = r6
            java.lang.String r2 = "[luckymoney pag resource] get local result-path is：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r2, r1)
            int r1 = r6.length()
            if (r1 != 0) goto L_0x00d0
            r4 = 1
        L_0x00d0:
            if (r4 != 0) goto L_0x00db
            com.tencent.mm.wallet_core.model.u0$a$b r9 = new com.tencent.mm.wallet_core.model.u0$a$b
            r9.<init>(r6)
            r12.mo95346a(r9)
            goto L_0x00f9
        L_0x00db:
            java.lang.String r1 = "[luckymoney pag resource] use local failed，try use net"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.lang.Class<fp.e> r0 = p523fp.C32147e.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            fp.e r0 = (p523fp.C32147e) r0
            r1 = 58
            r0.Yi0(r1)
            r8.mo95354d(r9, r10, r11, r12)
            goto L_0x00f9
        L_0x00f1:
            java.lang.String r1 = "[luckymoney pag resource] use net instant"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
            r8.mo95354d(r9, r10, r11, r12)
        L_0x00f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.model.C69198d0.mo95352b(te3.sf2, int, a14.n0, com.tencent.mm.wallet_core.model.u0$e):void");
    }

    /* renamed from: c */
    public final String mo95353c(String str, String str2) {
        boolean z = false;
        if (str == null || str.length() == 0) {
            return "";
        }
        if (str2 == null || str2.length() == 0) {
            z = true;
        }
        if (z) {
            return "";
        }
        String str3 = f199108b;
        if (!C86013q1.m106450k(str3)) {
            C86013q1.m106461v(str3);
        }
        if (!C86013q1.m106450k(str3 + str2)) {
            C86013q1.m106461v(str3 + str2);
        }
        return str3 + str2 + "MMPag_LuckyMoney_" + MD5Util.getMD5String(str) + f199113g;
    }

    /* renamed from: d */
    public final void mo95354d(C77994sf2 sf22, int i, C0000n0 n0Var, C75142u0.C75149e eVar) {
        String str;
        C87412m.m108594g(sf22, "hbEnvelopSource");
        Log.m105919d("MicroMsg.LuckyMoneyEnvelopePagLogic", "[luckymoney pag resource] use net: %s", Integer.valueOf(i));
        C77999tf2 tf22 = sf22.f228203g;
        if (tf22 == null) {
            Log.m105918d("MicroMsg.LuckyMoneyEnvelopePagLogic", "hbEnvelopSource.sourceObject == null");
            if (eVar != null) {
                C75142u0.f221103a.getClass();
                eVar.mo95346a(new C75142u0.C75143a.C75144a(C75142u0.f221108f));
                return;
            }
            return;
        }
        String str2 = null;
        if (i == 0) {
            str2 = tf22.f228259w;
            str = mo95353c(str2, f199109c);
        } else if (i == 1) {
            str2 = tf22.f228260x;
            str = mo95353c(str2, f199111e);
        } else if (i == 2) {
            str2 = tf22.f228261y;
            str = mo95353c(str2, f199112f);
        } else if (i != 3) {
            str = null;
        } else {
            str2 = tf22.f228258v;
            str = mo95353c(str2, f199110d);
        }
        mo95351a(str2, str, n0Var, eVar);
    }

    /* renamed from: e */
    public final void mo95355e(int i, String str, ListScrollPAGView listScrollPAGView) {
        C87412m.m108594g(listScrollPAGView, "pagView");
        mo95356f(i, str, listScrollPAGView, true);
    }

    /* renamed from: f */
    public final void mo95356f(int i, String str, ListScrollPAGView listScrollPAGView, boolean z) {
        C87412m.m108594g(listScrollPAGView, "pagView");
        if (!(str == null || str.length() == 0)) {
            listScrollPAGView.mo21226m();
            ((C119157j) C119157j.f356862d).mo183875f(new C69200b(i, str, listScrollPAGView, z));
        }
    }

    /* renamed from: g */
    public final void mo95357g(int i, String str, PAGView pAGView) {
        C87412m.m108594g(pAGView, "pagView");
        if (!(str == null || str.length() == 0)) {
            pAGView.stop();
            ((C119157j) C119157j.f356862d).mo183875f(new C69211f0(i, str, pAGView, true));
        }
    }
}

package nj2;

import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import ak2.C54119a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.ringtone.p100ui.RingtoneSelectUI;
import com.tencent.p014mm.plugin.ringtone.p100ui.RingtoneSettingsUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import di3.C86301e;
import ei3.C86522b;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import oj2.C110053a;
import pu0.C110248b;
import qy2.C63349b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import uz2.C65489g0;
import wj2.C53183e;
import wj2.C66129b;
import wj2.C66130c;
import wj2.C66131d;
import wj2.C66132f;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C66704d;
import yx3.C91590f;
import zj2.C66857b;
import zj2.C66862f;
import zj2.C66864g;
import zj2.C66866h;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: nj2.g */
public final class C61759g extends C86301e implements C109749c {

    /* renamed from: f */
    public static final C61760a f175551f = new C61760a((C8480h) null);

    /* renamed from: d */
    public final C13601g f175552d = C36568h.m40985a(C34858b.f93642d);

    /* renamed from: e */
    public C54119a f175553e;

    /* renamed from: nj2.g$b */
    public static final class C34858b extends C87413o implements C32224a<C66862f> {

        /* renamed from: d */
        public static final C34858b f93642d = new C34858b();

        public C34858b() {
            super(0);
        }

        public Object invoke() {
            return new C66862f();
        }
    }

    /* renamed from: nj2.g$a */
    public static final class C61760a {

        @C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.PluginRingtone$Companion", mo125469f = "PluginRingtone.kt", mo125470l = {322, 341, 348, 351}, mo125471m = "setRingtone")
        /* renamed from: nj2.g$a$a */
        public static final class C61761a extends C66704d {

            /* renamed from: d */
            public Object f175554d;

            /* renamed from: e */
            public Object f175555e;

            /* renamed from: f */
            public Object f175556f;

            /* renamed from: g */
            public Object f175557g;

            /* renamed from: h */
            public Object f175558h;

            /* renamed from: i */
            public boolean f175559i;

            /* renamed from: j */
            public /* synthetic */ Object f175560j;

            /* renamed from: n */
            public final /* synthetic */ C61760a f175561n;

            /* renamed from: o */
            public int f175562o;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C61761a(C61760a aVar, C15601d<? super C61761a> dVar) {
                super(dVar);
                this.f175561n = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f175560j = obj;
                this.f175562o |= Integer.MIN_VALUE;
                return this.f175561n.mo86682f((C66132f) null, (String) null, false, (String) null, this);
            }
        }

        /* renamed from: nj2.g$a$b */
        public static final class C61762b implements C63349b0 {

            /* renamed from: a */
            public static final C61762b f175563a = new C61762b();

            public final void onFinishAction(int i, String str, C65489g0 g0Var) {
                Log.m105924i("MicroMsg.PluginRingtone", "setStatus result:" + i + ", errMsg:" + str);
            }
        }

        public C61760a(C8480h hVar) {
        }

        /* renamed from: b */
        public static /* synthetic */ void m72462b(C61760a aVar, Activity activity, int i, String str, int i2, boolean z, C66132f fVar, int i3, Object obj) {
            boolean z2 = (i3 & 16) != 0 ? false : z;
            if ((i3 & 32) != 0) {
                fVar = null;
            }
            aVar.mo86678a(activity, i, str, i2, z2, fVar);
        }

        /* renamed from: a */
        public final void mo86678a(Activity activity, int i, String str, int i2, boolean z, C66132f fVar) {
            C87412m.m108594g(activity, "context");
            C87412m.m108594g(str, "username");
            Intent intent = new Intent();
            intent.putExtra("ringtone_caller", i);
            intent.putExtra("ringtone_channel", i2);
            intent.putExtra("exclusvie_name", str);
            intent.putExtra("ringtone_select_ringtone", fVar != null ? fVar.mo90183n() : null);
            intent.setClass(activity, RingtoneSelectUI.class);
            if (z) {
                intent.addFlags(TPMediaCodecProfileLevel.HEVCHighTierLevel62);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(activity, aVar.mo10232b(), "com/tencent/mm/plugin/ringtone/PluginRingtone$Companion", "enterRingtoneSelectUI", "(Landroid/app/Activity;ILjava/lang/String;IZLcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(activity, "com/tencent/mm/plugin/ringtone/PluginRingtone$Companion", "enterRingtoneSelectUI", "(Landroid/app/Activity;ILjava/lang/String;IZLcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            }
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar2.mo10233c(5);
            aVar2.mo10233c(intent);
            C117292a.m165364j(activity, aVar2.mo10232b(), "com/tencent/mm/plugin/ringtone/PluginRingtone$Companion", "enterRingtoneSelectUI", "(Landroid/app/Activity;ILjava/lang/String;IZLcom/tencent/mm/plugin/ringtone/params/TPMediaInfoDesc;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }

        /* renamed from: c */
        public final void mo86679c(Context context, int i) {
            C87412m.m108594g(context, "context");
            Intent intent = new Intent();
            intent.putExtra("ringtone_channel", i);
            intent.setClass(context, RingtoneSettingsUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(context, aVar.mo10232b(), "com/tencent/mm/plugin/ringtone/PluginRingtone$Companion", "enterRingtoneSettingUI", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context, "com/tencent/mm/plugin/ringtone/PluginRingtone$Companion", "enterRingtoneSettingUI", "(Landroid/content/Context;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
            r10 = r0.f188984e;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo86680d(int r20, int r21, ve3.C65684l0 r22, int r23, int r24, java.lang.String r25, java.lang.String r26, wx3.C15601d<? super q40.C62580c<ve3.C52864y0>> r27) {
            /*
                r19 = this;
                r0 = r22
                int r1 = r0.f189015d
                r2 = 0
                r3 = 2
                r4 = 0
                if (r1 != r3) goto L_0x003c
                ve3.f r0 = r0.f189019h
                if (r0 == 0) goto L_0x0036
                long r8 = r0.f188983d
                if (r0 == 0) goto L_0x0030
                java.lang.String r10 = r0.f188984e
                if (r10 != 0) goto L_0x0016
                goto L_0x0030
            L_0x0016:
                yj2.a r5 = yj2.C66655a.f191654a
                r14 = 0
                r17 = 128(0x80, float:1.794E-43)
                r18 = 0
                r6 = r20
                r7 = r21
                r11 = r23
                r12 = r24
                r13 = r25
                r15 = r26
                r16 = r27
                java.lang.Object r0 = yj2.C66655a.m78640c(r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                return r0
            L_0x0030:
                q40.c r0 = new q40.c
                r0.<init>(r2, r4, r3, r4)
                return r0
            L_0x0036:
                q40.c r0 = new q40.c
                r0.<init>(r2, r4, r3, r4)
                return r0
            L_0x003c:
                ve3.e0 r0 = r0.f189018g
                if (r0 == 0) goto L_0x005b
                int r14 = r0.f188982d
                yj2.a r5 = yj2.C66655a.f191654a
                r8 = 0
                java.lang.String r10 = ""
                r6 = r20
                r7 = r21
                r11 = r23
                r12 = r24
                r13 = r25
                r15 = r26
                r16 = r27
                java.lang.Object r0 = r5.mo90707b(r6, r7, r8, r10, r11, r12, r13, r14, r15, r16)
                return r0
            L_0x005b:
                q40.c r0 = new q40.c
                r0.<init>(r2, r4, r3, r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: nj2.C61759g.C61760a.mo86680d(int, int, ve3.l0, int, int, java.lang.String, java.lang.String, wx3.d):java.lang.Object");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
            r11 = r0.f188984e;
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo86681e(int r18, int r19, ve3.C65684l0 r20, int r21, int r22, int r23, java.lang.String r24, wx3.C15601d<? super q40.C62580c<ve3.C52864y0>> r25) {
            /*
                r17 = this;
                r0 = r20
                int r1 = r0.f189015d
                r2 = 0
                r3 = 2
                r4 = 0
                if (r1 != r3) goto L_0x0038
                ve3.f r0 = r0.f189019h
                if (r0 == 0) goto L_0x0032
                long r9 = r0.f188983d
                if (r0 == 0) goto L_0x002c
                java.lang.String r11 = r0.f188984e
                if (r11 != 0) goto L_0x0016
                goto L_0x002c
            L_0x0016:
                yj2.a r5 = yj2.C66655a.f191654a
                r8 = 0
                r6 = r18
                r7 = r19
                r12 = r21
                r13 = r22
                r14 = r23
                r15 = r24
                r16 = r25
                java.lang.Object r0 = r5.mo90708d(r6, r7, r8, r9, r11, r12, r13, r14, r15, r16)
                return r0
            L_0x002c:
                q40.c r0 = new q40.c
                r0.<init>(r2, r4, r3, r4)
                return r0
            L_0x0032:
                q40.c r0 = new q40.c
                r0.<init>(r2, r4, r3, r4)
                return r0
            L_0x0038:
                ve3.e0 r0 = r0.f189018g
                if (r0 == 0) goto L_0x0057
                int r8 = r0.f188982d
                yj2.a r5 = yj2.C66655a.f191654a
                r9 = 0
                java.lang.String r11 = ""
                r6 = r18
                r7 = r19
                r12 = r21
                r13 = r22
                r14 = r23
                r15 = r24
                r16 = r25
                java.lang.Object r0 = r5.mo90708d(r6, r7, r8, r9, r11, r12, r13, r14, r15, r16)
                return r0
            L_0x0057:
                q40.c r0 = new q40.c
                r0.<init>(r2, r4, r3, r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: nj2.C61759g.C61760a.mo86681e(int, int, ve3.l0, int, int, int, java.lang.String, wx3.d):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x00a1  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0128  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0144  */
        /* JADX WARNING: Removed duplicated region for block: B:56:0x01a5 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x01a6  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x01b7  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x01d2  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x023d  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0258  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo86682f(wj2.C66132f r20, java.lang.String r21, boolean r22, java.lang.String r23, wx3.C15601d<? super java.lang.Boolean> r24) {
            /*
                r19 = this;
                r0 = r20
                r1 = r24
                boolean r2 = r1 instanceof nj2.C61759g.C61760a.C61761a
                if (r2 == 0) goto L_0x0019
                r2 = r1
                nj2.g$a$a r2 = (nj2.C61759g.C61760a.C61761a) r2
                int r3 = r2.f175562o
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                r5 = r3 & r4
                if (r5 == 0) goto L_0x0019
                int r3 = r3 - r4
                r2.f175562o = r3
                r3 = r19
                goto L_0x0020
            L_0x0019:
                nj2.g$a$a r2 = new nj2.g$a$a
                r3 = r19
                r2.<init>(r3, r1)
            L_0x0020:
                r12 = r2
                java.lang.Object r1 = r12.f175560j
                xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
                int r4 = r12.f175562o
                java.lang.String r13 = "MicroMsg.PluginRingtone"
                r5 = 3
                r6 = 4
                r14 = 0
                r15 = 1
                r11 = 2
                r10 = 0
                if (r4 == 0) goto L_0x00a1
                if (r4 == r15) goto L_0x0083
                if (r4 == r11) goto L_0x0063
                if (r4 == r5) goto L_0x0053
                if (r4 != r6) goto L_0x004b
                boolean r0 = r12.f175559i
                java.lang.Object r2 = r12.f175555e
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r4 = r12.f175554d
                wj2.f r4 = (wj2.C66132f) r4
                kotlin.ResultKt.throwOnFailure(r1)
                r16 = r14
                r14 = 0
                goto L_0x0236
            L_0x004b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0053:
                boolean r0 = r12.f175559i
                java.lang.Object r2 = r12.f175555e
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Object r4 = r12.f175554d
                wj2.f r4 = (wj2.C66132f) r4
                kotlin.ResultKt.throwOnFailure(r1)
                r14 = 0
                goto L_0x0201
            L_0x0063:
                boolean r0 = r12.f175559i
                java.lang.Object r4 = r12.f175558h
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Object r7 = r12.f175557g
                ve3.l0 r7 = (ve3.C65684l0) r7
                java.lang.Object r8 = r12.f175556f
                java.lang.String r8 = (java.lang.String) r8
                java.lang.Object r9 = r12.f175555e
                java.lang.String r9 = (java.lang.String) r9
                java.lang.Object r6 = r12.f175554d
                wj2.f r6 = (wj2.C66132f) r6
                kotlin.ResultKt.throwOnFailure(r1)
                r10 = r6
                r17 = r8
                r15 = r9
                r14 = 0
                goto L_0x01af
            L_0x0083:
                boolean r0 = r12.f175559i
                java.lang.Object r4 = r12.f175558h
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Object r6 = r12.f175557g
                ve3.l0 r6 = (ve3.C65684l0) r6
                java.lang.Object r7 = r12.f175556f
                java.lang.String r7 = (java.lang.String) r7
                java.lang.Object r8 = r12.f175555e
                java.lang.String r8 = (java.lang.String) r8
                java.lang.Object r9 = r12.f175554d
                wj2.f r9 = (wj2.C66132f) r9
                kotlin.ResultKt.throwOnFailure(r1)
                r10 = r0
                r5 = r7
                r0 = r9
                goto L_0x0124
            L_0x00a1:
                kotlin.ResultKt.throwOnFailure(r1)
                ve3.l0 r6 = new ve3.l0
                r6.<init>()
                r6.f189016e = r10
                long r7 = r0.f190080c
                int r1 = (int) r7
                r6.f189017f = r1
                com.tencent.mm.protocal.protobuf.FinderObject r1 = r0.f190081d
                if (r1 == 0) goto L_0x00c5
                ve3.f r1 = new ve3.f
                r1.<init>()
                java.lang.String r4 = r0.f190093p
                r1.f188984e = r4
                long r7 = r0.f190092o
                r1.f188983d = r7
                r6.f189019h = r1
                r6.f189015d = r11
            L_0x00c5:
                int r1 = r0.f190094q
                java.lang.Integer r4 = new java.lang.Integer
                r4.<init>(r1)
                int r1 = r4.intValue()
                if (r1 == 0) goto L_0x00d4
                r1 = 1
                goto L_0x00d5
            L_0x00d4:
                r1 = 0
            L_0x00d5:
                if (r1 == 0) goto L_0x00d8
                goto L_0x00d9
            L_0x00d8:
                r4 = r14
            L_0x00d9:
                if (r4 == 0) goto L_0x00eb
                r4.intValue()
                ve3.e0 r1 = new ve3.e0
                r1.<init>()
                int r4 = r0.f190094q
                r1.f188982d = r4
                r6.f189015d = r15
                r6.f189018g = r1
            L_0x00eb:
                java.lang.String r4 = eb0.C75592q0.m90789s()
                boolean r1 = r20.mo90179j()
                if (r1 == 0) goto L_0x0186
                long r7 = r0.f190092o
                wj2.f r1 = rj2.C63449b.m74791a(r7)
                if (r1 != 0) goto L_0x0166
                long r7 = r0.f190092o
                java.lang.String r1 = r0.f190093p
                r12.f175554d = r0
                r9 = r21
                r12.f175555e = r9
                r5 = r23
                r12.f175556f = r5
                r12.f175557g = r6
                r12.f175558h = r4
                r10 = r22
                r12.f175559i = r10
                r12.f175562o = r15
                a14.h0 r15 = a14.C53872d1.f151119c
                nj2.e r11 = new nj2.e
                r11.<init>(r7, r1, r14)
                java.lang.Object r1 = a14.C53895h.m60469g(r15, r11, r12)
                if (r1 != r2) goto L_0x0123
                return r2
            L_0x0123:
                r8 = r9
            L_0x0124:
                ve3.a0 r1 = (ve3.C52823a0) r1
                if (r1 != 0) goto L_0x0144
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "try get finder ring back detail fail "
                r1.append(r2)
                java.lang.String r0 = r0.mo90174e()
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                return r0
            L_0x0144:
                wj2.h$a r7 = wj2.C66135h.f190107E
                ve3.n0 r1 = r1.f147573d
                if (r1 == 0) goto L_0x0154
                ve3.g r9 = r1.f189022f
                if (r9 != 0) goto L_0x014f
                goto L_0x0154
            L_0x014f:
                wj2.f r1 = r7.mo90189e(r9, r1)
                goto L_0x0155
            L_0x0154:
                r1 = r14
            L_0x0155:
                if (r1 != 0) goto L_0x0160
                java.lang.String r0 = "try get TPMediaInfoDesc fail null"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                return r0
            L_0x0160:
                long r14 = r1.f190092o
                rj2.C63449b.m74792c(r14, r1)
                goto L_0x016d
            L_0x0166:
                r9 = r21
                r10 = r22
                r5 = r23
                r8 = r9
            L_0x016d:
                java.lang.String r7 = r1.f190086i
                r0.getClass()
                java.lang.String r9 = "<set-?>"
                gy3.C87412m.m108594g(r7, r9)
                r0.f190086i = r7
                java.lang.String r7 = r1.f190085h
                r0.mo90181l(r7)
                java.lang.String r1 = r1.f190087j
                gy3.C87412m.m108594g(r1, r9)
                r0.f190087j = r1
                goto L_0x018d
            L_0x0186:
                r9 = r21
                r10 = r22
                r5 = r23
                r8 = r9
            L_0x018d:
                nj2.p r1 = nj2.C61768p.f175586a
                r12.f175554d = r0
                r12.f175555e = r8
                r12.f175556f = r5
                r12.f175557g = r6
                r12.f175558h = r4
                r12.f175559i = r10
                r11 = 2
                r12.f175562o = r11
                r14 = 0
                java.lang.Object r1 = r1.mo86689a(r8, r0, r14, r12)
                if (r1 != r2) goto L_0x01a6
                return r2
            L_0x01a6:
                r17 = r5
                r7 = r6
                r15 = r8
                r18 = r10
                r10 = r0
                r0 = r18
            L_0x01af:
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 != 0) goto L_0x01d2
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "cacheRingtone step1 fail "
                r0.append(r1)
                java.lang.String r1 = r10.mo90174e()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                return r0
            L_0x01d2:
                boolean r1 = gy3.C87412m.m108589b(r15, r4)
                if (r1 == 0) goto L_0x020b
                nj2.g$a r4 = nj2.C61759g.f175551f
                r5 = 1
                r6 = 1
                int r8 = r7.f189016e
                int r9 = r7.f189017f
                r12.f175554d = r10
                r12.f175555e = r15
                r1 = 0
                r12.f175556f = r1
                r12.f175557g = r1
                r12.f175558h = r1
                r12.f175559i = r0
                r1 = 3
                r12.f175562o = r1
                r1 = r10
                r10 = r0
                r11 = r17
                java.lang.Object r4 = r4.mo86681e(r5, r6, r7, r8, r9, r10, r11, r12)
                if (r4 != r2) goto L_0x01fb
                return r2
            L_0x01fb:
                r2 = r15
                r18 = r4
                r4 = r1
                r1 = r18
            L_0x0201:
                q40.c r1 = (q40.C62580c) r1
                r16 = 0
            L_0x0205:
                r18 = r4
                r4 = r2
                r2 = r18
                goto L_0x0239
            L_0x020b:
                r1 = r10
                nj2.g$a r4 = nj2.C61759g.f175551f
                r5 = 1
                r6 = 3
                int r8 = r7.f189016e
                int r9 = r7.f189017f
                r12.f175554d = r1
                r12.f175555e = r15
                r11 = 0
                r12.f175556f = r11
                r12.f175557g = r11
                r12.f175558h = r11
                r12.f175559i = r0
                r10 = 4
                r12.f175562o = r10
                r10 = r15
                r16 = r11
                r11 = r17
                java.lang.Object r4 = r4.mo86680d(r5, r6, r7, r8, r9, r10, r11, r12)
                if (r4 != r2) goto L_0x0230
                return r2
            L_0x0230:
                r2 = r15
                r18 = r4
                r4 = r1
                r1 = r18
            L_0x0236:
                q40.c r1 = (q40.C62580c) r1
                goto L_0x0205
            L_0x0239:
                boolean r5 = r1.f177733a
                if (r5 != 0) goto L_0x0258
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "cacheRingtone step2 fail "
                r0.append(r1)
                java.lang.String r1 = r2.mo90174e()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r13, r0)
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                return r0
            L_0x0258:
                nj2.C61768p.m72484l(r4, r2)
                r6 = 0
                r8 = 4
                r9 = 0
                r5 = r2
                nj2.C61768p.m72486n(r4, r5, r6, r8, r9)
                if (r0 == 0) goto L_0x0321
                android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                java.lang.String r4 = "getContext()"
                gy3.C87412m.m108593f(r0, r4)
                Response r1 = r1.f177734b
                ve3.y0 r1 = (ve3.C52864y0) r1
                if (r1 == 0) goto L_0x027c
                ve3.r0 r1 = r1.f147660d
                if (r1 == 0) goto L_0x027c
                java.lang.String r1 = r1.f147624d
                if (r1 != 0) goto L_0x027e
            L_0x027c:
                java.lang.String r1 = ""
            L_0x027e:
                nj2.g$a$b r4 = nj2.C61759g.C61760a.C61762b.f175563a
                java.lang.String r5 = "ringtoneInfo"
                gy3.C87412m.m108594g(r2, r5)
                qy2.z$a r5 = new qy2.z$a
                r5.<init>()
                java.lang.String r6 = "1071_ls"
                r5.mo88254a(r6)
                java.lang.String r6 = r2.f190086i
                r5.mo88259f(r6)
                java.lang.String r6 = "http://wxapp.tc.qq.com/258/20304/stodownload?m=bb31772544a871fbd29038a10658ad70&filekey=30340201010420301e02020102040253480410bb31772544a871fbd29038a10658ad7002021c9b040d00000004627466730000000131&hy=SH&storeid=32303232303330313137313334353030303761626166303030303030303037636638353130393030303030313032&bizid=1023"
                r5.mo88257d(r6)
                java.lang.String r6 = "ringtone@inner"
                r5.mo88258e(r6)
                r5.mo88260g(r1)
                qy2.z r1 = r5.f179715a
                r6 = 1
                r1.f229413u = r6
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                uz2.a0 r7 = new uz2.a0
                r7.<init>()
                java.lang.String r8 = "14"
                r7.f188439d = r8
                com.tencent.mm.protocal.protobuf.FinderObject r8 = r2.f190081d
                if (r8 == 0) goto L_0x02bf
                byte[] r8 = r8.toByteArray()
                goto L_0x02c1
            L_0x02bf:
                r8 = r16
            L_0x02c1:
                java.lang.String r8 = android.util.Base64.encodeToString(r8, r14)
                r7.f188441f = r8
                uz2.j1 r8 = new uz2.j1
                r8.<init>()
                boolean r9 = r2.mo90179j()
                if (r9 == 0) goto L_0x02d4
                r15 = 2
                goto L_0x02d5
            L_0x02d4:
                r15 = 1
            L_0x02d5:
                r8.f147146d = r15
                uz2.k1 r6 = new uz2.k1
                r6.<init>()
                int r9 = r2.f190094q
                r6.f147153d = r9
                r8.f147147e = r6
                uz2.h1 r6 = new uz2.h1
                r6.<init>()
                long r9 = r2.f190092o
                r6.f147133d = r9
                java.lang.String r2 = r2.f190093p
                r6.f147134e = r2
                r8.f147148f = r6
                byte[] r2 = r8.toByteArray()
                r6 = 2
                java.lang.String r2 = android.util.Base64.encodeToString(r2, r6)
                r7.f188442g = r2
                r1.add(r7)
                int r2 = qy2.C63347a.f179714a
                uz2.a0 r2 = new uz2.a0
                r2.<init>()
                java.lang.String r6 = "3"
                r2.f188439d = r6
                java.lang.String r6 = "https://support.weixin.qq.com/security/readtemplate?t=w_security_center_website/upgrade&scene=1#wechat_redirect"
                r2.f188441f = r6
                r1.add(r2)
                r5.mo88255b(r1)
                qy2.z r1 = r5.f179715a
                java.lang.Class<yy.h> r2 = p773yy.C66708h.class
                di3.d r2 = di3.C86312j.m106911c(r2)
                yy.h r2 = (p773yy.C66708h) r2
                r2.Y00(r0, r1, r4)
            L_0x0321:
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: nj2.C61759g.C61760a.mo86682f(wj2.f, java.lang.String, boolean, java.lang.String, wx3.d):java.lang.Object");
        }
    }

    public void Ax0(String str, boolean z, long j) {
        C66862f vx02 = vx0();
        if (vx02 != null) {
            Log.m105924i("MicroMsg.RingtoneServiceHelper", "updateRingtoneInfo name:" + str + ", isOutCall:" + z + ", seekStartMs:" + j);
            vx02.f192049a = vx02.f192052d;
            vx02.f192052d = null;
            vx02.f192054f = j;
            vx02.f192055g = z;
            vx02.f192057i = -1.0f;
            C53973z1 z1Var = vx02.f192058j;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            vx02.f192058j = C53895h.m60466d(vx02.f192059k, (C66212f) null, (C53934p0) null, new C66866h(vx02, str, z, (C15601d<? super C66866h>) null), 3, (Object) null);
        }
    }

    /* renamed from: Px */
    public int mo86664Px() {
        C66862f vx02 = vx0();
        if (vx02 == null) {
            return 5;
        }
        C66130c cVar = vx02.f192053e;
        if (cVar != null) {
            return cVar.f190069b;
        }
        C66857b bVar = vx02.f192051c;
        if (bVar != null) {
            return bVar.mo36973c();
        }
        return 3;
    }

    /* renamed from: QT */
    public void mo86665QT(boolean z) {
        C66862f vx02 = vx0();
        if (vx02 != null) {
            vx02.mo90867f(z);
        }
    }

    /* renamed from: SI */
    public int mo86666SI() {
        C66862f vx02 = vx0();
        if (vx02 == null) {
            return 9;
        }
        C66857b bVar = vx02.f192051c;
        boolean z = true;
        if (bVar == null || !bVar.mo36974d()) {
            z = false;
        }
        return z ? 5 : 9;
    }

    /* renamed from: W */
    public boolean mo86667W() {
        C66862f vx02 = vx0();
        if (vx02 == null) {
            return true;
        }
        vx02.mo90865d(C66129b.PAUSE_ACTION);
        return true;
    }

    public void Yb0(Context context, int i) {
        C87412m.m108594g(context, "context");
        f175551f.mo86679c(context, i);
    }

    /* renamed from: Z */
    public boolean mo86669Z() {
        C66862f vx02 = vx0();
        if (vx02 == null) {
            return true;
        }
        vx02.mo90865d(C66129b.CONTINUE_ACTION);
        return true;
    }

    public C110053a i00() {
        int i;
        C66862f vx02 = vx0();
        if (vx02 == null) {
            return null;
        }
        vx02.f192068t = System.currentTimeMillis() - vx02.f192066r;
        C110248b.C110249a aVar = C110248b.f329777h;
        if (aVar.mo161657b().mo157510m()) {
            i = aVar.mo161658c();
        } else {
            C66130c cVar = vx02.f192053e;
            i = cVar != null ? cVar.f190069b : 0;
        }
        C110053a aVar2 = new C110053a(vx02.f192072x == C53183e.EXCLUSIVE, vx02.f192068t, vx02.f192067s, String.valueOf(vx02.f192045A), vx02.f192073y, vx02.f192069u, vx02.f192048D, vx02.f192047C, aVar.mo161657b().mo157506c(i), i, vx02.f192074z, !C87412m.m108589b(aVar.mo161656a(), "normal"), vx02.f192046B, vx02.f192071w, vx02.f192070v);
        vx02.f192066r = 0;
        vx02.f192068t = 0;
        vx02.f192069u = true;
        vx02.f192070v = "";
        vx02.f192072x = C53183e.UNKNOWN;
        vx02.f192073y = "";
        vx02.f192045A = 0;
        vx02.f192048D = false;
        vx02.f192074z = 0;
        return aVar2;
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        super.onAccountInitialized(context);
        C61768p.m72483k();
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        super.onAccountReleased(context);
        C53973z1 z1Var = C61768p.f175593h;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        C61768p.f175593h = null;
    }

    public void setMute(boolean z) {
        C66857b bVar;
        C66862f vx02 = vx0();
        if (vx02 != null && (bVar = vx02.f192051c) != null) {
            bVar.mo36979i(z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if ((r0 != null ? r0.f151967b : null) != r3) goto L_0x0012;
     */
    /* renamed from: vo */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo86672vo(nj2.C109749c.C61756a r3, android.os.Bundle r4) {
        /*
            r2 = this;
            java.lang.String r0 = "params"
            gy3.C87412m.m108594g(r4, r0)
            ak2.a r0 = r2.f175553e
            if (r0 == 0) goto L_0x0012
            if (r0 == 0) goto L_0x000f
            nj2.c$a r0 = r0.f151967b
            goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            if (r0 == r3) goto L_0x0035
        L_0x0012:
            nj2.c$a r0 = nj2.C109749c.C61756a.VOIP
            if (r3 != r0) goto L_0x001e
            ak2.c r3 = new ak2.c
            r3.<init>(r2)
            r2.f175553e = r3
            goto L_0x0035
        L_0x001e:
            nj2.c$a r0 = nj2.C109749c.C61756a.MULTITALK
            if (r3 != r0) goto L_0x002a
            ak2.b r3 = new ak2.b
            r3.<init>(r2)
            r2.f175553e = r3
            goto L_0x0035
        L_0x002a:
            nj2.c$a r0 = nj2.C109749c.C61756a.WMPF_CALL_IN
            if (r3 != r0) goto L_0x0035
            ak2.d r3 = new ak2.d
            r3.<init>(r2)
            r2.f175553e = r3
        L_0x0035:
            ak2.a r3 = r2.f175553e
            r0 = 0
            if (r3 == 0) goto L_0x0048
            java.lang.String r1 = "scene"
            java.lang.String r1 = r4.getString(r1)
            if (r1 == 0) goto L_0x0048
            boolean r3 = r3.mo74909b(r1, r4)
            r0 = r3
        L_0x0048:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nj2.C61759g.mo86672vo(nj2.c$a, android.os.Bundle):boolean");
    }

    public final C66862f vx0() {
        return (C66862f) ((C36570n) this.f175552d).getValue();
    }

    public void wx0(int i) {
        if (vx0() != null && C61767o.m72472h()) {
            C110248b.C110249a aVar = C110248b.f329777h;
            if (i != aVar.mo161661f()) {
                Log.m105925i("MicroMsg.RingtoneServiceHelper", "set AudioManager mode: %s", Integer.valueOf(i));
                aVar.mo161669n(i);
            }
        }
    }

    public void xx0(C66131d dVar, int i, boolean z) {
        int i2;
        C87412m.m108594g(dVar, "soundType");
        C66862f vx02 = vx0();
        if (vx02 != null) {
            vx02.f192053e = new C66130c(dVar, i, z);
            C110248b.C110249a aVar = C110248b.f329777h;
            if (aVar.mo161657b().mo157510m()) {
                i2 = aVar.mo161658c();
            } else {
                C66130c cVar = vx02.f192053e;
                i2 = cVar != null ? cVar.f190069b : 0;
            }
            vx02.f192074z = aVar.mo161657b().mo157506c(i2);
        }
    }

    public boolean yx0(boolean z) {
        C66862f vx02;
        String a = C110248b.f329777h.mo161656a();
        if ((C87412m.m108589b(a, "vibrate") || C87412m.m108589b(a, "normal")) && (vx02 = vx0()) != null) {
            Log.m105924i("MicroMsg.RingtoneServiceHelper", "updateVibrateInfo");
            vx02.f192065q = true;
        }
        return true;
    }

    public boolean zx0(String str, boolean z) {
        C66862f vx02;
        C87412m.m108594g(str, "name");
        String a = C110248b.f329777h.mo161656a();
        if ((C87412m.m108589b(a, "vibrate") || C87412m.m108589b(a, "normal")) && (vx02 = vx0()) != null) {
            Log.m105924i("MicroMsg.RingtoneServiceHelper", "updateRingtoneInfo name:" + str + ", isOutCall:" + z + ", seekStartMs:" + vx02.f192054f);
            vx02.f192049a = vx02.f192052d;
            vx02.f192052d = null;
            vx02.f192055g = z;
            vx02.f192057i = -1.0f;
            C53973z1 z1Var = vx02.f192058j;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            vx02.f192058j = C53895h.m60466d(vx02.f192059k, (C66212f) null, (C53934p0) null, new C66864g(vx02, str, z, (C15601d<? super C66864g>) null), 3, (Object) null);
        }
        return true;
    }
}

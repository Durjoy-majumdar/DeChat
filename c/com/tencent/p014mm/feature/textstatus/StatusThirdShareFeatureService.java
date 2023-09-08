package com.tencent.p014mm.feature.textstatus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.ResultReceiver;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusPreviewFinderActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86301e;
import ei3.C86522b;
import gy3.C8480h;
import gy3.C87412m;
import hz2.C60235a;
import j20.C117292a;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import kotlin.Metadata;
import p773yy.C66708h;
import qy2.C63349b0;
import qy2.C77446d0;
import qy2.C77456r;
import qy2.C77459z;
import uz2.C52678e0;
import uz2.C52718u;
import uz2.C65488a0;
import xz2.C79019r;
import z04.C112551y;

@C86522b(onProcess = {C80625v0.MATCH_MM})
@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/feature/textstatus/StatusThirdShareFeatureService;", "Ldi3/e;", "Lyy/h;", "<init>", "()V", "Companion", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService */
public final class StatusThirdShareFeatureService extends C86301e implements C66708h {

    @Metadata(mo182093d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/feature/textstatus/StatusThirdShareFeatureService$Companion;", "", "()V", "TAG", "", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C8480h hVar) {
            this();
        }
    }

    static {
        new Companion((C8480h) null);
    }

    public boolean L20(Context context, C77459z zVar) {
        return xx0(context, zVar, (ResultReceiver) null);
    }

    public void M20(String str) {
        if (str != null) {
            C77456r a = C79019r.f232026a.mo108986a(str);
            if (a != null) {
                a.release();
            }
            C79019r.f232027b.remove(str);
        }
    }

    public boolean Ph0(Context context, C77459z zVar, ResultReceiver resultReceiver) {
        return xx0(context, zVar, resultReceiver);
    }

    public boolean Y00(Context context, C77459z zVar, C63349b0 b0Var) {
        return xx0(context, zVar, new C55199xf58669db(b0Var));
    }

    public void be0(String str, C77456r rVar) {
        if (str != null && rVar != null) {
            C79019r rVar2 = C79019r.f232026a;
            C79019r.f232027b.put(str, rVar);
        }
    }

    /* renamed from: iL */
    public boolean mo90743iL(Activity activity, int i, C77459z zVar) {
        if (activity == null) {
            return false;
        }
        wx0(zVar);
        if (zVar != null) {
            vx0(zVar);
        }
        C77446d0.f225875a.mo107616c(activity, zVar, i);
        return true;
    }

    /* renamed from: pe */
    public void mo90744pe(Activity activity, Intent intent, int i) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(intent, "intent");
        intent.setClass(activity, TextStatusPreviewFinderActivity.class);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(Integer.valueOf(i));
        aVar.mo10233c(intent);
        C117292a.m165364j(activity, aVar.mo10232b(), "com/tencent/mm/feature/textstatus/StatusThirdShareFeatureService", "goTextStatusPreviewFinderUIForResult", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0091  */
    /* renamed from: uq */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qy2.C101318t mo90745uq(android.content.Context r10, qy2.C77444c0 r11, qy2.C63349b0 r12) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "executeTextStatusAction() called with: context = "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ", param = "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = ", _callback = "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.TextStatus.TextStatusActionService"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            xz2.u r0 = new xz2.u
            r0.<init>(r12)
            r12 = 0
            r1 = 1
            if (r10 == 0) goto L_0x014b
            if (r11 != 0) goto L_0x0033
            goto L_0x014b
        L_0x0033:
            java.lang.String r2 = r11.f229419d
            r3 = 0
            if (r2 == 0) goto L_0x0041
            boolean r2 = z04.C112551y.m153811k(r2)
            if (r2 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r2 = 0
            goto L_0x0042
        L_0x0041:
            r2 = 1
        L_0x0042:
            if (r2 == 0) goto L_0x006f
            uz2.l r2 = r11.f229420e
            if (r2 == 0) goto L_0x005a
            java.lang.String r4 = r2.f147154d
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x005a
            java.lang.String r2 = r2.f147155e
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x005a
            r2 = 1
            goto L_0x005b
        L_0x005a:
            r2 = 0
        L_0x005b:
            if (r2 != 0) goto L_0x006f
            java.lang.String r2 = r11.f229426n
            if (r2 == 0) goto L_0x006a
            boolean r2 = z04.C112551y.m153811k(r2)
            if (r2 == 0) goto L_0x0068
            goto L_0x006a
        L_0x0068:
            r2 = 0
            goto L_0x006b
        L_0x006a:
            r2 = 1
        L_0x006b:
            if (r2 == 0) goto L_0x006f
            r2 = 0
            goto L_0x0070
        L_0x006f:
            r2 = 1
        L_0x0070:
            java.lang.String r4 = r11.f229421f
            if (r4 == 0) goto L_0x007d
            boolean r4 = z04.C112551y.m153811k(r4)
            if (r4 == 0) goto L_0x007b
            goto L_0x007d
        L_0x007b:
            r4 = 0
            goto L_0x007e
        L_0x007d:
            r4 = 1
        L_0x007e:
            r4 = r4 ^ r1
            if (r2 != 0) goto L_0x0085
            if (r4 != 0) goto L_0x0085
            r2 = 0
            goto L_0x0086
        L_0x0085:
            r2 = 1
        L_0x0086:
            if (r2 != 0) goto L_0x0091
            java.lang.String r10 = "param invalid"
            r0.onFinishAction(r1, r10, r12)
            qy2.t r10 = xz2.C79021t.f232028a
            goto L_0x0152
        L_0x0091:
            com.tencent.mm.plugin.textstatus.third.TextStatusActionTask r2 = new com.tencent.mm.plugin.textstatus.third.TextStatusActionTask
            r2.<init>(r10, r11, r0)
            lz2.d r10 = new lz2.d
            qy2.c0 r11 = r2.f206676d
            java.lang.String r0 = r11.f229421f
            java.lang.String r11 = r11.f229419d
            if (r0 == 0) goto L_0x00a9
            boolean r4 = z04.C112551y.m153811k(r0)
            if (r4 == 0) goto L_0x00a7
            goto L_0x00a9
        L_0x00a7:
            r4 = 0
            goto L_0x00aa
        L_0x00a9:
            r4 = 1
        L_0x00aa:
            if (r4 != 0) goto L_0x00ad
            goto L_0x00f7
        L_0x00ad:
            uz2.z1 r12 = new uz2.z1
            r12.<init>()
            qy2.c0 r4 = r2.f206676d
            java.lang.String r4 = r4.f229419d
            if (r4 == 0) goto L_0x00c1
            boolean r4 = z04.C112551y.m153811k(r4)
            if (r4 == 0) goto L_0x00bf
            goto L_0x00c1
        L_0x00bf:
            r4 = 0
            goto L_0x00c2
        L_0x00c1:
            r4 = 1
        L_0x00c2:
            if (r4 != 0) goto L_0x00ca
            qy2.c0 r4 = r2.f206676d
            uz2.l r4 = r4.f229420e
            r12.f147311d = r4
        L_0x00ca:
            qy2.c0 r4 = r2.f206676d
            java.lang.String r4 = r4.f229425j
            if (r4 == 0) goto L_0x00d9
            boolean r4 = z04.C112551y.m153811k(r4)
            if (r4 == 0) goto L_0x00d7
            goto L_0x00d9
        L_0x00d7:
            r4 = 0
            goto L_0x00da
        L_0x00d9:
            r4 = 1
        L_0x00da:
            if (r4 != 0) goto L_0x00e2
            qy2.c0 r4 = r2.f206676d
            java.lang.String r4 = r4.f229425j
            r12.f147312e = r4
        L_0x00e2:
            qy2.c0 r4 = r2.f206676d
            java.lang.String r4 = r4.f229426n
            if (r4 == 0) goto L_0x00ee
            boolean r4 = z04.C112551y.m153811k(r4)
            if (r4 == 0) goto L_0x00ef
        L_0x00ee:
            r3 = 1
        L_0x00ef:
            if (r3 != 0) goto L_0x00f7
            qy2.c0 r3 = r2.f206676d
            java.lang.String r3 = r3.f229426n
            r12.f147313f = r3
        L_0x00f7:
            r10.<init>(r0, r11, r12)
            jz2.m r11 = new jz2.m
            r11.<init>(r2)
            ob0.b0 r12 = f40.C86709a0.m107524d()
            r0 = 6889(0x1ae9, float:9.654E-42)
            r12.mo123455a(r0, r11)
            r2.f206681i = r11
            ob0.b0 r11 = f40.C86709a0.m107524d()
            r11.mo123460f(r10)
            java.lang.ref.WeakReference r11 = new java.lang.ref.WeakReference
            r11.<init>(r10)
            r2.f206680h = r11
            qy2.c0 r10 = r2.f206676d
            boolean r10 = r10.f229422g
            if (r10 == r1) goto L_0x0149
            java.lang.ref.WeakReference<android.content.Context> r10 = r2.f206678f
            java.lang.Object r10 = r10.get()
            r3 = r10
            android.content.Context r3 = (android.content.Context) r3
            if (r3 == 0) goto L_0x0149
            boolean r10 = r3 instanceof android.app.Activity
            if (r10 != 0) goto L_0x012e
            goto L_0x0149
        L_0x012e:
            r10 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r4 = r3.getString(r10)
            r10 = 2131832197(0x7f112d85, float:1.9297441E38)
            java.lang.String r5 = r3.getString(r10)
            r6 = 1
            r7 = 1
            xz2.v r8 = new xz2.v
            r8.<init>(r2)
            qo3.i0 r10 = nj3.C76879j.m92724R(r3, r4, r5, r6, r7, r8)
            r2.f206682j = r10
        L_0x0149:
            r10 = r2
            goto L_0x0152
        L_0x014b:
            java.lang.String r10 = "param null"
            r0.onFinishAction(r1, r10, r12)
            qy2.t r10 = xz2.C79021t.f232028a
        L_0x0152:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.feature.textstatus.StatusThirdShareFeatureService.mo90745uq(android.content.Context, qy2.c0, qy2.b0):qy2.t");
    }

    public final void vx0(C77459z zVar) {
        if (zVar.f229404i == 0) {
            zVar.f229404i = 5;
        }
        C52718u uVar = zVar.f229399d;
        C52678e0 e0Var = uVar != null ? uVar.f147238g : null;
        if (e0Var != null) {
            String d = C60235a.m70504d(e0Var);
            if (!(d == null || C112551y.m153811k(d))) {
                if (e0Var.f147090g == null) {
                    e0Var.f147090g = new LinkedList<>();
                }
                if (e0Var.f147090g.size() == 0) {
                    Log.m105924i("MicroMsg.TextStatus.StatusThirdShare", "preprocess jumpinfos size err null,protect");
                    LinkedList<C65488a0> linkedList = new LinkedList<>();
                    e0Var.f147090g = linkedList;
                    C65488a0 a0Var = new C65488a0();
                    a0Var.f188439d = "0";
                    linkedList.add(a0Var);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r2 = (r2 = r4.f229399d).f147238g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void wx0(qy2.C77459z r4) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "[enterParam] sid:"
            r0.append(r1)
            r1 = 0
            if (r4 == 0) goto L_0x001a
            uz2.u r2 = r4.f229399d
            if (r2 == 0) goto L_0x001a
            uz2.e0 r2 = r2.f147238g
            if (r2 == 0) goto L_0x001a
            java.lang.String r2 = hz2.C60235a.m70504d(r2)
            goto L_0x001b
        L_0x001a:
            r2 = r1
        L_0x001b:
            r0.append(r2)
            java.lang.String r2 = " vinfo:"
            r0.append(r2)
            if (r4 == 0) goto L_0x0030
            uz2.u r2 = r4.f229399d
            if (r2 == 0) goto L_0x0030
            uz2.e0 r2 = r2.f147238g
            if (r2 == 0) goto L_0x0030
            java.lang.String r2 = r2.f147091h
            goto L_0x0031
        L_0x0030:
            r2 = r1
        L_0x0031:
            r0.append(r2)
            java.lang.String r2 = " iconId:"
            r0.append(r2)
            if (r4 == 0) goto L_0x0046
            uz2.u r2 = r4.f229399d
            if (r2 == 0) goto L_0x0046
            uz2.e0 r2 = r2.f147238g
            if (r2 == 0) goto L_0x0046
            java.lang.String r2 = r2.f147088e
            goto L_0x0047
        L_0x0046:
            r2 = r1
        L_0x0047:
            r0.append(r2)
            java.lang.String r2 = " mType:"
            r0.append(r2)
            if (r4 == 0) goto L_0x005c
            uz2.u r2 = r4.f229399d
            if (r2 == 0) goto L_0x005c
            int r2 = r2.f147237f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x005d
        L_0x005c:
            r2 = r1
        L_0x005d:
            r0.append(r2)
            java.lang.String r2 = " mPath:"
            r0.append(r2)
            if (r4 == 0) goto L_0x0069
            java.lang.String r1 = r4.f229400e
        L_0x0069:
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "MicroMsg.TextStatus.StatusThirdShare"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.feature.textstatus.StatusThirdShareFeatureService.wx0(qy2.z):void");
    }

    public final boolean xx0(Context context, C77459z zVar, ResultReceiver resultReceiver) {
        if (context == null) {
            Log.m105920e("MicroMsg.TextStatus.StatusThirdShare", "setTextStatus context == null");
            return false;
        }
        wx0(zVar);
        if (zVar != null) {
            vx0(zVar);
        }
        return C77446d0.f225875a.mo107615b(context, zVar, resultReceiver);
    }
}

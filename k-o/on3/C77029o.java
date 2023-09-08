package on3;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.storage.C72958d5;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d62.C75339i;
import di3.C86301e;
import di3.C86312j;
import eb0.C45628s0;
import ei3.C86522b;
import f40.C86709a0;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kr0.C27608u0;
import nj3.C76912y0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import p823sg.C101614i;
import te3.C51018qv3;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: on3.o */
public final class C77029o extends C86301e implements C27608u0 {

    /* renamed from: d */
    public final String f225035d = "TopMsg.TopMsgService";

    /* renamed from: e */
    public final C101614i<String, C77022f> f225036e = new C101614i<>(50);

    /* renamed from: f */
    public WeakReference<ProgressDialog> f225037f;

    /* renamed from: on3.o$a */
    public static final class C77030a implements C11385n {

        /* renamed from: d */
        public final /* synthetic */ C77029o f225038d;

        /* renamed from: e */
        public final /* synthetic */ int f225039e;

        /* renamed from: f */
        public final /* synthetic */ C72958d5 f225040f;

        /* renamed from: g */
        public final /* synthetic */ Context f225041g;

        public C77030a(C77029o oVar, int i, C72958d5 d5Var, Context context) {
            this.f225038d = oVar;
            this.f225039e = i;
            this.f225040f = d5Var;
            this.f225041g = context;
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            int i3;
            T t;
            boolean z;
            ProgressDialog progressDialog;
            C87412m.m108594g(yVar, TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            C86709a0.m107524d().mo123469o(yVar.getType(), this);
            C86709a0.m107524d().mo123470p(yVar.getType(), this);
            WeakReference<ProgressDialog> weakReference = this.f225038d.f225037f;
            if (!(weakReference == null || (progressDialog = weakReference.get()) == null)) {
                progressDialog.dismiss();
            }
            if (i == 0 && i2 == 0) {
                if (this.f225039e == 2) {
                    C72958d5 d5Var = this.f225040f;
                    if (d5Var != null) {
                        C77029o oVar = this.f225038d;
                        String l2 = d5Var.mo108714l2();
                        C87412m.m108593f(l2, "it.chatRoomName");
                        int id = d5Var.getId();
                        oVar.getClass();
                        C77022f xx02 = oVar.xx0(l2);
                        if (xx02 != null) {
                            Iterator<T> it = xx02.mo107344b().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = null;
                                    break;
                                }
                                t = it.next();
                                if (((C72958d5) t).getId() == id) {
                                    z = true;
                                    continue;
                                } else {
                                    z = false;
                                    continue;
                                }
                                if (z) {
                                    break;
                                }
                            }
                            C72958d5 d5Var2 = (C72958d5) t;
                            if (d5Var2 != null) {
                                d5Var2.deleteFromDB(C77022f.f225022d.mo107347a().getDB(), true);
                                xx02.mo107344b().remove(d5Var2);
                            }
                        }
                    }
                    i3 = C0966R.string.mir;
                } else {
                    i3 = C0966R.string.mia;
                }
                Context context = this.f225041g;
                C76912y0.m92769h(context, context.getString(i3), C0966R.raw.icons_outlined_done);
                return;
            }
            Context context2 = this.f225041g;
            C76912y0.m92769h(context2, context2.getString(C0966R.string.hc4), C0966R.raw.icons_outlined_info);
        }
    }

    /* renamed from: on3.o$b */
    public static final class C77031b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C47387e f225042d;

        /* renamed from: e */
        public final /* synthetic */ C77030a f225043e;

        public C77031b(C47387e eVar, C77030a aVar) {
            this.f225042d = eVar;
            this.f225043e = aVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f225042d);
            C89137b0 d = C86709a0.m107524d();
            this.f225042d.getClass();
            d.mo123469o(11965, this.f225043e);
            C89137b0 d2 = C86709a0.m107524d();
            this.f225042d.getClass();
            d2.mo123470p(11965, this.f225043e);
        }
    }

    /* renamed from: XZ */
    public boolean mo55360XZ(String str, long j) {
        C77022f xx02;
        T t;
        boolean z;
        if (str == null || (xx02 = xx0(str)) == null) {
            return false;
        }
        Iterator<T> it = xx02.mo107344b().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (((C72958d5) t).mo108716n2().f183488f == j) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return t != null;
    }

    /* renamed from: sf */
    public void mo55361sf(String str, C51018qv3 qv32) {
        C77022f xx02;
        if (str != null && (xx02 = xx0(str)) != null) {
            xx02.mo107345c(xx02.mo107344b(), qv32);
        }
    }

    public final void vx0(String str, int i) {
        T t;
        boolean z;
        C87412m.m108594g(str, "chatRoomName");
        C77022f xx02 = xx0(str);
        if (xx02 != null) {
            Iterator<T> it = xx02.mo107344b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (((C72958d5) t).getId() == i) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C72958d5 d5Var = (C72958d5) t;
            if (d5Var != null) {
                d5Var.mo108719q2(true);
                d5Var.updateToDB(C77022f.f225022d.mo107347a().getDB(), true);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void wx0(android.content.Context r12, int r13, com.tencent.p014mm.storage.C72958d5 r14, com.tencent.p014mm.storage.C72963f4 r15) {
        /*
            r11 = this;
            java.lang.String r0 = "context"
            gy3.C87412m.m108594g(r12, r0)
            if (r13 == 0) goto L_0x00a0
            r0 = 1
            r1 = 0
            if (r13 == r0) goto L_0x0048
            r0 = 2
            if (r13 == r0) goto L_0x000f
            goto L_0x0051
        L_0x000f:
            if (r14 == 0) goto L_0x0040
            on3.e r15 = new on3.e
            java.lang.String r4 = r14.mo108714l2()
            te3.hh4 r0 = r14.mo108716n2()
            long r5 = r0.f183488f
            te3.hh4 r0 = r14.mo108716n2()
            int r7 = r0.f183489g
            te3.hh4 r0 = r14.mo108716n2()
            java.lang.String r8 = r0.f183491i
            java.lang.String r0 = "record.topMsgInfoItem.MsgUserName"
            gy3.C87412m.m108593f(r8, r0)
            te3.hh4 r0 = r14.mo108716n2()
            java.lang.String r9 = r0.f183490h
            java.lang.String r0 = "record.topMsgInfoItem.MsgSummary"
            gy3.C87412m.m108593f(r9, r0)
            r10 = 0
            r2 = r15
            r3 = r13
            r2.<init>(r3, r4, r5, r7, r8, r9, r10)
            goto L_0x0052
        L_0x0040:
            if (r15 == 0) goto L_0x0051
            on3.e r0 = new on3.e
            r0.<init>(r13, r15)
            goto L_0x004f
        L_0x0048:
            if (r15 == 0) goto L_0x0051
            on3.e r0 = new on3.e
            r0.<init>(r13, r15)
        L_0x004f:
            r15 = r0
            goto L_0x0052
        L_0x0051:
            r15 = r1
        L_0x0052:
            if (r15 != 0) goto L_0x0055
            return
        L_0x0055:
            on3.o$a r0 = new on3.o$a
            r0.<init>(r11, r13, r14, r12)
            ob0.b0 r13 = f40.C86709a0.m107524d()
            java.lang.String r14 = "getNetSceneQueue()"
            gy3.C87412m.m108593f(r13, r14)
            boolean r14 = r12 instanceof androidx.lifecycle.C0125s
            if (r14 == 0) goto L_0x006a
            r1 = r12
            androidx.lifecycle.s r1 = (androidx.lifecycle.C0125s) r1
        L_0x006a:
            r14 = 11965(0x2ebd, float:1.6767E-41)
            if (r1 == 0) goto L_0x007b
            qb0.e r2 = r13.f256818p
            qb0.f r3 = new qb0.f
            r3.<init>(r0)
            java.lang.String r4 = "%MainThread%"
            r2.mo123895a(r14, r1, r4, r3)
            goto L_0x007e
        L_0x007b:
            r13.mo123455a(r14, r0)
        L_0x007e:
            r13.mo123460f(r15)
            r13 = 2131821571(0x7f110403, float:1.9275889E38)
            java.lang.String r2 = r12.getString(r13)
            r3 = 3
            java.lang.String r4 = r12.getString(r13)
            r5 = 0
            r6 = 1
            on3.o$b r7 = new on3.o$b
            r7.<init>(r15, r0)
            r1 = r12
            qo3.i0 r12 = nj3.C76879j.m92722P(r1, r2, r3, r4, r5, r6, r7)
            java.lang.ref.WeakReference r13 = new java.lang.ref.WeakReference
            r13.<init>(r12)
            r11.f225037f = r13
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: on3.C77029o.wx0(android.content.Context, int, com.tencent.mm.storage.d5, com.tencent.mm.storage.f4):void");
    }

    public final C77022f xx0(String str) {
        if (str == null) {
            return null;
        }
        C77022f fVar = (C77022f) this.f225036e.get(str);
        if (fVar != null) {
            return fVar;
        }
        C77022f fVar2 = new C77022f(str);
        this.f225036e.put(str, fVar2);
        return fVar2;
    }

    public final String yx0(String str, String str2) {
        if (str == null || str2 == null) {
            return "";
        }
        if (C72996z1.m85820U5(str)) {
            String r = C45628s0.m50796r(str, str2, true);
            C87412m.m108593f(r, "{\n            ContactSto…userName, true)\n        }");
            return r;
        }
        String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str2);
        C87412m.m108593f(displayName, "{\n            ServiceMan…yName(userName)\n        }");
        return displayName;
    }

    /* renamed from: z0 */
    public List<C72958d5> mo55362z0(String str) {
        List<C72958d5> b;
        if (str == null) {
            return new LinkedList();
        }
        LinkedList linkedList = new LinkedList();
        C77022f xx02 = xx0(str);
        if (!(xx02 == null || (b = xx02.mo107344b()) == null)) {
            linkedList.addAll(b);
        }
        return linkedList;
    }

    public final String zx0(String str, String str2) {
        C87412m.m108594g(str, "userName");
        C87412m.m108594g(str2, "nickName");
        return "<_wc_custom_link_ href='weixin://contacts/profile/" + str + "'>" + str2 + "</_wc_custom_link_>";
    }
}

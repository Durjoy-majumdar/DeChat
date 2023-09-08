package th0;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.modelimage.C68129u;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d62.C7250m;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import ke3.C88144b;
import nj3.C76879j;
import p158gt.C98201k;
import p434ig.C98672d;
import p434ig.C98674g;
import pb1.C100714h1;
import ph0.C100792a;
import qo3.C89779i0;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64186f0;
import sx3.C64197v;
import z04.C112550d0;

/* renamed from: th0.l */
public final class C101888l {

    /* renamed from: a */
    public static final C101888l f300029a = new C101888l();

    /* renamed from: th0.l$a */
    public static final class C101889a implements MMActivity.C6739d {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f300030d;

        /* renamed from: e */
        public final /* synthetic */ List<C98672d> f300031e;

        /* renamed from: f */
        public final /* synthetic */ List<C72963f4> f300032f;

        /* renamed from: g */
        public final /* synthetic */ MMActivity f300033g;

        /* renamed from: th0.l$a$a */
        public static final class C101890a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Dialog f300034d;

            public C101890a(Dialog dialog) {
                this.f300034d = dialog;
            }

            public final void run() {
                this.f300034d.dismiss();
            }
        }

        public C101889a(C32224a<C13598b0> aVar, List<? extends C98672d> list, List<? extends C72963f4> list2, MMActivity mMActivity) {
            this.f300030d = aVar;
            this.f300031e = list;
            this.f300032f = list2;
            this.f300033g = mMActivity;
        }

        public final void mmOnActivityResult(int i, int i2, Intent intent) {
            String[] strArr;
            C101890a aVar;
            Intent intent2 = intent;
            int i3 = 1;
            if (i == 1 && intent2 != null) {
                String stringExtra = intent2.getStringExtra("custom_send_text");
                String stringExtra2 = intent2.getStringExtra("Select_Conv_User");
                if (i2 != -1) {
                    this.f300030d.invoke();
                } else if (Util.isNullOrNil(stringExtra2)) {
                    this.f300030d.invoke();
                } else {
                    char c = 0;
                    if (stringExtra2 != null) {
                        Object[] array = C112550d0.m153785U(stringExtra2, new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
                        C87412m.m108592e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        strArr = (String[]) array;
                    } else {
                        strArr = null;
                    }
                    ArrayList<String> stringsToList = Util.stringsToList(strArr);
                    C87412m.m108593f(stringsToList, "stringsToList(toUsers?.split(\",\")?.toTypedArray())");
                    List<C98672d> list = this.f300031e;
                    List<C72963f4> list2 = this.f300032f;
                    MMActivity mMActivity = this.f300033g;
                    int i4 = 0;
                    for (T next : list) {
                        int i5 = i4 + 1;
                        if (i4 >= 0) {
                            C98672d dVar = (C98672d) next;
                            C72963f4 f4Var = (i4 >= (list2 != null ? list2.size() : 0) || list2 == null) ? null : list2.get(i4);
                            Object[] objArr = new Object[i3];
                            objArr[c] = stringExtra2;
                            Log.m105919d("MicroMsg.AlbumGalleryAdapter", "select %s for sending", objArr);
                            if (dVar.mo55274P() == 4) {
                                C89779i0 Q = C76879j.m92723Q(mMActivity, "", mMActivity.getContext().getString(C0966R.string.a2w), true, false, (DialogInterface.OnCancelListener) null);
                                C87412m.m108593f(Q, "showProgressDlg(\n       …                        )");
                                C101890a aVar2 = new C101890a(Q);
                                for (String next2 : stringsToList) {
                                    if (Util.isNullOrNil(next2)) {
                                        Log.m105928w("MicroMsg.AlbumUtil", "want to send fav video, but to user is null");
                                        aVar = aVar2;
                                    } else {
                                        C101887k kVar = r12;
                                        MMHandlerThread e = C86709a0.m107525e();
                                        aVar = aVar2;
                                        C101887k kVar2 = new C101887k(dVar, mMActivity, next2, f4Var, aVar);
                                        e.postToWorker(kVar);
                                    }
                                    aVar2 = aVar;
                                }
                            } else {
                                ArrayList arrayList = new ArrayList();
                                C100792a aVar3 = C100792a.f295260a;
                                String t = f4Var != null ? f4Var.mo108768t() : null;
                                if (t == null) {
                                    t = "";
                                }
                                arrayList.add(aVar3.mo140234e(dVar, t, f4Var != null ? f4Var.getMsgId() : 0));
                                for (String d : stringsToList) {
                                    ((C68129u) ((C98201k) C86312j.m106911c(C98201k.class)).mo137275ZL()).mo93637d(3, C75592q0.m90789s(), d, arrayList, 0, false, C0966R.C0969drawable.by8);
                                }
                            }
                            i4 = i5;
                            i3 = 1;
                            c = 0;
                        } else {
                            C64197v.m75542k();
                            throw null;
                        }
                    }
                    if (!Util.isNullOrNil(stringExtra)) {
                        for (String next3 : stringsToList) {
                            C7250m.m7431a().mo136257Tm(next3, stringExtra, C45628s0.m50810y(next3), 0);
                        }
                    }
                    this.f300030d.invoke();
                }
            }
        }
    }

    /* renamed from: e */
    public static final boolean m134034e(C72963f4 f4Var) {
        String str = null;
        if (!C72996z1.m85820U5(f4Var != null ? f4Var.mo108768t() : null)) {
            if (f4Var != null) {
                str = f4Var.mo108768t();
            }
            return C72996z1.m85847r5(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo141352a(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = eb0.C45628s0.m50738C(r6)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x002a
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85825X4(r6)
            if (r0 != 0) goto L_0x002a
            java.util.HashSet r0 = com.tencent.p014mm.storage.C72996z1.m85797E4()
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = "weixin"
            boolean r0 = gy3.C87412m.m108589b(r0, r6)
            if (r0 != 0) goto L_0x002a
            boolean r0 = com.tencent.p014mm.storage.C72996z1.m85843n5(r6)
            if (r0 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r0 = 0
            goto L_0x002b
        L_0x002a:
            r0 = 1
        L_0x002b:
            java.lang.Class<h81.h> r3 = h81.C32735h.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            h81.h r3 = (h81.C32735h) r3
            tf3.v r4 = new tf3.v
            r4.<init>()
            int r3 = r3.mo58782dM(r4)
            if (r3 != r2) goto L_0x0053
            if (r0 == 0) goto L_0x0052
            if (r6 == 0) goto L_0x004f
            int r6 = r6.length()
            if (r6 != 0) goto L_0x004a
            r6 = 1
            goto L_0x004b
        L_0x004a:
            r6 = 0
        L_0x004b:
            if (r6 != r2) goto L_0x004f
            r6 = 1
            goto L_0x0050
        L_0x004f:
            r6 = 0
        L_0x0050:
            if (r6 == 0) goto L_0x0053
        L_0x0052:
            r1 = 1
        L_0x0053:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: th0.C101888l.mo141352a(java.lang.String):boolean");
    }

    /* renamed from: b */
    public final void mo141353b(Activity activity, List<? extends C98672d> list, List<? extends C72963f4> list2) {
        Class cls = C100714h1.class;
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(list, "selectList");
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
        aVar.f264688m = 33;
        aVar.f264684i = activity;
        boolean z = true;
        if (list.size() > 1) {
            ((C100714h1) C86312j.m106911c(cls)).J60(doFavoriteEvent, 33, list, list2);
        } else {
            C98672d dVar = (C98672d) C110818d0.m150916N(list);
            C72963f4 f4Var = list2 != null ? (C72963f4) C110818d0.m150916N(list2) : null;
            if (dVar != null && dVar.mo55274P() == 2) {
                ((C100714h1) C86312j.m106911c(cls)).mo135060mH(doFavoriteEvent, 33, C100792a.f295260a.mo140233d(dVar, f4Var));
            } else {
                if (dVar == null || dVar.mo55274P() != 4) {
                    z = false;
                }
                if (z) {
                    C100792a aVar2 = C100792a.f295260a;
                    ((C100714h1) C86312j.m106911c(cls)).Zp0(doFavoriteEvent, 33, aVar2.mo140233d(dVar, f4Var), aVar2.mo140250v(dVar, f4Var), (int) dVar.mo55278R(), dVar.mo55272O(), dVar.mo55258H());
                }
            }
        }
        doFavoriteEvent.publish();
    }

    /* renamed from: c */
    public final List<C98672d> mo141354c(C98674g gVar) {
        List<C98672d> A;
        if (gVar == null || (A = gVar.mo55348A()) == null) {
            return C64186f0.f181907d;
        }
        ArrayList arrayList = new ArrayList();
        for (T next : A) {
            C98672d dVar = (C98672d) next;
            boolean z = false;
            if (dVar != null && dVar.mo55274P() == 2) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public final List<C98672d> mo141355d(C98674g gVar) {
        List<C98672d> A;
        if (gVar == null || (A = gVar.mo55348A()) == null) {
            return C64186f0.f181907d;
        }
        ArrayList arrayList = new ArrayList();
        for (T next : A) {
            C98672d dVar = (C98672d) next;
            boolean z = false;
            if (dVar != null && dVar.mo55274P() == 4) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (com.tencent.p014mm.vfs.C86013q1.m106450k(ph0.C100792a.f295260a.mo140245q(r4, r5)) != false) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0059 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo141356f(p434ig.C98672d r4, com.tencent.p014mm.storage.C72963f4 r5) {
        /*
            r3 = this;
            java.lang.String r0 = "albumDataItem"
            gy3.C87412m.m108594g(r4, r0)
            int r0 = r4.mo55274P()
            r1 = 0
            r2 = 2
            if (r0 == r2) goto L_0x000e
            return r1
        L_0x000e:
            boolean r0 = r3.mo141359i(r4, r5)
            r2 = 1
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = r4.mo55302d0()
            if (r0 == 0) goto L_0x0028
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0023
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r0 != r2) goto L_0x0028
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            if (r0 == 0) goto L_0x0037
            ph0.a r0 = ph0.C100792a.f295260a
            java.lang.String r0 = r0.mo140245q(r4, r5)
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r0 != 0) goto L_0x0059
        L_0x0037:
            java.lang.String r0 = r4.mo55250D()
            if (r0 == 0) goto L_0x004a
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0045
            r0 = 1
            goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            if (r0 != r2) goto L_0x004a
            r0 = 1
            goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            if (r0 == 0) goto L_0x005a
            ph0.a r0 = ph0.C100792a.f295260a
            java.lang.String r4 = r0.mo140238j(r4, r5)
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r4 == 0) goto L_0x005a
        L_0x0059:
            r1 = 1
        L_0x005a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: th0.C101888l.mo141356f(ig.d, com.tencent.mm.storage.f4):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo141357g(p434ig.C98672d r4, com.tencent.p014mm.storage.C72963f4 r5) {
        /*
            r3 = this;
            java.lang.String r0 = "albumDataItem"
            gy3.C87412m.m108594g(r4, r0)
            int r0 = r4.mo55274P()
            r1 = 0
            r2 = 2
            if (r0 == r2) goto L_0x000e
            return r1
        L_0x000e:
            boolean r0 = r3.mo141359i(r4, r5)
            r2 = 1
            if (r0 != 0) goto L_0x0038
            java.lang.String r0 = r4.mo55250D()
            if (r0 == 0) goto L_0x0028
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0023
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r0 != r2) goto L_0x0028
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            if (r0 == 0) goto L_0x0038
            ph0.a r0 = ph0.C100792a.f295260a
            java.lang.String r4 = r0.mo140238j(r4, r5)
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r4 == 0) goto L_0x0038
            r1 = 1
        L_0x0038:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: th0.C101888l.mo141357g(ig.d, com.tencent.mm.storage.f4):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo141358h(p434ig.C98672d r4, com.tencent.p014mm.storage.C72963f4 r5) {
        /*
            r3 = this;
            java.lang.String r0 = "albumDataItem"
            gy3.C87412m.m108594g(r4, r0)
            int r0 = r4.mo55274P()
            r1 = 0
            r2 = 2
            if (r0 == r2) goto L_0x000e
            return r1
        L_0x000e:
            boolean r0 = r3.mo141359i(r4, r5)
            r2 = 1
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = r4.mo55250D()
            if (r0 == 0) goto L_0x0028
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0023
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r0 != r2) goto L_0x0028
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            if (r0 == 0) goto L_0x0038
            ph0.a r0 = ph0.C100792a.f295260a
            java.lang.String r4 = r0.mo140238j(r4, r5)
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r4 == 0) goto L_0x0038
            r1 = 1
        L_0x0038:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: th0.C101888l.mo141358h(ig.d, com.tencent.mm.storage.f4):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo141359i(p434ig.C98672d r5, com.tencent.p014mm.storage.C72963f4 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "albumDataItem"
            gy3.C87412m.m108594g(r5, r0)
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L_0x0011
            int r2 = r6.mo108769t2()
            if (r2 != 0) goto L_0x0011
            r2 = 1
            goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            if (r2 != 0) goto L_0x0057
            if (r6 == 0) goto L_0x001f
            int r2 = r6.getStatus()
            r3 = 2
            if (r2 != r3) goto L_0x001f
            r2 = 1
            goto L_0x0020
        L_0x001f:
            r2 = 0
        L_0x0020:
            if (r2 != 0) goto L_0x0057
            if (r6 == 0) goto L_0x002d
            int r2 = r6.getStatus()
            r3 = 3
            if (r2 != r3) goto L_0x002d
            r2 = 1
            goto L_0x002e
        L_0x002d:
            r2 = 0
        L_0x002e:
            if (r2 != 0) goto L_0x0057
            if (r6 == 0) goto L_0x003b
            int r2 = r6.getStatus()
            r3 = 5
            if (r2 != r3) goto L_0x003b
            r2 = 1
            goto L_0x003c
        L_0x003b:
            r2 = 0
        L_0x003c:
            if (r2 == 0) goto L_0x003f
            goto L_0x0057
        L_0x003f:
            r0 = 0
            if (r6 == 0) goto L_0x0047
            java.lang.String r1 = r6.mo108768t()
            goto L_0x0048
        L_0x0047:
            r1 = r0
        L_0x0048:
            if (r6 == 0) goto L_0x0052
            long r2 = r6.getMsgId()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
        L_0x0052:
            boolean r0 = r4.mo141360j(r5, r1, r0)
            goto L_0x0085
        L_0x0057:
            java.lang.String r6 = r5.mo55302d0()
            if (r6 == 0) goto L_0x006a
            int r6 = r6.length()
            if (r6 <= 0) goto L_0x0065
            r6 = 1
            goto L_0x0066
        L_0x0065:
            r6 = 0
        L_0x0066:
            if (r6 != r0) goto L_0x006a
            r6 = 1
            goto L_0x006b
        L_0x006a:
            r6 = 0
        L_0x006b:
            if (r6 == 0) goto L_0x0084
            java.lang.String r5 = r5.mo55250D()
            if (r5 == 0) goto L_0x0080
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x007b
            r5 = 1
            goto L_0x007c
        L_0x007b:
            r5 = 0
        L_0x007c:
            if (r5 != r0) goto L_0x0080
            r5 = 1
            goto L_0x0081
        L_0x0080:
            r5 = 0
        L_0x0081:
            if (r5 == 0) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r0 = 0
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: th0.C101888l.mo141359i(ig.d, com.tencent.mm.storage.f4):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo141360j(p434ig.C98672d r6, java.lang.String r7, java.lang.Long r8) {
        /*
            r5 = this;
            java.lang.String r0 = "albumDataItem"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = r6.mo55302d0()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 != r1) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = r6.mo55250D()
            if (r0 == 0) goto L_0x0030
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x002b
            r0 = 1
            goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            if (r0 != r1) goto L_0x0030
            r0 = 1
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            if (r0 != 0) goto L_0x004e
        L_0x0033:
            ph0.a r0 = ph0.C100792a.f295260a
            if (r7 != 0) goto L_0x0039
            java.lang.String r7 = ""
        L_0x0039:
            if (r8 == 0) goto L_0x0040
            long r3 = r8.longValue()
            goto L_0x0042
        L_0x0040:
            r3 = 0
        L_0x0042:
            java.lang.String r6 = r0.mo140246r(r6, r7, r3)
            boolean r6 = com.tencent.p014mm.vfs.C86013q1.m106450k(r6)
            if (r6 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r1 = 0
        L_0x004e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: th0.C101888l.mo141360j(ig.d, java.lang.String, java.lang.Long):boolean");
    }

    /* renamed from: k */
    public final boolean mo141361k(C98672d dVar, C72963f4 f4Var) {
        C87412m.m108594g(dVar, "albumDataItem");
        return mo141364n(dVar, f4Var) || mo141362l(dVar, f4Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0037 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo141362l(p434ig.C98672d r4, com.tencent.p014mm.storage.C72963f4 r5) {
        /*
            r3 = this;
            java.lang.String r0 = "albumDataItem"
            gy3.C87412m.m108594g(r4, r0)
            int r0 = r4.mo55274P()
            r1 = 0
            r2 = 4
            if (r0 == r2) goto L_0x000e
            return r1
        L_0x000e:
            boolean r0 = r3.mo141359i(r4, r5)
            r2 = 1
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = r4.mo55250D()
            if (r0 == 0) goto L_0x0028
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0023
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r0 != r2) goto L_0x0028
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            if (r0 == 0) goto L_0x0038
            ph0.a r0 = ph0.C100792a.f295260a
            java.lang.String r4 = r0.mo140238j(r4, r5)
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r4 == 0) goto L_0x0038
            r1 = 1
        L_0x0038:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: th0.C101888l.mo141362l(ig.d, com.tencent.mm.storage.f4):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo141363m(p434ig.C98672d r4, com.tencent.p014mm.storage.C72963f4 r5) {
        /*
            r3 = this;
            java.lang.String r0 = "albumDataItem"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = r4.mo55256G()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 != r1) goto L_0x001a
            r0 = 1
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            if (r0 == 0) goto L_0x002a
            ph0.a r0 = ph0.C100792a.f295260a
            java.lang.String r4 = r0.mo140250v(r4, r5)
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r4 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r1 = 0
        L_0x002b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: th0.C101888l.mo141363m(ig.d, com.tencent.mm.storage.f4):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        if (com.tencent.p014mm.vfs.C86013q1.m106450k(ph0.C100792a.f295260a.mo140245q(r4, r5)) != false) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0054 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo141364n(p434ig.C98672d r4, com.tencent.p014mm.storage.C72963f4 r5) {
        /*
            r3 = this;
            int r0 = r4.mo55274P()
            r1 = 0
            r2 = 4
            if (r0 == r2) goto L_0x0009
            return r1
        L_0x0009:
            boolean r0 = r3.mo141359i(r4, r5)
            r2 = 1
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = r4.mo55302d0()
            if (r0 == 0) goto L_0x0023
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x001e
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            if (r0 != r2) goto L_0x0023
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r0 == 0) goto L_0x0032
            ph0.a r0 = ph0.C100792a.f295260a
            java.lang.String r0 = r0.mo140245q(r4, r5)
            boolean r0 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r0 != 0) goto L_0x0054
        L_0x0032:
            java.lang.String r0 = r4.mo55250D()
            if (r0 == 0) goto L_0x0045
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0040
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != r2) goto L_0x0045
            r0 = 1
            goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            if (r0 == 0) goto L_0x0055
            ph0.a r0 = ph0.C100792a.f295260a
            java.lang.String r4 = r0.mo140238j(r4, r5)
            boolean r4 = com.tencent.p014mm.vfs.C86013q1.m106450k(r4)
            if (r4 == 0) goto L_0x0055
        L_0x0054:
            r1 = 1
        L_0x0055:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: th0.C101888l.mo141364n(ig.d, com.tencent.mm.storage.f4):boolean");
    }

    /* renamed from: o */
    public final void mo141365o(MMActivity mMActivity, List<? extends C98672d> list, List<? extends C72963f4> list2, C32224a<C13598b0> aVar) {
        MMActivity mMActivity2 = mMActivity;
        List<? extends C98672d> list3 = list;
        List<? extends C72963f4> list4 = list2;
        C32224a<C13598b0> aVar2 = aVar;
        C87412m.m108594g(mMActivity2, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(list3, "selectList");
        C87412m.m108594g(aVar2, "callback");
        Intent intent = new Intent();
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("mutil_select_is_ret", true);
        if (list.size() == 1) {
            C98672d dVar = (C98672d) list3.get(0);
            String str = null;
            C72963f4 f4Var = list4 != null ? (C72963f4) list4.get(0) : null;
            C100792a aVar3 = C100792a.f295260a;
            String t = f4Var != null ? f4Var.mo108768t() : null;
            String str2 = "";
            if (t == null) {
                t = str2;
            }
            String k = aVar3.mo140239k(dVar, t, f4Var != null ? f4Var.getMsgId() : 0);
            String t2 = f4Var != null ? f4Var.mo108768t() : null;
            if (t2 == null) {
                t2 = str2;
            }
            String r = aVar3.mo140246r(dVar, t2, f4Var != null ? f4Var.getMsgId() : 0);
            if (f4Var != null) {
                str = f4Var.mo108768t();
            }
            if (str != null) {
                str2 = str;
            }
            String w = aVar3.mo140251w(dVar, str2, f4Var != null ? f4Var.getMsgId() : 0);
            if (C86013q1.m106450k(k)) {
                intent.putExtra("image_path", k);
            } else if (C86013q1.m106450k(r)) {
                intent.putExtra("image_path", r);
            } else {
                intent.putExtra("image_path", w);
            }
            intent.putExtra("Retr_Msg_Type", dVar.mo55274P() == 4 ? 1 : 0);
            intent.putExtra("select_is_ret", true);
        } else {
            intent.putExtra("scene_from", 18);
            intent.putExtra("Retr_Msg_Type", 17);
            intent.putExtra("select_count", list.size());
        }
        C88144b.m109803u(mMActivity2, ".ui.transmit.SelectConversationUI", intent, 1, new C101889a(aVar2, list3, list4, mMActivity2));
    }
}

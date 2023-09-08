package com.tencent.p014mm.plugin.fav.p047ui;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.fav.p047ui.adapter.FavoriteNormalAdapter;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import di3.C86312j;
import f40.C86709a0;
import gy3.C87412m;
import ht1.C60165e4;
import ht1.C60200t1;
import java.util.LinkedList;
import java.util.List;
import ke3.C88144b;
import nj3.C76879j;
import p525fr.C97951d;
import pb1.C100703e0;
import pb1.C100717j0;
import pb1.C100734q;
import pb1.C100755z;
import pb1.C100759z0;
import te3.C101801kd0;
import te3.C49712hj1;
import te3.C64682rk1;

/* renamed from: com.tencent.mm.plugin.fav.ui.z1 */
public class C93745z1 {

    /* renamed from: com.tencent.mm.plugin.fav.ui.z1$a */
    public class C93746a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List f270591d;

        /* renamed from: e */
        public final /* synthetic */ int f270592e;

        /* renamed from: f */
        public final /* synthetic */ C93749c f270593f;

        /* renamed from: g */
        public final /* synthetic */ Dialog f270594g;

        /* renamed from: com.tencent.mm.plugin.fav.ui.z1$a$a */
        public class C93747a implements Runnable {
            public C93747a() {
            }

            public void run() {
                C93746a.this.f270594g.dismiss();
            }

            public String toString() {
                return super.toString() + "|batchDelFavItems";
            }
        }

        public C93746a(List list, int i, C93749c cVar, Dialog dialog) {
            this.f270591d = list;
            this.f270592e = i;
            this.f270593f = cVar;
            this.f270594g = dialog;
        }

        public void run() {
            C100734q.m131864o(this.f270591d, this.f270592e);
            C93749c cVar = this.f270593f;
            if (cVar != null) {
                cVar.mo128364a();
            }
            MMHandlerThread.postToMainThread(new C93747a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.z1$b */
    public class C93748b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Dialog f270596d;

        /* renamed from: e */
        public final /* synthetic */ Activity f270597e;

        /* renamed from: f */
        public final /* synthetic */ String f270598f;

        /* renamed from: g */
        public final /* synthetic */ List f270599g;

        public C93748b(Dialog dialog, Activity activity, String str, List list) {
            this.f270596d = dialog;
            this.f270597e = activity;
            this.f270598f = str;
            this.f270599g = list;
        }

        public void run() {
            this.f270596d.dismiss();
            Activity activity = this.f270597e;
            C75026b.m89951a(activity, activity.getString(C0966R.string.cmm));
            C93745z1.m118449f(this.f270597e, this.f270598f, this.f270599g, true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.z1$c */
    public interface C93749c {
        /* renamed from: a */
        void mo128364a();
    }

    /* renamed from: a */
    public static void m118444a(Activity activity, List<C100755z> list, C93749c cVar, int i) {
        if (list != null && !list.isEmpty()) {
            Log.m105925i("FavoriteMenuHelper", "batchDelFavItems() :%s", Integer.valueOf(list.size()));
            C86709a0.m107525e().postToWorker(new C93746a(list, i, cVar, C76879j.m92723Q(activity, "", activity.getString(C0966R.string.cn8), true, false, (DialogInterface.OnCancelListener) null)));
        }
    }

    /* renamed from: b */
    public static void m118445b(Activity activity, List<C100755z> list, String str, String str2, String str3) {
        if (list != null && !list.isEmpty() && !Util.isNullOrNil(str2)) {
            C100703e0 e0Var = new C100703e0();
            LinkedList linkedList = new LinkedList();
            for (C100755z next : list) {
                if (!e0Var.mo140134c(next)) {
                    linkedList.add(next);
                }
            }
            if (linkedList.isEmpty()) {
                Log.m105924i(str3, "after filter, nothing");
                C76879j.m92726T(activity, activity.getString(C0966R.string.cqy));
                return;
            }
            C93594f1.m118180h(activity, str2, str, linkedList, new C93748b(C76879j.m92723Q(activity, "", activity.getString(C0966R.string.col), true, false, (DialogInterface.OnCancelListener) null), activity, str2, linkedList));
        }
    }

    /* renamed from: c */
    public static int m118446c(int i) {
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 0;
        }
        if (i == 16) {
            return 11;
        }
        if (i == 4) {
            return 1;
        }
        if (i == 14) {
            return 13;
        }
        if (i == 6) {
            return 9;
        }
        return i == 8 ? 3 : 2;
    }

    /* renamed from: d */
    public static void m118447d(Activity activity, Intent intent) {
        if (MMApplicationContext.isMainProcess()) {
            ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76842e7(43, 34, WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_MD5_FAILED, intent);
        }
        C100734q.m131875t0(activity, ".ui.FavFinderFilterUI", intent, (Bundle) null);
    }

    /* renamed from: e */
    public static void m118448e(Activity activity, boolean z, Intent intent) {
        Bundle bundle = !C85875k4.m106211z() ? ActivityOptions.makeSceneTransitionAnimation(activity, new Pair[0]).toBundle() : null;
        if (z) {
            intent.putExtra("key_search_type", 2);
            C100734q.m131877u0(activity, ".ui.FavSearchUI", intent, 4103, bundle);
            return;
        }
        C100734q.m131875t0(activity, ".ui.FavSearchUI", intent, bundle);
    }

    /* renamed from: f */
    public static void m118449f(Context context, String str, List<C100755z> list, boolean z) {
        C101801kd0 kd02;
        C64682rk1 rk12;
        if (str != null && list != null) {
            long j = 1;
            if (!z) {
                j = 2;
            }
            C49712hj1 hj12 = null;
            if (context instanceof FavFinderFilterUI) {
                C97951d dVar = ((FavFinderFilterUI) context).f269713f;
                if (dVar != null) {
                    Fragment fragment = dVar instanceof Fragment ? (Fragment) dVar : null;
                    if (fragment != null) {
                        hj12 = ((C60165e4) C86312j.m106911c(C60165e4.class)).mo85177x6(fragment);
                    }
                } else {
                    C87412m.m108603p("mGlobalFavFragment");
                    throw null;
                }
            }
            C49712hj1 hj13 = hj12;
            String replace = str.replace(',', ';');
            for (C100755z next : list) {
                if (!(next.field_type != 20 || (kd02 = next.field_favProto) == null || (rk12 = kd02.f298614M) == null)) {
                    ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76760HX(rk12, 9, j, replace, hj13, 1);
                }
            }
        }
    }

    /* renamed from: g */
    public static boolean m118450g(Context context, int i, FavoriteNormalAdapter favoriteNormalAdapter, C100755z zVar) {
        Context context2 = context;
        int i2 = i;
        FavoriteNormalAdapter favoriteNormalAdapter2 = favoriteNormalAdapter;
        C100755z zVar2 = zVar;
        Class cls = C100759z0.class;
        int i3 = 0;
        if (i2 == 4105) {
            Intent intent = new Intent();
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("scene_from", 1);
            intent.putExtra("mutil_select_is_ret", true);
            if (favoriteNormalAdapter.mo128381j() == 1) {
                C100755z zVar3 = (C100755z) ((LinkedList) favoriteNormalAdapter2.mo128379i(false)).get(0);
                intent.putExtra("select_fav_local_id", zVar3.field_localId);
                if (zVar3.f295172Q0) {
                    intent.putExtra("select_fav_fake_local_id", zVar3.f295174S0);
                }
                if (m118446c(zVar3.field_type) != -1) {
                    intent.putExtra("Retr_Msg_Type", m118446c(zVar3.field_type));
                }
                ((C100759z0) C86312j.m106911c(cls)).mo61499ni(Long.valueOf(zVar3.field_localId));
                if (((LinkedList) favoriteNormalAdapter2.mo128379i(false)).get(0) != null && ((C100755z) ((LinkedList) favoriteNormalAdapter2.mo128379i(false)).get(0)).field_type == 3) {
                    Log.m105924i("MicroMsg.FavoriteMenuHelper", "[shareFavToFriRequest] select first is FAV_ITEM_TYPE_VOICE");
                    C76879j.m92726T(context2, context2.getString(C0966R.string.cqy));
                    return false;
                }
            } else {
                intent.putExtra("Retr_Msg_Type", 17);
                C100703e0 e0Var = new C100703e0();
                for (C100755z next : favoriteNormalAdapter2.mo128379i(false)) {
                    if (!e0Var.mo140134c(next)) {
                        i3++;
                        if (next != null) {
                            ((C100759z0) C86312j.m106911c(cls)).mo61499ni(Long.valueOf(next.field_localId));
                        }
                    }
                }
                intent.putExtra("select_count", i3);
            }
            C100717j0.m131781c(intent, zVar2);
            C88144b.m109802t(context2, ".ui.transmit.SelectConversationUI", intent, 4105);
            return true;
        } else if (i2 != 4106) {
            return false;
        } else {
            Intent intent2 = new Intent();
            intent2.putExtra("Select_Conv_Type", 3);
            intent2.putExtra("scene_from", 1);
            intent2.putExtra("mutil_select_is_ret", true);
            if (zVar2 != null) {
                intent2.putExtra("select_fav_local_id", zVar2.field_localId);
                if (zVar2.f295172Q0) {
                    intent2.putExtra("select_fav_fake_local_id", zVar2.f295174S0);
                }
                if (zVar2.field_type == 19) {
                    intent2.putExtra("appbrand_params", C93663j.m118353b(zVar));
                }
                ((C100759z0) C86312j.m106911c(cls)).mo61499ni(Long.valueOf(zVar2.field_localId));
            }
            if (!(zVar2 == null || m118446c(zVar2.field_type) == -1)) {
                intent2.putExtra("Retr_Msg_Type", m118446c(zVar2.field_type));
            }
            intent2.putExtra("scene_from", 1);
            C100717j0.m131781c(intent2, zVar2);
            C88144b.m109802t(context2, ".ui.transmit.SelectConversationUI", intent2, 4106);
            return true;
        }
    }

    /* renamed from: h */
    public static boolean m118451h(Context context, int i, List<C100755z> list) {
        Context context2 = context;
        int i2 = i;
        List<C100755z> list2 = list;
        Class cls = C100759z0.class;
        if (i2 == 4105) {
            Intent intent = new Intent();
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("scene_from", 1);
            intent.putExtra("mutil_select_is_ret", true);
            if (list.size() == 1) {
                C100755z zVar = list2.get(0);
                intent.putExtra("select_fav_local_id", zVar.field_localId);
                if (zVar.f295172Q0) {
                    intent.putExtra("select_fav_fake_local_id", zVar.f295174S0);
                }
                if (m118446c(zVar.field_type) != -1) {
                    intent.putExtra("Retr_Msg_Type", m118446c(zVar.field_type));
                }
                ((C100759z0) C86312j.m106911c(cls)).mo61499ni(Long.valueOf(zVar.field_localId));
                if (list2.get(0) != null && list2.get(0).field_type == 3) {
                    C76879j.m92726T(context2, context2.getString(C0966R.string.cqy));
                    return false;
                }
            } else {
                intent.putExtra("Retr_Msg_Type", 17);
                C100703e0 e0Var = new C100703e0();
                int i3 = 0;
                for (C100755z next : list) {
                    if (!e0Var.mo140134c(next)) {
                        i3++;
                        if (next != null) {
                            ((C100759z0) C86312j.m106911c(cls)).mo61499ni(Long.valueOf(next.field_localId));
                        }
                    }
                }
                intent.putExtra("select_count", i3);
            }
            C88144b.m109802t(context2, ".ui.transmit.SelectConversationUI", intent, 4105);
            return true;
        } else if (i2 != 4106) {
            return false;
        } else {
            C100755z zVar2 = list2.get(0);
            Intent intent2 = new Intent();
            intent2.putExtra("Select_Conv_Type", 3);
            intent2.putExtra("scene_from", 1);
            intent2.putExtra("mutil_select_is_ret", true);
            if (zVar2 != null) {
                intent2.putExtra("select_fav_local_id", zVar2.field_localId);
                if (zVar2.f295172Q0) {
                    intent2.putExtra("select_fav_fake_local_id", zVar2.f295174S0);
                }
                if (zVar2.field_type == 19) {
                    intent2.putExtra("appbrand_params", C93663j.m118353b(zVar2));
                }
                ((C100759z0) C86312j.m106911c(cls)).mo61499ni(Long.valueOf(zVar2.field_localId));
            }
            if (!(zVar2 == null || m118446c(zVar2.field_type) == -1)) {
                intent2.putExtra("Retr_Msg_Type", m118446c(zVar2.field_type));
            }
            intent2.putExtra("scene_from", 1);
            C88144b.m109802t(context2, ".ui.transmit.SelectConversationUI", intent2, 4106);
            return true;
        }
    }
}

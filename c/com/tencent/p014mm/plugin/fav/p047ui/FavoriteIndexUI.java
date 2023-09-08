package com.tencent.p014mm.plugin.fav.p047ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C39818r;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.C85985z2;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.fav.p047ui.adapter.C93486a;
import com.tencent.p014mm.plugin.fav.p047ui.adapter.FavoriteNormalAdapter;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import eb0.C45612m0;
import f40.C86709a0;
import fc1.C58945a;
import ht1.C60200t1;
import j20.C117292a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import ke3.C88144b;
import kg3.C76577a;
import l31.C61212e;
import lc1.c$$e;
import lc1.c$$f;
import nj3.C76879j;
import o31.C11345b;
import o31.C76986a;
import o90.C100301b;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONException;
import org.json.JSONObject;
import p447aw.C103918d;
import p645pj.C77092c;
import p823sg.C101611g;
import pb1.C100695a0;
import pb1.C100699c0;
import pb1.C100703e0;
import pb1.C100710h0;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100747v;
import pb1.C100755z;
import pc1.C100774c;
import pc1.C77075f;
import qo3.C77407n;
import te3.C101756ae0;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C101871zc0;
import te3.C64682rk1;
import uo3.C78253a;
import wc3.C78538u;
import xb1.C102614d;

/* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteIndexUI */
public class FavoriteIndexUI extends FavBaseUI implements c$$f, C77075f.C77076a {

    /* renamed from: R */
    public static final /* synthetic */ int f269910R = 0;

    /* renamed from: G */
    public long f269911G = 0;

    /* renamed from: H */
    public FavoriteNormalAdapter f269912H;

    /* renamed from: I */
    public C100774c f269913I;

    /* renamed from: J */
    public C100755z f269914J;

    /* renamed from: K */
    public int f269915K = 0;

    /* renamed from: L */
    public int[] f269916L = new int[2];

    /* renamed from: M */
    public C11385n f269917M = new C93469m();

    /* renamed from: N */
    public AdapterView.OnItemLongClickListener f269918N = new C93472o();

    /* renamed from: P */
    public C100755z f269919P;

    /* renamed from: Q */
    public View.OnClickListener f269920Q = new C93463b();

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$g */
    public class C68896g implements DialogInterface.OnClickListener {
        public C68896g() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(FavoriteIndexUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$i */
    public class C68897i implements DialogInterface.OnClickListener {
        public C68897i(FavoriteIndexUI favoriteIndexUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$j */
    public class C68898j implements DialogInterface.OnClickListener {
        public C68898j() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(FavoriteIndexUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$k */
    public class C68899k implements DialogInterface.OnClickListener {
        public C68899k(FavoriteIndexUI favoriteIndexUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$l */
    public class C68900l implements View.OnTouchListener {
        public C68900l() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/FavoriteIndexUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            if (motionEvent.getAction() == 0) {
                FavoriteIndexUI.this.f269916L[0] = (int) motionEvent.getRawX();
                FavoriteIndexUI.this.f269916L[1] = (int) motionEvent.getRawY();
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/fav/ui/FavoriteIndexUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$a */
    public class C93462a implements Runnable {
        public C93462a() {
        }

        public void run() {
            C77075f fVar = FavoriteIndexUI.this.f269630q;
            if (fVar != null) {
                fVar.mo107387c();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$b */
    public class C93463b implements View.OnClickListener {
        public C93463b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/fav/ui/FavoriteIndexUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            int intValue = ((Integer) view.getTag()).intValue();
            Intent intent = new Intent();
            intent.putExtra("key_enter_fav_search_from", 0);
            if (intValue == 20) {
                C93745z1.m118447d(FavoriteIndexUI.this.getContext(), intent);
            } else {
                intent.putExtra("key_preset_search_type", intValue);
                AppCompatActivity context = FavoriteIndexUI.this.getContext();
                if (FavoriteIndexUI.this.f269912H.f269981q) {
                    intent.putExtra("key_search_type", 2);
                    C100734q.m131877u0(context, ".ui.FavFilterUI", intent, 4103, (Bundle) null);
                } else {
                    C100734q.m131875t0(context, ".ui.FavFilterUI", intent, (Bundle) null);
                }
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/fav/ui/FavoriteIndexUI$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$c */
    public class C93464c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Dialog f269923d;

        /* renamed from: e */
        public final /* synthetic */ String f269924e;

        /* renamed from: f */
        public final /* synthetic */ List f269925f;

        public C93464c(Dialog dialog, String str, List list) {
            this.f269923d = dialog;
            this.f269924e = str;
            this.f269925f = list;
        }

        public void run() {
            this.f269923d.dismiss();
            FavoriteIndexUI favoriteIndexUI = FavoriteIndexUI.this;
            C75026b.m89951a(favoriteIndexUI, favoriteIndexUI.getString(C0966R.string.cmm));
            C93745z1.m118449f(FavoriteIndexUI.this, this.f269924e, this.f269925f, true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$d */
    public class C93465d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f269927d;

        public C93465d(ArrayList arrayList) {
            this.f269927d = arrayList;
        }

        public void run() {
            FavoriteIndexUI.this.f269621e = true;
            C93689q0.m118390b(this.f269927d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$e */
    public class C93466e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ArrayList f269929d;

        public C93466e(ArrayList arrayList) {
            this.f269929d = arrayList;
        }

        public void run() {
            FavoriteIndexUI.this.f269621e = true;
            C93689q0.m118390b(this.f269929d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$f */
    public class C93467f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ double f269931d;

        /* renamed from: e */
        public final /* synthetic */ double f269932e;

        /* renamed from: f */
        public final /* synthetic */ int f269933f;

        /* renamed from: g */
        public final /* synthetic */ String f269934g;

        /* renamed from: h */
        public final /* synthetic */ CharSequence f269935h;

        /* renamed from: i */
        public final /* synthetic */ String f269936i;

        /* renamed from: j */
        public final /* synthetic */ ArrayList f269937j;

        public C93467f(double d, double d2, int i, String str, CharSequence charSequence, String str2, ArrayList arrayList) {
            this.f269931d = d;
            this.f269932e = d2;
            this.f269933f = i;
            this.f269934g = str;
            this.f269935h = charSequence;
            this.f269936i = str2;
            this.f269937j = arrayList;
        }

        public void run() {
            C101871zc0 zc02;
            FavoriteIndexUI.this.f269621e = true;
            double d = this.f269931d;
            double d2 = this.f269932e;
            int i = this.f269933f;
            String str = this.f269934g;
            CharSequence charSequence = this.f269935h;
            String str2 = this.f269936i;
            ArrayList<String> arrayList = this.f269937j;
            C101871zc0 zc03 = new C101871zc0();
            zc03.mo141339v(str);
            zc03.mo141340w(d);
            zc03.mo141341x(d2);
            zc03.mo141323F(i);
            zc03.mo141322E(str2);
            C100755z zVar = new C100755z();
            zVar.field_type = 6;
            zVar.field_sourceType = 6;
            zVar.field_favProto.mo141215m(zc03);
            if (charSequence != null && !Util.isNullOrNil(charSequence.toString())) {
                C101801kd0 kd02 = zVar.field_favProto;
                kd02.f298624o = charSequence.toString();
                kd02.f298625p = true;
                C101801kd0 kd03 = zVar.field_favProto;
                kd03.f298630u = Util.nowMilliSecond();
                kd03.f298631v = true;
                C115669n.INSTANCE.mo160131h(10873, 6);
            }
            C93689q0.m118393e(zVar);
            if (arrayList != null && !arrayList.isEmpty()) {
                for (String l2 : arrayList) {
                    zVar.mo140183l2(l2);
                }
            }
            C93658i.m118346a(zVar);
            C115669n.INSTANCE.mo160131h(10648, 3, 0);
            long j = zVar.field_localId;
            C100734q.f295127b = j;
            C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(j);
            if (Yt != null && (zc02 = Yt.field_favProto.f298620h) != null) {
                C100734q.m131879v0(j, zc02, "", "", new ArrayList(), FavoriteIndexUI.this.getContext(), true, true);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$h */
    public class C93468h implements MenuItem.OnMenuItemClickListener {
        public C93468h() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            FavoriteIndexUI favoriteIndexUI = FavoriteIndexUI.this;
            if (favoriteIndexUI.f269912H.f269981q) {
                favoriteIndexUI.mo128341U7();
                return true;
            }
            favoriteIndexUI.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$m */
    public class C93469m implements C11385n {

        /* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$m$a */
        public class C93470a implements Runnable {
            public C93470a() {
            }

            public void run() {
                FavoriteIndexUI.this.f269630q.mo107387c();
            }
        }

        public C93469m() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            Log.m105924i("MicroMsg.FavoriteIndexUI", "onUsedCapacityChanged");
            FavoriteIndexUI.this.f269630q.post(new C93470a());
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$n */
    public class C93471n implements Runnable {
        public C93471n(FavoriteIndexUI favoriteIndexUI) {
        }

        public void run() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$o */
    public class C93472o implements AdapterView.OnItemLongClickListener {
        public C93472o() {
        }

        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            int i2 = i;
            if (i2 < FavoriteIndexUI.this.f269624h.getHeaderViewsCount()) {
                Log.m105928w("MicroMsg.FavoriteIndexUI", "on header view long click, ignore");
                return true;
            }
            FavoriteIndexUI favoriteIndexUI = FavoriteIndexUI.this;
            int[] iArr = favoriteIndexUI.f269916L;
            new C78253a(favoriteIndexUI.getContext(), view).mo108272g(view, i, j, new C93734x1(favoriteIndexUI, i2, j), new C93741y1(favoriteIndexUI, i2), iArr[0], iArr[1]);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$p */
    public class C93473p implements C93486a.C93487a {
        public C93473p() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$q */
    public class C93474q implements Runnable {
        public C93474q() {
        }

        public void run() {
            FavoriteIndexUI.this.f269630q.mo107387c();
        }
    }

    /* renamed from: R7 */
    public static void m118088R7(FavoriteIndexUI favoriteIndexUI, Context context, int i, FavoriteNormalAdapter favoriteNormalAdapter, C100755z zVar) {
        String str;
        favoriteIndexUI.getClass();
        long h = C77092c.m93046h();
        long j = 0;
        int i2 = C0966R.string.cne;
        if (4105 == i) {
            if (favoriteNormalAdapter != null) {
                j = favoriteNormalAdapter.mo128382k();
            }
            str = "fav_multi_send,";
        } else if (4106 == i) {
            if (zVar != null) {
                j = zVar.field_datatotalsize;
            }
            if (zVar.field_type == 18) {
                h = C77092c.m93045g();
                i2 = C0966R.string.cnf;
            } else {
                h = C77092c.m93046h();
                i2 = C0966R.string.cng;
            }
            str = "fav_trans_send,";
        } else {
            str = "";
        }
        boolean z = false;
        Log.m105925i("MicroMsg.FavoriteMenuHelper", "%s totalSize:%s, maxLimitSize:%s", str, Long.valueOf(j), Long.valueOf(h));
        if (j > h) {
            C76879j.m92726T(context, context.getString(i2, new Object[]{Util.getSizeKB(h)}));
            z = true;
        }
        if (!z && C93745z1.m118450g(context, i, favoriteNormalAdapter, zVar)) {
            C100699c0.m131739a(".ui.transmit.SelectConversationUI");
        }
    }

    /* renamed from: T7 */
    public static boolean m118089T7(List<C100755z> list, Context context, DialogInterface.OnClickListener onClickListener) {
        C101801kd0 kd02;
        List<C100755z> list2 = list;
        Context context2 = context;
        int i = 1;
        if (list2 == null || list.isEmpty()) {
            return true;
        }
        C100703e0 e0Var = new C100703e0();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        boolean z = false;
        for (C100755z next : list) {
            if (!(next == null || (kd02 = next.field_favProto) == null || kd02.f298618f == null)) {
                int i8 = next.field_type;
                if (i8 == 3) {
                    i5++;
                } else if (i8 != 19 || !C93663j.m118352a(kd02.f298610I)) {
                    if (next.field_type == 5) {
                        C101756ae0 ae02 = next.field_favProto.f298622j;
                        if (ae02 != null && ae02.f297879w == i) {
                            i7++;
                        }
                    }
                    Iterator<C101834rc0> it = next.field_favProto.f298618f.iterator();
                    int i9 = 0;
                    while (it.hasNext()) {
                        int i15 = it.next().f299322q1;
                        if (i15 == 2) {
                            i2++;
                        } else if (i15 == 1) {
                            i3++;
                        } else {
                            i9++;
                        }
                    }
                    if (e0Var.mo140132a(next)) {
                        i4++;
                        if (i9 > 0) {
                            i9--;
                        }
                    }
                    if (!z && i9 == next.field_favProto.f298618f.size()) {
                        i = 1;
                        z = true;
                    }
                } else {
                    i6++;
                }
            }
            i = 1;
        }
        if (1 == list.size()) {
            if (list2.get(0).field_type == 14 && (i2 > 0 || i3 > 0)) {
                C76879j.m92726T(context2, context2.getString(C0966R.string.cnh));
                return false;
            } else if (i2 > 0) {
                C76879j.m92726T(context2, context2.getString(C0966R.string.cni, new Object[]{Integer.valueOf(((C100718j1) C86312j.m106911c(C100718j1.class)).mo128200Jt(true, list2.get(0).field_type))}));
                return false;
            } else if (i3 > 0) {
                int i16 = list2.get(0).field_type;
                if (i16 != 2) {
                    if (i16 != 4) {
                        if (i16 == 8) {
                            C76879j.m92726T(context2, context2.getString(C0966R.string.cnj));
                            return false;
                        } else if (i16 != 16) {
                            return false;
                        }
                    }
                    C76879j.m92726T(context2, context2.getString(C0966R.string.cnl));
                    return false;
                }
                C76879j.m92726T(context2, context2.getString(C0966R.string.cnk));
                return false;
            } else if (i4 > 0) {
                C76879j.m92726T(context2, context2.getString(C0966R.string.f7260k));
                return false;
            } else if (i5 > 0) {
                C76879j.m92726T(context2, context2.getString(C0966R.string.f7261l));
                return false;
            } else if (i6 > 0) {
                C76879j.m92726T(context2, context2.getString(C0966R.string.f7258i));
                return false;
            } else if (i7 <= 0) {
                return true;
            } else {
                C76879j.m92726T(context2, context2.getString(C0966R.string.f7262m));
                return false;
            }
        } else if (i2 <= 0 && i3 <= 0 && i4 <= 0 && i5 <= 0 && i6 <= 0 && i7 <= 0) {
            return true;
        } else {
            if (z) {
                C76879j.m92708B(context, context2.getString(C0966R.string.cnn), "", context2.getString(C0966R.string.bjb), context2.getString(C0966R.string.bj_), onClickListener, (DialogInterface.OnClickListener) null, C0966R.color.akw);
                return false;
            }
            C76879j.m92726T(context2, context2.getString(C0966R.string.cnm));
            return false;
        }
    }

    /* renamed from: H7 */
    public boolean mo128223H7() {
        return ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq().getCount() > 0;
    }

    /* renamed from: K7 */
    public C93486a mo128226K7() {
        if (this.f269912H == null) {
            FavoriteNormalAdapter favoriteNormalAdapter = new FavoriteNormalAdapter(getContext(), this.f269632s, false);
            this.f269912H = favoriteNormalAdapter;
            favoriteNormalAdapter.f269995h = new C93473p();
            favoriteNormalAdapter.f269987w = this;
            favoriteNormalAdapter.f269970A = 1;
            favoriteNormalAdapter.f269973D = this.f269624h;
        }
        return this.f269912H;
    }

    /* renamed from: L7 */
    public View.OnClickListener mo128227L7() {
        return this.f269920Q;
    }

    /* renamed from: N7 */
    public void mo128229N7() {
        super.mo128229N7();
        this.f269630q.mo107385a(false);
    }

    /* renamed from: O7 */
    public void mo128230O7() {
        this.f269630q.post(new C93474q());
    }

    /* renamed from: P7 */
    public void mo128231P7() {
        this.f269625i.setCompoundDrawablesWithIntrinsicBounds(0, C0966R.C0969drawable.bfw, 0, 0);
        this.f269625i.setCompoundDrawablePadding(C76577a.m92151b(getContext(), 10));
        this.f269625i.setText(C0966R.string.cnu);
    }

    /* renamed from: Q7 */
    public void mo128232Q7() {
        super.mo128232Q7();
        this.f269626j.post(new C93471n(this));
    }

    /* renamed from: S7 */
    public final void mo128340S7(List<C100755z> list, String str, String str2) {
        if (list != null && !list.isEmpty() && !Util.isNullOrNil(str2)) {
            boolean U5 = C72996z1.m85820U5(str2);
            C100703e0 e0Var = new C100703e0();
            LinkedList<C100755z> linkedList = new LinkedList<>();
            Iterator<C100755z> it = list.iterator();
            while (true) {
                int i = 0;
                if (!it.hasNext()) {
                    break;
                }
                C100755z next = it.next();
                if (!e0Var.mo140134c(next)) {
                    C100695a0.m131729d(next.field_localId, 1, 0, this.f269915K);
                    linkedList.add(next);
                    C100710h0.C100712b bVar = U5 ? C100710h0.C100712b.Chatroom : C100710h0.C100712b.Chat;
                    C100710h0.C100713c cVar = C100710h0.C100713c.Samll;
                    if (U5) {
                        i = C45612m0.m50697n(str2);
                    }
                    C100710h0.m131766c(bVar, next, cVar, i);
                }
            }
            if (linkedList.isEmpty()) {
                Log.m105924i("MicroMsg.FavoriteIndexUI", "after filter, nothing");
                C76879j.m92726T(getApplicationContext(), getString(C0966R.string.cqy));
                return;
            }
            C93594f1.m118180h(getContext(), str2, str, linkedList, new C93464c(C76879j.m92723Q(getContext(), "", getString(C0966R.string.col), true, false, (DialogInterface.OnCancelListener) null), str2, linkedList));
            LinkedList linkedList2 = new LinkedList();
            for (C100755z zVar : linkedList) {
                if (zVar != null && zVar.field_type == 5) {
                    C101801kd0 kd02 = zVar.field_favProto;
                    C101756ae0 ae02 = kd02.f298622j;
                    String str3 = "";
                    String str4 = ae02 != null ? ae02.f297867h : str3;
                    if (kd02.f298616d != null && Util.isNullOrNil(str4)) {
                        str4 = zVar.field_favProto.f298616d.f299364y;
                    }
                    if (!Util.isNullOrNil(str4)) {
                        Log.m105919d("MicroMsg.FavoriteIndexUI", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", 13378, str4, Long.valueOf(this.f269911G), 4, 1, 1);
                        try {
                            str3 = URLEncoder.encode(str4, "UTF-8");
                        } catch (UnsupportedEncodingException e) {
                            Log.printErrStackTrace("MicroMsg.FavoriteIndexUI", e, str3, new Object[0]);
                        }
                        C115669n.INSTANCE.mo160131h(13378, str3, Long.valueOf(this.f269911G), 4, 1, 1);
                    }
                } else if (zVar != null && zVar.field_type == 20) {
                    C64682rk1 rk12 = zVar.field_favProto.f298614M;
                    linkedList2.add(new Pair(rk12.f185183d, rk12.f185191o));
                }
            }
            if (linkedList2.size() > 0) {
                ((C60200t1) C86312j.m106911c(C60200t1.class)).Tr0(linkedList2, false);
            }
            C115669n.INSTANCE.mo160131h(11125, Integer.valueOf(linkedList.size()), 1);
        }
    }

    /* renamed from: U7 */
    public final void mo128341U7() {
        this.f269912H.mo128371f(false, (C100755z) null);
        this.f269624h.setOnItemLongClickListener(this.f269918N);
        showOptionMenu(11, true);
        this.f269913I.mo140209b();
    }

    /* renamed from: g3 */
    public void mo128246g3(long j, boolean z) {
        FavoriteNormalAdapter favoriteNormalAdapter = this.f269912H;
        if (favoriteNormalAdapter.f269981q) {
            this.f269913I.mo140208a(favoriteNormalAdapter.mo128381j() > 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x033d, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0346, code lost:
        r10 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0347, code lost:
        if (r10 != 0) goto L_0x0358;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0349, code lost:
        nj3.C76879j.m92726T(getContext(), getString(com.tencent.p014mm.C0966R.string.cph));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0359, code lost:
        if (1 != r10) goto L_0x036a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x035b, code lost:
        nj3.C76879j.m92726T(getContext(), getString(com.tencent.p014mm.C0966R.string.f360420co0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x036a, code lost:
        if (r13 != r10) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x036c, code lost:
        p910lj.C76701a.makeText((android.content.Context) getContext(), (java.lang.CharSequence) getString(com.tencent.p014mm.C0966R.string.f360437cs2), 1).show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0380, code lost:
        if (4 != r10) goto L_0x03a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0382, code lost:
        p910lj.C76701a.makeText((android.content.Context) getContext(), (java.lang.CharSequence) getString(com.tencent.p014mm.C0966R.string.f360438cs3, new java.lang.Object[]{java.lang.Integer.valueOf(((pb1.C100718j1) di3.C86312j.m106911c(r16)).mo128211cX(true))}), 1).show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03ac, code lost:
        if (r12.f269912H.f269981q == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03ae, code lost:
        mo128341U7();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0144, code lost:
        r16 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01da, code lost:
        r13 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0265, code lost:
        r13 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0288, code lost:
        r16 = r13;
        r10 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0262  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r23, int r24, android.content.Intent r25) {
        /*
            r22 = this;
            r12 = r22
            r1 = r23
            r0 = r25
            java.lang.Class<pb1.j1> r13 = pb1.C100718j1.class
            super.onActivityResult(r23, r24, r25)
            java.lang.String r2 = ""
            r3 = 4106(0x100a, float:5.754E-42)
            r4 = 4105(0x1009, float:5.752E-42)
            if (r1 == r4) goto L_0x0016
            if (r1 == r3) goto L_0x0016
            goto L_0x001b
        L_0x0016:
            java.lang.String r5 = ".ui.transmit.SelectConversationUI"
            pb1.C100699c0.m131741c(r5, r2)
        L_0x001b:
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r23)
            r14 = 0
            r6[r14] = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r24)
            r15 = 1
            r6[r15] = r7
            java.lang.String r7 = "MicroMsg.FavoriteIndexUI"
            java.lang.String r8 = "onActivityResult reqCode: %d, retCod: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r7, r8, r6)
            r6 = 6
            r8 = -1
            r9 = 5
            r11 = 3
            r10 = 4
            r3 = r24
            if (r3 == r8) goto L_0x0108
            pb1.z r0 = r12.f269919P
            if (r0 == 0) goto L_0x0045
            int r3 = r0.field_type
            if (r3 == r9) goto L_0x004d
        L_0x0045:
            pb1.z r3 = r12.f269914J
            if (r3 == 0) goto L_0x00e1
            int r3 = r3.field_type
            if (r3 != r9) goto L_0x00e1
        L_0x004d:
            pb1.z r3 = r12.f269914J
            if (r3 == 0) goto L_0x005a
            te3.kd0 r3 = r3.field_favProto
            te3.rd0 r3 = r3.f298616d
            if (r3 == 0) goto L_0x005a
            java.lang.String r0 = r3.f299364y
            goto L_0x0078
        L_0x005a:
            te3.kd0 r0 = r0.field_favProto
            te3.ae0 r3 = r0.f298622j
            if (r3 == 0) goto L_0x0063
            java.lang.String r3 = r3.f297867h
            goto L_0x0064
        L_0x0063:
            r3 = r2
        L_0x0064:
            te3.rd0 r0 = r0.f298616d
            if (r0 == 0) goto L_0x0077
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r3)
            if (r0 == 0) goto L_0x0077
            pb1.z r0 = r12.f269919P
            te3.kd0 r0 = r0.field_favProto
            te3.rd0 r0 = r0.f298616d
            java.lang.String r0 = r0.f299364y
            goto L_0x0078
        L_0x0077:
            r0 = r3
        L_0x0078:
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r3 != 0) goto L_0x00e1
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r6 = 13378(0x3442, float:1.8747E-41)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r3[r14] = r8
            r3[r15] = r0
            r16 = r7
            long r6 = r12.f269911G
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r3[r5] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            r3[r11] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)
            r3[r10] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r3[r9] = r6
            java.lang.String r6 = "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d"
            r7 = r16
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r6, r3)
            java.lang.String r3 = "UTF-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r3)     // Catch:{ UnsupportedEncodingException -> 0x00b5 }
            goto L_0x00bc
        L_0x00b5:
            r0 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r14]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r7, r0, r2, r3)
            r0 = r2
        L_0x00bc:
            com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            java.lang.Object[] r6 = new java.lang.Object[r9]
            r6[r14] = r0
            long r7 = r12.f269911G
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r6[r15] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r6[r5] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r6[r11] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r6[r10] = r0
            r5 = 13378(0x3442, float:1.8747E-41)
            r3.mo160131h(r5, r6)
        L_0x00e1:
            if (r1 == r4) goto L_0x00fb
            r3 = 4106(0x100a, float:5.754E-42)
            if (r1 == r3) goto L_0x00e8
            goto L_0x0107
        L_0x00e8:
            pb1.z r0 = r12.f269919P
            if (r0 != 0) goto L_0x00ed
            return
        L_0x00ed:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            pb1.z r1 = r12.f269919P
            r0.add(r1)
            com.tencent.p014mm.plugin.fav.p047ui.C93745z1.m118449f(r12, r2, r0, r14)
            goto L_0x0107
        L_0x00fb:
            com.tencent.mm.plugin.fav.ui.adapter.FavoriteNormalAdapter r0 = r12.f269912H
            if (r0 != 0) goto L_0x0100
            return
        L_0x0100:
            java.util.List r0 = r0.mo128379i(r14)
            com.tencent.p014mm.plugin.fav.p047ui.C93745z1.m118449f(r12, r2, r0, r14)
        L_0x0107:
            return
        L_0x0108:
            java.lang.String r3 = "custom_send_text"
            java.lang.String r3 = r0.getStringExtra(r3)
            java.lang.String r4 = "select %s for sending"
            java.lang.String r11 = "Select_Conv_User"
            switch(r1) {
                case 4096: goto L_0x0321;
                case 4097: goto L_0x02ce;
                case 4098: goto L_0x028d;
                case 4099: goto L_0x0268;
                case 4100: goto L_0x01bf;
                case 4101: goto L_0x01bb;
                case 4102: goto L_0x01bb;
                case 4103: goto L_0x0197;
                case 4104: goto L_0x0148;
                case 4105: goto L_0x0130;
                case 4106: goto L_0x0117;
                default: goto L_0x0116;
            }
        L_0x0116:
            goto L_0x0144
        L_0x0117:
            java.lang.String r0 = r0.getStringExtra(r11)
            java.lang.Object[] r1 = new java.lang.Object[r15]
            r1[r14] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r4, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            pb1.z r2 = r12.f269919P
            r1.add(r2)
            r12.mo128340S7(r1, r3, r0)
            goto L_0x0144
        L_0x0130:
            java.lang.String r0 = r0.getStringExtra(r11)
            java.lang.Object[] r1 = new java.lang.Object[r15]
            r1[r14] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r7, r4, r1)
            com.tencent.mm.plugin.fav.ui.adapter.FavoriteNormalAdapter r1 = r12.f269912H
            java.util.List r1 = r1.mo128379i(r14)
            r12.mo128340S7(r1, r3, r0)
        L_0x0144:
            r16 = r13
            goto L_0x0265
        L_0x0148:
            com.tencent.mm.plugin.fav.ui.adapter.FavoriteNormalAdapter r1 = r12.f269912H
            java.util.List r1 = r1.mo128379i(r14)
            java.lang.String r2 = "key_fav_result_array"
            java.lang.String[] r0 = r0.getStringArrayExtra(r2)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x015c
            goto L_0x0116
        L_0x015c:
            if (r0 == 0) goto L_0x0144
            int r2 = r0.length
            if (r2 > 0) goto L_0x0162
            goto L_0x0116
        L_0x0162:
            androidx.appcompat.app.AppCompatActivity r16 = r22.getContext()
            r19 = 1
            r20 = 0
            r21 = 0
            java.lang.String r17 = ""
            java.lang.String r18 = ""
            qo3.i0 r2 = nj3.C76879j.m92723Q(r16, r17, r18, r19, r20, r21)
            com.tencent.mm.sdk.platformtools.MMHandlerThread r3 = f40.C86709a0.m107525e()
            com.tencent.mm.plugin.fav.ui.v1 r4 = new com.tencent.mm.plugin.fav.ui.v1
            r4.<init>(r12, r1, r0, r2)
            r3.postToWorker(r4)
            com.tencent.mm.plugin.report.service.n r1 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r2 = 11125(0x2b75, float:1.559E-41)
            java.lang.Object[] r3 = new java.lang.Object[r5]
            int r0 = r0.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r14] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r3[r15] = r0
            r1.mo160131h(r2, r3)
            goto L_0x0144
        L_0x0197:
            r3 = -1
            java.lang.String r1 = "key_fav_result_local_id"
            long r0 = r0.getLongExtra(r1, r3)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x01a5
            return
        L_0x01a5:
            com.tencent.mm.plugin.fav.ui.adapter.FavoriteNormalAdapter r3 = r12.f269912H
            int r0 = r3.mo128389q(r0, r2)
            if (r8 != r0) goto L_0x01ae
            return
        L_0x01ae:
            android.widget.ListView r1 = r12.f269624h
            android.view.View r2 = r12.f269628o
            r1.removeFooterView(r2)
            android.widget.ListView r1 = r12.f269624h
            r1.setSelection(r0)
            return
        L_0x01bb:
            r12.f269621e = r15
            goto L_0x0288
        L_0x01bf:
            java.lang.String r1 = "choosed_file_path"
            java.lang.String r0 = r0.getStringExtra(r1)
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x01cc
            goto L_0x01d7
        L_0x01cc:
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            r1.<init>((java.lang.String) r0)
            boolean r2 = r1.mo119967g()
            if (r2 != 0) goto L_0x01dd
        L_0x01d7:
            r16 = r13
            r10 = 1
        L_0x01da:
            r13 = 3
            goto L_0x0347
        L_0x01dd:
            long r1 = r1.mo119980r()
            di3.d r3 = di3.C86312j.m106911c(r13)
            pb1.j1 r3 = (pb1.C100718j1) r3
            long r3 = r3.mo128210aN(r15)
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 < 0) goto L_0x01f2
            r16 = r13
            goto L_0x01da
        L_0x01f2:
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r1 == 0) goto L_0x01f9
            goto L_0x0204
        L_0x01f9:
            com.tencent.mm.vfs.m1 r1 = new com.tencent.mm.vfs.m1
            r1.<init>((java.lang.String) r0)
            boolean r2 = r1.mo119967g()
            if (r2 != 0) goto L_0x0206
        L_0x0204:
            r0 = 0
            goto L_0x025a
        L_0x0206:
            pb1.z r2 = new pb1.z
            r2.<init>()
            r3 = 8
            r2.field_type = r3
            r2.field_sourceType = r6
            com.tencent.p014mm.plugin.fav.p047ui.C93689q0.m118393e(r2)
            te3.kd0 r3 = r2.field_favProto
            java.lang.String r4 = r1.getName()
            r3.mo141220r(r4)
            te3.rc0 r3 = new te3.rc0
            r3.<init>()
            r3.f299284V = r0
            r3.mo141232F(r15)
            java.lang.String r1 = r1.getName()
            r3.mo141246U(r1)
            int r1 = r2.field_type
            r3.mo141260p(r1)
            java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106454o(r0)
            r3.mo141261q(r0)
            te3.kd0 r0 = r2.field_favProto
            java.util.LinkedList<te3.rc0> r0 = r0.f298618f
            r0.add(r3)
            com.tencent.p014mm.plugin.fav.p047ui.C93658i.m118346a(r2)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 10648(0x2998, float:1.4921E-41)
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            r2[r14] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r14)
            r2[r15] = r3
            r0.mo160131h(r1, r2)
            r0 = 1
        L_0x025a:
            if (r0 == 0) goto L_0x0262
            r12.f269621e = r15
            r16 = r13
            r5 = 0
            goto L_0x0265
        L_0x0262:
            r16 = r13
            r5 = 1
        L_0x0265:
            r13 = 3
            goto L_0x0346
        L_0x0268:
            java.lang.String r1 = "CropImage_OutputPath"
            java.lang.String r0 = r0.getStringExtra(r1)
            if (r0 != 0) goto L_0x0276
            java.lang.String r0 = "crop picture resutl path is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
            return
        L_0x0276:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r0)
            com.tencent.mm.sdk.platformtools.MMHandler r0 = r12.f269627n
            com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$d r2 = new com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$d
            r2.<init>(r1)
            r0.post(r2)
        L_0x0288:
            r16 = r13
            r10 = 0
            goto L_0x01da
        L_0x028d:
            java.lang.Class<cw.g> r1 = p140cw.C7138g.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            cw.g r1 = (p140cw.C7138g) r1
            android.content.Context r2 = r22.getApplicationContext()
            java.lang.String r3 = f12.C7970a.m8127a()
            java.lang.String r0 = r1.mo8319g6(r2, r0, r3)
            if (r0 != 0) goto L_0x02aa
            java.lang.String r0 = "take picture result path is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
            return
        L_0x02aa:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "CropImageMode"
            r1.putExtra(r2, r10)
            java.lang.String r2 = "CropImage_Filter"
            r1.putExtra(r2, r15)
            java.lang.String r2 = "CropImage_ImgPath"
            r1.putExtra(r2, r0)
            androidx.appcompat.app.AppCompatActivity r0 = r22.getContext()
            java.lang.String r2 = "com.tencent.mm.ui.tools.CropImageNewUI"
            r1.setClassName(r0, r2)
            r0 = 4099(0x1003, float:5.744E-42)
            r12.startActivityForResult((android.content.Intent) r1, (int) r0)
            goto L_0x0144
        L_0x02ce:
            r3 = 0
            java.lang.String r1 = "kwebmap_slat"
            double r5 = r0.getDoubleExtra(r1, r3)
            java.lang.String r1 = "kwebmap_lng"
            double r7 = r0.getDoubleExtra(r1, r3)
            java.lang.String r1 = "kwebmap_scale"
            int r9 = r0.getIntExtra(r1, r14)
            java.lang.String r1 = "Kwebmap_locaion"
            java.lang.String r1 = r0.getStringExtra(r1)
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAs((java.lang.String) r1, (java.lang.String) r2)
            java.lang.String r1 = "kRemark"
            java.lang.CharSequence r16 = r0.getCharSequenceExtra(r1)
            java.lang.String r1 = "kPoiName"
            java.lang.String r17 = r0.getStringExtra(r1)
            java.lang.String r1 = "kTags"
            java.util.ArrayList r0 = r0.getStringArrayListExtra(r1)
            com.tencent.mm.sdk.platformtools.MMHandler r3 = r12.f269627n
            com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$f r4 = new com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$f
            r1 = r4
            r2 = r22
            r14 = r3
            r15 = r4
            r3 = r5
            r5 = r7
            r7 = r9
            r8 = r11
            r9 = r16
            r11 = 4
            r10 = r17
            r16 = r13
            r13 = 3
            r11 = r0
            r1.<init>(r3, r5, r7, r8, r9, r10, r11)
            r14.post(r15)
            goto L_0x033d
        L_0x0321:
            r16 = r13
            r13 = 3
            java.lang.String r1 = "CropImage_OutputPath_List"
            java.util.ArrayList r0 = r0.getStringArrayListExtra(r1)
            if (r0 == 0) goto L_0x033f
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0333
            goto L_0x033f
        L_0x0333:
            com.tencent.mm.sdk.platformtools.MMHandler r1 = r12.f269627n
            com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$e r2 = new com.tencent.mm.plugin.fav.ui.FavoriteIndexUI$e
            r2.<init>(r0)
            r1.post(r2)
        L_0x033d:
            r10 = 0
            goto L_0x0347
        L_0x033f:
            java.lang.String r0 = "onActivityResult pathList is null or nil"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r7, r0)
            return
        L_0x0346:
            r10 = r5
        L_0x0347:
            if (r10 != 0) goto L_0x0358
            androidx.appcompat.app.AppCompatActivity r0 = r22.getContext()
            r1 = 2131825710(0x7f11142e, float:1.9284284E38)
            java.lang.String r1 = r12.getString(r1)
            nj3.C76879j.m92726T(r0, r1)
            goto L_0x03b1
        L_0x0358:
            r1 = 1
            if (r1 != r10) goto L_0x036a
            androidx.appcompat.app.AppCompatActivity r0 = r22.getContext()
            r1 = 2131825656(0x7f1113f8, float:1.9284174E38)
            java.lang.String r1 = r12.getString(r1)
            nj3.C76879j.m92726T(r0, r1)
            goto L_0x03b1
        L_0x036a:
            if (r13 != r10) goto L_0x037f
            androidx.appcompat.app.AppCompatActivity r0 = r22.getContext()
            r2 = 2131825810(0x7f111492, float:1.9284487E38)
            java.lang.String r2 = r12.getString(r2)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r2, (int) r1)
            r0.show()
            goto L_0x03b1
        L_0x037f:
            r2 = 4
            if (r2 != r10) goto L_0x03a8
            androidx.appcompat.app.AppCompatActivity r0 = r22.getContext()
            r2 = 2131825811(0x7f111493, float:1.9284489E38)
            java.lang.Object[] r3 = new java.lang.Object[r1]
            di3.d r4 = di3.C86312j.m106911c(r16)
            pb1.j1 r4 = (pb1.C100718j1) r4
            int r4 = r4.mo128211cX(r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 0
            r3[r5] = r4
            java.lang.String r2 = r12.getString(r2, r3)
            android.widget.Toast r0 = p910lj.C76701a.makeText((android.content.Context) r0, (java.lang.CharSequence) r2, (int) r1)
            r0.show()
            goto L_0x03b1
        L_0x03a8:
            com.tencent.mm.plugin.fav.ui.adapter.FavoriteNormalAdapter r0 = r12.f269912H
            boolean r0 = r0.f269981q
            if (r0 == 0) goto L_0x03b1
            r22.mo128341U7()
        L_0x03b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.fav.p047ui.FavoriteIndexUI.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C78538u.m94869e(this, getContentView());
    }

    public void onCreate(Bundle bundle) {
        this.f269633t = this;
        Log.m105924i("MicroMsg.FavoriteIndexUI", "onCreate favoriteindex");
        super.onCreate(bundle);
        if (((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).f302175d == null) {
            Log.m105920e("MicroMsg.FavoriteIndexUI", "onCreate favoriteindex, but favorite db is null ,return");
            finish();
            return;
        }
        ((C58945a) C39818r.f106831a.mo62444c(this).mo75002a(C58945a.class)).f168655d = this.f269638y;
        setMMTitle((int) C0966R.string.cos);
        setBackBtn(new C93468h());
        this.f269624h.setOnItemLongClickListener(this.f269918N);
        this.f269624h.setOnTouchListener(new C68900l());
        C86709a0.m107524d().mo123455a(438, this.f269917M);
        C86709a0.m107524d().mo123455a(401, this.f269917M);
        LayoutInflater.from(this);
        new C77407n((Context) this, 1, false);
        new ArrayList();
        new ArrayList();
        addIconOptionMenu(11, (int) C0966R.string.cm8, (int) C0966R.raw.actionbar_icon_dark_add, (MenuItem.OnMenuItemClickListener) new C93700t1(this));
        C100774c cVar = new C100774c();
        this.f269913I = cVar;
        View findViewById = findViewById(C0966R.C0970id.f357984cv1);
        cVar.f295233a = false;
        cVar.f295234b = findViewById;
        this.f269913I.f295241i = new C93702u1(this);
        C86709a0.m107525e().postToWorker(new C93714w1(this));
        C100747v.m131897b().mo140169a((C100747v.C100750c) null);
        C101611g<String, Bitmap> gVar = C93693r.f270490a;
        C100699c0.f295044a = new Vector();
        C78538u.m94869e(this, getContentView());
        ((C61212e) C86312j.m106911c(C61212e.class)).mo86178qr(this, C11345b.FavoriteIndexUI).mo86179qs(this, C76986a.Fav);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem add = menu.add(0, 10, 0, C0966R.string.k3j);
        add.setIcon(C74933u4.m89768e(getContext(), C0966R.raw.actionbar_icon_dark_search, getResources().getColor(C0966R.color.FG_0)));
        add.setShowAsAction(2);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        if (((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).f302175d != null) {
            if (!C85875k4.m106208w()) {
                C85985z2.m106332d(getTaskId());
            }
            C86709a0.m107524d().mo123470p(438, this.f269917M);
            C86709a0.m107524d().mo123470p(401, this.f269917M);
            if (C100699c0.f295044a == null) {
                C100699c0.f295044a = null;
                C100699c0.f295045b = "";
                C100699c0.f295046c = "";
                C100699c0.f295047d = 0;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                Iterator it = ((Vector) C100699c0.f295044a).iterator();
                while (true) {
                    if (it.hasNext()) {
                        C100699c0.C100700a aVar = (C100699c0.C100700a) it.next();
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("p", aVar.f295048a);
                            jSONObject.put("tbe", aVar.f295049b);
                            jSONObject.put(LocaleUtil.INDONESIAN_NEWNAME, aVar.f295050c);
                            jSONObject.put(TPReportKeys.LiveExKeys.LIVE_EX_STREAM_ID, aVar.f295051d);
                        } catch (JSONException unused) {
                            Log.m105928w("MicroMsg.Fav.FavSearchFlowReportLogic", "end, JSONException");
                        }
                        sb.append(jSONObject.toString());
                        sb.append(";");
                        if (sb.length() > 3072) {
                            C100699c0.f295044a = null;
                            C100699c0.f295045b = "";
                            C100699c0.f295046c = "";
                            C100699c0.f295047d = 0;
                            break;
                        }
                    } else {
                        sb.append("]");
                        String sb4 = sb.toString();
                        if (sb4.length() > 3072) {
                            C100699c0.f295044a = null;
                            C100699c0.f295045b = "";
                            C100699c0.f295046c = "";
                            C100699c0.f295047d = 0;
                        } else {
                            String[] strArr = new String[3];
                            int i = 0;
                            while (i < 3) {
                                try {
                                    strArr[i] = "";
                                    i++;
                                } catch (Throwable th) {
                                    Log.m105928w("MicroMsg.Fav.FavSearchFlowReportLogic", "report flow error: " + th.getMessage());
                                }
                            }
                            int i2 = 0;
                            while (true) {
                                if (i2 < 3) {
                                    if (sb4.length() <= 1024) {
                                        strArr[i2] = sb4;
                                        break;
                                    }
                                    strArr[i2] = sb4.substring(0, 1024);
                                    sb4 = sb4.substring(1024);
                                    i2++;
                                } else {
                                    break;
                                }
                            }
                            C115669n.INSTANCE.mo160131h(15508, strArr[0], strArr[1], strArr[2]);
                            C100699c0.f295044a = null;
                            C100699c0.f295045b = "";
                            C100699c0.f295046c = "";
                            C100699c0.f295047d = 0;
                        }
                    }
                }
            }
            C101611g<String, Bitmap> gVar = C93693r.f270490a;
            C93693r.f270490a = new C100301b(20, C93693r.class);
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        FavoriteNormalAdapter favoriteNormalAdapter = this.f269912H;
        if (favoriteNormalAdapter != null) {
            favoriteNormalAdapter.onItemClick(adapterView, view, i, j);
            c$$e c__e = (c$$e) view.getTag();
            if (c__e == null) {
                Log.m105928w("MicroMsg.FavoriteIndexUI", "on item click, holder is null..");
                return;
            }
            C100755z zVar = c__e.f291387a;
            if (zVar == null) {
                Log.m105928w("MicroMsg.FavoriteIndexUI", "on item click, info is null..");
                return;
            }
            Log.m105925i("MicroMsg.FavoriteIndexUI", "click type is %d", Integer.valueOf(zVar.field_type));
            C115669n.INSTANCE.mo160131h(12746, Integer.valueOf(c__e.f291387a.field_type), 0, Integer.valueOf(i - 1));
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (4 != i || !this.f269912H.f269981q) {
            return super.onKeyUp(i, keyEvent);
        }
        mo128341U7();
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 10) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent intent = new Intent();
        intent.putExtra("key_enter_fav_search_from", 0);
        C93745z1.m118448e(getContext(), this.f269912H.f269981q, intent);
        return true;
    }

    public void onPause() {
        super.onPause();
        C100699c0.m131741c(getClass().getSimpleName(), "");
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.FavoriteIndexUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.FavoriteIndexUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i != 64) {
            if (i == 80) {
                if (iArr[0] == 0) {
                    C100734q.m131877u0(this, ".ui.FavPostVoiceUI", new Intent(), 4102, (Bundle) null);
                    BackwardSupportUtil.AnimationHelper.overridePendingTransition(this, 0, 0);
                    return;
                }
                C76879j.m92709C(this, getString(C0966R.string.f361130hi2), "", getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new C68896g(), new C68897i(this));
            }
        } else if (iArr[0] == 0) {
            Intent intent = new Intent();
            intent.putExtra("MMActivity.OverrideExitAnimation", C0966R.C0968anim.f2469dt);
            intent.putExtra("MMActivity.OverrideEnterAnimation", C0966R.C0968anim.f2393bw);
            intent.putExtra("map_view_type", 3);
            C88144b.m109795m(this, FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", intent, 4097);
        } else {
            C76879j.m92709C(this, getString(C0966R.string.f361129hi0), "", getString(C0966R.string.fyd), getString(C0966R.string.f7926wf), false, new C68898j(), new C68899k(this));
        }
    }

    public void onResume() {
        long currentTimeMillis = System.currentTimeMillis();
        super.onResume();
        this.f269626j.post(new C93462a());
        Log.m105919d("MicroMsg.FavoriteIndexUI", "on resume use %d ms", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        C100699c0.m131739a(getClass().getSimpleName());
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C58945a.class);
    }
}

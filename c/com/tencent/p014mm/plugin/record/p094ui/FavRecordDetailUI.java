package com.tencent.p014mm.plugin.record.p094ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.fav.p047ui.C93685p0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorage;
import com.tencent.p014mm.sdk.storage.MStorageEventData;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import di3.C86312j;
import eb0.C45626r0;
import eb0.C75592q0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ke3.C88144b;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import p645pj.C77092c;
import pb1.C100695a0;
import pb1.C100718j1;
import pb1.C100734q;
import pb1.C100755z;
import qg2.C101147j0;
import qg2.C101169u;
import qg2.C62618v0;
import qo3.C77407n;
import qo3.C89779i0;
import te3.C101801kd0;
import te3.C101834rc0;
import te3.C101835rd0;
import xb1.C102612a;
import xb1.C102614d;

/* renamed from: com.tencent.mm.plugin.record.ui.FavRecordDetailUI */
public class FavRecordDetailUI extends RecordMsgBaseUI {

    /* renamed from: z */
    public static final /* synthetic */ int f272514z = 0;

    /* renamed from: s */
    public long f272515s = -1;

    /* renamed from: t */
    public boolean f272516t = true;

    /* renamed from: u */
    public C100755z f272517u;

    /* renamed from: v */
    public boolean f272518v = true;

    /* renamed from: w */
    public boolean f272519w = false;

    /* renamed from: x */
    public TranslateHelper f272520x;

    /* renamed from: y */
    public MStorage.IOnStorageChange f272521y = new C94324a();

    /* renamed from: com.tencent.mm.plugin.record.ui.FavRecordDetailUI$a */
    public class C94324a implements MStorage.IOnStorageChange {

        /* renamed from: com.tencent.mm.plugin.record.ui.FavRecordDetailUI$a$a */
        public class C94325a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C94347b f272523d;

            public C94325a(C94347b bVar) {
                this.f272523d = bVar;
            }

            public void run() {
                FavRecordDetailUI.this.f272537n.mo129741h(this.f272523d);
            }
        }

        public C94324a() {
        }

        public void onNotifyChange(String str, MStorageEventData mStorageEventData) {
            Object obj;
            C101801kd0 kd02;
            if (mStorageEventData != null && (obj = mStorageEventData.obj) != null) {
                long longValue = ((Long) obj).longValue();
                if (longValue >= 0) {
                    long j = FavRecordDetailUI.this.f272515s;
                    if (j == longValue) {
                        C100755z a = C101169u.m132684a(j);
                        C94347b bVar = new C94347b();
                        bVar.f272700c = a;
                        if (a != null && (kd02 = a.field_favProto) != null) {
                            bVar.f272698a = kd02.f298618f;
                            MMHandlerThread.postToMainThread(new C94325a(bVar));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.record.ui.FavRecordDetailUI$b */
    public class C94326b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: com.tencent.mm.plugin.record.ui.FavRecordDetailUI$b$a */
        public class C94327a implements C11182m0 {
            public C94327a() {
            }

            public void onCreateMMMenu(C76874e0 e0Var) {
                Log.m105925i("MicroMsg.FavRecordDetailUI", "favItemInfo: id %d, status %d", Integer.valueOf(FavRecordDetailUI.this.f272517u.field_id), Integer.valueOf(FavRecordDetailUI.this.f272517u.field_itemStatus));
                C100755z zVar = FavRecordDetailUI.this.f272517u;
                if (zVar.field_id > 0 && !zVar.mo140175B2() && !FavRecordDetailUI.this.f272517u.mo140174A2()) {
                    FavRecordDetailUI favRecordDetailUI = FavRecordDetailUI.this;
                    if (favRecordDetailUI.f272518v) {
                        e0Var.mo107142f(0, favRecordDetailUI.getString(C0966R.string.crb));
                    }
                }
                e0Var.mo107142f(5, FavRecordDetailUI.this.getString(C0966R.string.cqz));
                e0Var.mo107142f(3, FavRecordDetailUI.this.getString(C0966R.string.cnr));
                e0Var.mo107142f(2, FavRecordDetailUI.this.getString(C0966R.string.f7944x1));
            }
        }

        /* renamed from: com.tencent.mm.plugin.record.ui.FavRecordDetailUI$b$b */
        public class C94328b implements C11184p0 {

            /* renamed from: com.tencent.mm.plugin.record.ui.FavRecordDetailUI$b$b$a */
            public class C94329a implements DialogInterface.OnClickListener {

                /* renamed from: com.tencent.mm.plugin.record.ui.FavRecordDetailUI$b$b$a$a */
                public class C94330a implements Runnable {

                    /* renamed from: d */
                    public final /* synthetic */ C89779i0 f272529d;

                    public C94330a(C89779i0 i0Var) {
                        this.f272529d = i0Var;
                    }

                    public void run() {
                        this.f272529d.dismiss();
                        Log.m105919d("MicroMsg.FavRecordDetailUI", "do del, local id %d", Long.valueOf(FavRecordDetailUI.this.f272515s));
                        FavRecordDetailUI.this.finish();
                    }
                }

                public C94329a() {
                }

                public void onClick(DialogInterface dialogInterface, int i) {
                    C89779i0 Q = C76879j.m92723Q(FavRecordDetailUI.this.getContext(), "", FavRecordDetailUI.this.getString(C0966R.string.f7946x3), false, false, (DialogInterface.OnCancelListener) null);
                    FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
                    FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
                    aVar.f264835a = 12;
                    aVar.f264854t = 20;
                    aVar.f264839e = FavRecordDetailUI.this.f272515s;
                    aVar.f264844j = new C94330a(Q);
                    favoriteOperationEvent.publish();
                }
            }

            public C94328b() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                int itemId = menuItem.getItemId();
                if (itemId == 0) {
                    int i2 = C0966R.string.cng;
                    long h = C77092c.m93046h();
                    if (FavRecordDetailUI.this.f272517u.field_type == 18) {
                        i2 = C0966R.string.cnf;
                        h = C77092c.m93045g();
                    }
                    FavRecordDetailUI favRecordDetailUI = FavRecordDetailUI.this;
                    long j = favRecordDetailUI.f272517u.field_localId;
                    favRecordDetailUI.getClass();
                    C100755z Yt = ((C102614d) ((C100718j1) C86312j.m106911c(C100718j1.class)).mo128199Jq()).mo142266Yt(j);
                    long j2 = Yt != null ? Yt.field_datatotalsize : 0;
                    Log.m105925i("MicroMsg.FavRecordDetailUI", "checkIfOverTotalSizeLimit, totalSize:%s", Long.valueOf(j2));
                    if (j2 > h) {
                        C76879j.m92726T(FavRecordDetailUI.this.getContext(), FavRecordDetailUI.this.getString(i2, new Object[]{Util.getSizeKB(h)}));
                        return;
                    }
                    Intent intent = new Intent();
                    intent.putExtra("Select_Conv_Type", 3);
                    intent.putExtra("scene_from", 1);
                    intent.putExtra("mutil_select_is_ret", true);
                    intent.putExtra("select_fav_local_id", FavRecordDetailUI.this.f272517u.field_localId);
                    C88144b.m109802t(FavRecordDetailUI.this, ".ui.transmit.SelectConversationUI", intent, 4097);
                    C100695a0.m131729d(FavRecordDetailUI.this.f272517u.field_localId, 1, 0, -1);
                    FavRecordDetailUI.this.mo128401H7(3);
                } else if (itemId == 2) {
                    C76879j.m92750u(FavRecordDetailUI.this.getContext(), FavRecordDetailUI.this.getString(C0966R.string.f7946x3), "", new C94329a(), (DialogInterface.OnClickListener) null);
                    FavRecordDetailUI favRecordDetailUI2 = FavRecordDetailUI.this;
                    int i3 = FavRecordDetailUI.f272514z;
                    favRecordDetailUI2.mo128401H7(6);
                } else if (itemId == 3) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("key_fav_scene", 2);
                    intent2.putExtra("key_fav_item_id", FavRecordDetailUI.this.f272515s);
                    C100734q.m131875t0(FavRecordDetailUI.this.getContext(), ".ui.FavTagEditUI", intent2, (Bundle) null);
                    FavRecordDetailUI.this.mo128401H7(7);
                } else if (itemId == 4) {
                    Intent intent3 = new Intent();
                    intent3.putExtra("key_fav_scene", 1);
                    intent3.putExtra("key_fav_item_id", FavRecordDetailUI.this.f272517u.field_localId);
                    C100734q.m131875t0(FavRecordDetailUI.this.getContext(), ".ui.FavTagEditUI", intent3, (Bundle) null);
                } else if (itemId == 5) {
                    FavRecordDetailUI favRecordDetailUI3 = FavRecordDetailUI.this;
                    C93685p0.m118380b(favRecordDetailUI3, favRecordDetailUI3.f272515s, favRecordDetailUI3.f270015g);
                    FavRecordDetailUI.this.mo128401H7(5);
                }
            }
        }

        public C94326b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            C77407n nVar = new C77407n((Context) FavRecordDetailUI.this.getContext(), 1, false);
            nVar.f225771i = new C94327a();
            nVar.f225782p = new C94328b();
            nVar.mo107573q();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.record.ui.FavRecordDetailUI$c */
    public class C94331c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Dialog f272531d;

        public C94331c(Dialog dialog) {
            this.f272531d = dialog;
        }

        public void run() {
            this.f272531d.dismiss();
            FavRecordDetailUI favRecordDetailUI = FavRecordDetailUI.this;
            C75026b.m89951a(favRecordDetailUI, favRecordDetailUI.getString(C0966R.string.euo));
        }
    }

    /* renamed from: L7 */
    public C94356i mo129657L7() {
        return new C94349d(this, new C94348c(this));
    }

    /* renamed from: M7 */
    public String mo129658M7() {
        LinkedList<C101834rc0> linkedList = this.f272517u.field_favProto.f298618f;
        if (linkedList.size() > 0) {
            return linkedList.getLast().f299302f1;
        }
        return null;
    }

    /* renamed from: N7 */
    public String mo129659N7() {
        LinkedList<C101834rc0> linkedList = this.f272517u.field_favProto.f298618f;
        if (linkedList.size() > 0) {
            return linkedList.getFirst().f299302f1;
        }
        return null;
    }

    /* renamed from: O7 */
    public String mo129660O7() {
        C100755z zVar = this.f272517u;
        if (14 == zVar.field_type && !Util.isNullOrNil(zVar.field_favProto.f298626q)) {
            return this.f272517u.field_favProto.f298626q;
        }
        C101835rd0 rd02 = this.f272517u.field_favProto.f298616d;
        if (rd02 == null || Util.isNullOrNil(rd02.f299354o)) {
            Log.m105927v("MicroMsg.FavRecordDetailUI", "display name, from item info user[%s]", this.f272517u.field_fromUser);
            return C101147j0.m132638s(this.f272517u.field_fromUser);
        }
        String b = C45626r0.m50732b(rd02.f299354o);
        if (C75592q0.m90789s().equals(rd02.f299348f)) {
            String s = C101147j0.m132638s(rd02.f299350h);
            if (!Util.nullAs(s, "").equals(rd02.f299350h)) {
                b = b + " - " + s;
            }
        } else {
            String s2 = C101147j0.m132638s(rd02.f299348f);
            if (!Util.nullAs(s2, "").equals(rd02.f299348f)) {
                b = b + " - " + s2;
            }
        }
        Log.m105927v("MicroMsg.FavRecordDetailUI", "display name, source from[%s] to[%s]", rd02.f299348f, rd02.f299350h);
        return b;
    }

    /* renamed from: P7 */
    public void mo129661P7() {
        Class cls = C100718j1.class;
        this.f272515s = getIntent().getLongExtra("key_detail_info_id", -1);
        this.f272516t = getIntent().getBooleanExtra("show_share", true);
        C100755z a = C101169u.m132684a(this.f272515s);
        this.f272517u = a;
        if (a == null) {
            finish();
            return;
        }
        mo128399J7(a);
        C94347b bVar = new C94347b();
        C100755z zVar = this.f272517u;
        bVar.f272700c = zVar;
        bVar.f272698a = zVar.field_favProto.f298618f;
        bVar.f272699b = new C62618v0();
        List<C101834rc0> list = bVar.f272698a;
        if (list != null) {
            if (list.size() != 0) {
                Iterator<C101834rc0> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().f299322q1 != 0) {
                            this.f272518v = false;
                            break;
                        }
                    } else {
                        this.f272518v = true;
                        break;
                    }
                }
            } else {
                this.f272518v = false;
            }
        } else {
            this.f272518v = false;
        }
        super.mo129661P7();
        this.f272537n.mo129741h(bVar);
        this.f272520x = new TranslateHelper(this, this.f272537n, bVar);
        List<C101834rc0> list2 = bVar.f272698a;
        if (list2 != null) {
            ThreadPool.post(new C94352e(this, list2), "calc_fav_record_info");
        }
        this.f272537n.f272723t = this.f272520x;
        ((C100718j1) C86312j.m106911c(cls)).mo128199Jq().add(this.f272521y);
        ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142255jo(((C94349d) this.f272537n).f272702y);
    }

    /* renamed from: Q7 */
    public void mo129662Q7(int i, int i2, Intent intent) {
        if (4097 == i && -1 == i2) {
            FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
            FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
            aVar.f264835a = 32;
            aVar.f264839e = this.f272515s;
            favoriteOperationEvent.publish();
            if (favoriteOperationEvent.f264834e.f264863i) {
                C76879j.m92726T(getContext(), getString(C0966R.string.f7260k));
                return;
            }
            String str = null;
            String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
            if (intent != null) {
                str = intent.getStringExtra("custom_send_text");
            }
            C89779i0 Q = C76879j.m92723Q(getContext(), "", getString(C0966R.string.col), true, false, (DialogInterface.OnCancelListener) null);
            FavoriteOperationEvent favoriteOperationEvent2 = new FavoriteOperationEvent();
            FavoriteOperationEvent.C92515a aVar2 = favoriteOperationEvent2.f264833d;
            aVar2.f264835a = 13;
            aVar2.f264842h = getContext();
            FavoriteOperationEvent.C92515a aVar3 = favoriteOperationEvent2.f264833d;
            aVar3.f264845k = stringExtra;
            aVar3.f264846l = str;
            aVar3.f264839e = this.f272515s;
            aVar3.f264844j = new C94331c(Q);
            favoriteOperationEvent2.publish();
        }
    }

    /* renamed from: S7 */
    public void mo129663S7() {
        if (this.f272516t) {
            addIconOptionMenu(0, (int) C0966R.string.k3h, (int) C0966R.raw.icons_outlined_more, (MenuItem.OnMenuItemClickListener) new C94326b());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onDestroy() {
        Class cls = C100718j1.class;
        ((C100718j1) C86312j.m106911c(cls)).mo128199Jq().remove(this.f272521y);
        if (this.f272537n != null) {
            ((C102612a) ((C100718j1) C86312j.m106911c(cls)).mo128198DE()).mo142250SE(((C94349d) this.f272537n).f272702y);
        }
        this.f272519w = true;
        TranslateHelper translateHelper = this.f272520x;
        if (translateHelper != null) {
            translateHelper.mo129733b();
        }
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        TranslateHelper translateHelper = this.f272520x;
        if (translateHelper != null) {
            translateHelper.f272693d = false;
        }
    }

    public void onResume() {
        C100755z a;
        C101801kd0 kd02;
        super.onResume();
        C94347b bVar = (C94347b) ((C94349d) this.f272537n).f272721r;
        C100755z zVar = bVar.f272700c;
        if (zVar != null && (a = C101169u.m132684a(zVar.field_localId)) != null && (kd02 = a.field_favProto) != null) {
            LinkedList<C101834rc0> linkedList = kd02.f298618f;
            boolean z = false;
            Iterator<C101834rc0> it = bVar.f272698a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!linkedList.contains(it.next())) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z) {
                C94347b bVar2 = new C94347b();
                bVar2.f272700c = a;
                bVar2.f272698a = a.field_favProto.f298618f;
                this.f272537n.mo129741h(bVar2);
            }
        }
    }

    public void onStop() {
        super.onStop();
    }
}

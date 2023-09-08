package wa3;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import bb3.C28293f;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.FavoriteOperationEvent;
import com.tencent.p014mm.p136ui.C85861e4;
import com.tencent.p014mm.plugin.fav.p047ui.C93693r;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wxmm.v2helper;
import eb0.C97625j3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import os2.C100416r;
import p823sg.C101611g;
import pb1.C100734q;
import pb1.C100755z;
import te3.C101801kd0;
import te3.C101811md0;
import te3.C101834rc0;
import te3.C101835rd0;
import xa3.C102597m;
import xa3.C102599o;
import xa3.C102603s;
import xa3.C102605u;
import zt3.C119157j;

/* renamed from: wa3.j */
public class C102370j extends C102365e implements C11385n {

    /* renamed from: K */
    public static HashMap<C100755z, C102597m> f301484K = new HashMap<>();

    /* renamed from: A */
    public int f301485A = 0;

    /* renamed from: B */
    public String f301486B;

    /* renamed from: C */
    public int f301487C = 0;

    /* renamed from: D */
    public long f301488D = 0;

    /* renamed from: E */
    public C101811md0 f301489E = new C101811md0();

    /* renamed from: F */
    public String f301490F;

    /* renamed from: G */
    public String f301491G;

    /* renamed from: H */
    public byte[] f301492H = null;

    /* renamed from: I */
    public boolean f301493I = false;

    /* renamed from: J */
    public String f301494J = null;

    /* renamed from: u */
    public long f301495u = -1;

    /* renamed from: v */
    public String f301496v;

    /* renamed from: w */
    public String f301497w = "";

    /* renamed from: x */
    public C100755z f301498x;

    /* renamed from: y */
    public boolean f301499y = true;

    /* renamed from: z */
    public int f301500z = 0;

    /* renamed from: wa3.j$a */
    public class C102371a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C101801kd0 f301501d;

        public C102371a(C101801kd0 kd02) {
            this.f301501d = kd02;
        }

        public void run() {
            if (this.f301501d != null) {
                C100755z zVar = new C100755z();
                C102370j jVar = C102370j.this;
                zVar.field_localId = jVar.f301495u;
                C101801kd0 kd02 = this.f301501d;
                zVar.field_favProto = kd02;
                jVar.f301475o = kd02;
                jVar.f301468e = zVar;
                jVar.f301498x = zVar;
            }
            if (C102370j.f301484K.containsKey(C102370j.this.f301498x)) {
                C102370j jVar2 = C102370j.this;
                jVar2.f301467d = C102370j.f301484K.get(jVar2.f301498x);
            } else {
                C102370j.m135078p(C102370j.this);
            }
            C102370j jVar3 = C102370j.this;
            jVar3.mo141939a(jVar3.f301467d.f302090a, true, 2);
            C96679b bVar = C96679b.f283182r;
            if (bVar != null && bVar != null) {
                NoteEditorUI noteEditorUI = (NoteEditorUI) bVar.f283188d;
                noteEditorUI.getClass();
                noteEditorUI.mo134926U7(true);
            }
        }

        public String toString() {
            return super.toString() + "|dealWNoteInfo";
        }
    }

    public C102370j() {
        this.f301469f.clear();
        this.f301468e = null;
        this.f301474n = false;
        C101611g<String, Bitmap> gVar = C93693r.f270490a;
        C97625j3.m125815e().mo123455a(v2helper.EMethodSetAgcRxOn, this);
    }

    /* renamed from: p */
    public static void m135078p(C102370j jVar) {
        C101801kd0 kd02;
        jVar.getClass();
        C102597m mVar = new C102597m();
        jVar.f301467d = mVar;
        C100755z zVar = jVar.f301498x;
        mVar.f302091b = zVar;
        mVar.f302092c = jVar.f301495u;
        if (zVar != null && (kd02 = zVar.field_favProto) != null) {
            mVar.f302094e = jVar.f301488D;
            mVar.f302090a = kd02.f298618f;
            f301484K.put(zVar, mVar);
        }
    }

    /* renamed from: a */
    public void mo141939a(List<C101834rc0> list, boolean z, int i) {
        C100755z zVar = this.f301498x;
        if (zVar != null) {
            zVar.mo140187q2("MicroMsg.WNNoteFavProcess", C100755z.f295171W0);
        }
        super.mo141939a(list, z, i);
    }

    /* renamed from: b */
    public void mo141940b(C101834rc0 rc02) {
        C102597m mVar = this.f301467d;
        FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
        FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
        aVar.f264835a = 28;
        aVar.f264839e = mVar.f302091b.field_localId;
        aVar.f264840f = rc02;
        aVar.f264849o = "";
        aVar.f264847m = 18;
        favoriteOperationEvent.publish();
    }

    /* renamed from: c */
    public void mo141941c(C101834rc0 rc02, String str) {
        C102597m mVar = this.f301467d;
        FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
        FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
        aVar.f264835a = 28;
        aVar.f264839e = mVar.f302091b.field_localId;
        aVar.f264840f = rc02;
        aVar.f264849o = str;
        aVar.f264847m = 18;
        favoriteOperationEvent.publish();
    }

    /* renamed from: d */
    public String mo141942d(C101834rc0 rc02) {
        return C102368h.m135072c(rc02);
    }

    /* renamed from: g */
    public String mo141945g() {
        if (this.f301494J == null) {
            String str = "";
            if (!TextUtils.isEmpty(this.f301496v)) {
                SnsInfo b = C100416r.m131409b(this.f301496v);
                if (b != null) {
                    str = String.valueOf(b.field_snsId);
                }
            } else {
                C100755z zVar = this.f301498x;
                if (zVar != null) {
                    str = String.valueOf(zVar.field_id);
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            this.f301494J = str;
        }
        return this.f301494J;
    }

    /* renamed from: h */
    public String mo141946h() {
        return this.f301497w;
    }

    /* renamed from: i */
    public String mo141947i(C101834rc0 rc02) {
        return C102368h.m135074e(rc02);
    }

    /* renamed from: j */
    public void mo141948j(Context context, String str) {
        String str2;
        C102605u uVar = (C102605u) ((LinkedHashMap) this.f301471h).get(str);
        Intent intent = new Intent();
        intent.putExtra("fav_open_from_wnnote", true);
        intent.putExtra("fav_note_xml", this.f301497w);
        if (uVar != null) {
            C100755z a = C102368h.m135070a(this.f301495u);
            if (a != null) {
                Iterator<C101834rc0> it = a.field_favProto.f298618f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str2 = ((C102599o) ((LinkedHashMap) this.f301471h).get(str)).f302070a;
                        break;
                    }
                    C101834rc0 next = it.next();
                    if (!Util.isNullOrNil(next.f299308i1) && next.f299308i1.equals(str)) {
                        str2 = next.f299280T;
                        break;
                    }
                }
            } else {
                str2 = ((C102599o) ((LinkedHashMap) this.f301471h).get(str)).f302070a;
            }
            intent.putExtra("key_detail_data_id", str2);
        }
        intent.putExtra("key_detail_can_delete", false);
        intent.putExtra("key_detail_info_id", this.f301495u);
        intent.putExtra("key_detail_fav_scene", this.f301489E.f298813d);
        intent.putExtra("key_detail_fav_sub_scene", this.f301489E.f298814e);
        intent.putExtra("key_detail_fav_index", this.f301489E.f298815f);
        C100734q.m131877u0(context, ".ui.detail.FavoriteFileDetailUI", intent, 1, (Bundle) null);
    }

    /* renamed from: k */
    public void mo141949k(Context context, String str) {
        if (C28293f.f77884a.mo55909a()) {
            mo141957q(context, str);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("fav_open_from_wnnote", true);
        intent.putExtra("fav_note_xml", this.f301497w);
        if (((LinkedHashMap) this.f301471h).get(str) != null) {
            intent.putExtra("key_detail_data_id", ((C102599o) ((LinkedHashMap) this.f301471h).get(str)).f302070a);
        }
        intent.putExtra("key_detail_info_id", this.f301495u);
        intent.putExtra("key_detail_fav_scene", this.f301489E.f298813d);
        intent.putExtra("key_detail_fav_sub_scene", this.f301489E.f298814e);
        intent.putExtra("key_detail_fav_index", this.f301489E.f298815f);
        C100734q.m131877u0(context, ".ui.FavImgGalleryUI", intent, 1, (Bundle) null);
    }

    /* renamed from: l */
    public void mo141950l(Context context, String str) {
        C102603s sVar = (C102603s) ((LinkedHashMap) this.f301471h).get(str);
        if (sVar == null) {
            C76879j.m92726T(context, MMApplicationContext.getContext().getString(C0966R.string.cqd));
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("kwebmap_slat", sVar.f302119t);
        intent.putExtra("kwebmap_lng", sVar.f302120u);
        intent.putExtra("kPoiName", sVar.f302118s);
        intent.putExtra("Kwebmap_locaion", sVar.f302122w);
        double d = sVar.f302121v;
        if (d >= 0.0d) {
            intent.putExtra("kwebmap_scale", d);
        }
        intent.putExtra("kPoiid", sVar.f302123x);
        intent.putExtra("KIsFromPoiList", sVar.f302124y);
        intent.putExtra("KPoiCategoryTips", sVar.f302125z);
        intent.putExtra("kPoiBusinessHour", sVar.f302113A);
        intent.putExtra("KPoiPhone", sVar.f302114B);
        intent.putExtra("KPoiPriceTips", sVar.f302115C);
        intent.putExtra("kBuildingID", sVar.f302116D);
        intent.putExtra("kFloorName", sVar.f302117E);
        intent.putExtra("kisUsername", "");
        intent.putExtra("kwebmap_from_to", true);
        intent.putExtra("KFavLocSigleView", true);
        intent.putExtra("map_view_type", 12);
        intent.putExtra("kFavInfoLocalId", this.f301495u);
        intent.putExtra("kFavCanDel", false);
        intent.putExtra("kFavCanRemark", false);
        C88144b.m109795m(context, FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", intent, 1);
    }

    /* renamed from: m */
    public boolean mo141951m(Context context, String str) {
        if (!C28293f.f77884a.mo55909a()) {
            return false;
        }
        mo141957q(context, str);
        return true;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar.getType() == 426) {
            FavoriteOperationEvent favoriteOperationEvent = new FavoriteOperationEvent();
            FavoriteOperationEvent.C92515a aVar = favoriteOperationEvent.f264833d;
            aVar.f264850p = yVar;
            aVar.f264835a = 31;
            favoriteOperationEvent.publish();
            if (!Util.isNullOrNil(favoriteOperationEvent.f264834e.f264857c) && i2 == -435) {
                Log.m105920e("MicroMsg.WNNoteFavProcess", "wenote conflict when commit");
            }
            C97625j3.m125815e().mo123470p(v2helper.EMethodSetAgcRxOn, this);
        }
    }

    /* renamed from: q */
    public final void mo141957q(Context context, String str) {
        C100734q.m131877u0(context, ".ui.gallery.FavMediaGalleryUI", new Intent().addFlags(536870912).putExtra("KEY_MEDIA_FAVID_LIST", new long[]{this.f301495u}).putExtra("KEY_MEDIA_SUPPORT_DRAG", true).putExtra("KEY_MEDIA_HIDE_GO_DETAIL", true).putExtra("key_detail_data_id", ((C102599o) ((LinkedHashMap) this.f301471h).get(str)).f302070a).putExtra("fav_note_xml", this.f301497w).putExtra("fav_open_from_wnnote", true).putExtra("key_detail_info_id", this.f301495u).putExtra("key_detail_fav_scene", this.f301489E.f298813d).putExtra("key_detail_fav_sub_scene", this.f301489E.f298814e).putExtra("key_detail_fav_index", this.f301489E.f298815f), 1, (Bundle) null);
    }

    /* renamed from: r */
    public final void mo141958r(Context context, int i) {
        Intent intent = new Intent();
        intent.putExtra("note_open_from_scene", i);
        if (i == 4) {
            intent.putExtra("fav_note_thumbpath", this.f301490F);
            intent.putExtra("fav_note_link_sns_xml", this.f301491G);
        }
        intent.putExtra("edit_status", this.f301474n);
        intent.putExtra("need_save", this.f301493I);
        intent.putExtra("show_share", this.f301499y);
        intent.putExtra("note_fav_localid", this.f301495u);
        intent.putExtra("note_link_sns_localid", this.f301496v);
        intent.putExtra("fav_note_xml", this.f301497w);
        intent.putExtra("fav_note_scroll_to_position", this.f301500z);
        intent.putExtra("fav_note_scroll_to_offset", this.f301485A);
        intent.putExtra("fav_note_link_source_info", this.f301486B);
        intent.putExtra("note_fav_post_scene", this.f301487C);
        intent.putExtra("key_detail_fav_scene", this.f301489E.f298813d);
        intent.putExtra("key_detail_fav_sub_scene", this.f301489E.f298814e);
        intent.putExtra("key_detail_fav_index", this.f301489E.f298815f);
        intent.putExtra("key_detail_fav_query", this.f301489E.f298817h);
        intent.putExtra("key_detail_fav_sessionid", this.f301489E.f298816g);
        intent.putExtra("key_detail_fav_tags", this.f301489E.f298818i);
        intent.putExtra("key_multi_task_common_info", this.f301492H);
        C85861e4.m106117d(NoteEditorUI.class, 0);
        C88144b.m109791i(context, "wenote", ".ui.nativenote.NoteEditorUI", intent, (Bundle) null);
    }

    /* renamed from: s */
    public void mo141959s(long j, Context context, String str, Boolean bool, int i, int i2, C101811md0 md02, C101801kd0 kd02, byte[] bArr) {
        C101835rd0 rd02;
        this.f301495u = j;
        this.f301499y = bool.booleanValue();
        this.f301500z = i;
        this.f301485A = i2;
        this.f301489E = md02;
        this.f301492H = bArr;
        C100755z a = C102368h.m135070a(this.f301495u);
        this.f301498x = a;
        if (a != null) {
            if (this.f301488D <= 0) {
                this.f301488D = a.field_updateTime;
            }
            this.f301475o = a.field_favProto;
            this.f301468e = a;
        }
        if (this.f301487C == 0 && (rd02 = this.f301475o.f298616d) != null) {
            this.f301487C = rd02.f299346d;
        }
        mo141958r(context, 2);
        ((C119157j) C119157j.f356862d).mo183875f(new C102371a(kd02));
    }
}

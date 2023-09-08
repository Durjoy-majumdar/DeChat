package wa3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import bb3.C28293f;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.RecordOperationEvent;
import com.tencent.p014mm.p136ui.C85861e4;
import com.tencent.p014mm.plugin.fav.p047ui.C93693r;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.NoteEditorUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import d62.C75339i;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import ke3.C88144b;
import nj3.C76879j;
import p823sg.C101611g;
import te3.C101811md0;
import te3.C101834rc0;
import te3.C101841sc0;
import te3.C101846tc0;
import te3.C64420hd0;
import te3.C64443id0;
import te3.C77915dp3;
import xa3.C102595k;
import xa3.C102597m;
import xa3.C102599o;
import xa3.C102603s;

/* renamed from: wa3.n */
public class C102375n extends C102365e {

    /* renamed from: F */
    public static HashMap<String, C102597m> f301506F = new HashMap<>();

    /* renamed from: A */
    public boolean f301507A = false;

    /* renamed from: B */
    public String f301508B;

    /* renamed from: C */
    public C101811md0 f301509C = new C101811md0();

    /* renamed from: D */
    public byte[] f301510D = null;

    /* renamed from: E */
    public String f301511E = null;

    /* renamed from: u */
    public String f301512u;

    /* renamed from: v */
    public Long f301513v;

    /* renamed from: w */
    public boolean f301514w;

    /* renamed from: x */
    public C77915dp3 f301515x = null;

    /* renamed from: y */
    public int f301516y = 0;

    /* renamed from: z */
    public int f301517z = 0;

    /* renamed from: wa3.n$a */
    public class C102376a implements Runnable {
        public C102376a() {
        }

        public void run() {
            C102375n nVar = C102375n.this;
            if (C102375n.f301506F.containsKey(nVar.f301512u)) {
                C102597m mVar = C102375n.f301506F.get(nVar.f301512u);
                nVar.f301467d = mVar;
                mVar.f302093d = nVar.f301513v.longValue();
            } else {
                C102597m mVar2 = new C102597m();
                nVar.f301467d = mVar2;
                mVar2.f302093d = nVar.f301513v.longValue();
                nVar.f301467d.getClass();
                C77915dp3 dp32 = nVar.f301515x;
                if (!(dp32 == null || dp32.f227155f == null)) {
                    if (dp32.f227157h != null) {
                        nVar.f301467d.getClass();
                        C102597m mVar3 = nVar.f301467d;
                        String str = nVar.f301515x.f227157h.f227115d;
                        mVar3.getClass();
                        nVar.f301467d.f302094e = nVar.f301515x.f227158i;
                    }
                    C102597m mVar4 = nVar.f301467d;
                    mVar4.f302090a = nVar.f301515x.f227155f;
                    C102375n.f301506F.put(nVar.f301512u, mVar4);
                }
            }
            C102375n nVar2 = C102375n.this;
            nVar2.mo141939a(nVar2.f301467d.f302090a, true, 4);
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

    public C102375n() {
        this.f301469f.clear();
        C101611g<String, Bitmap> gVar = C93693r.f270490a;
    }

    /* renamed from: b */
    public void mo141940b(C101834rc0 rc02) {
        RecordOperationEvent recordOperationEvent = new RecordOperationEvent();
        RecordOperationEvent.C92551a aVar = recordOperationEvent.f265027d;
        aVar.f265029a = 8;
        aVar.f265031c = rc02;
        aVar.f265032d = this.f301513v.longValue();
        recordOperationEvent.f265027d.f265038j = "";
        recordOperationEvent.publish();
    }

    /* renamed from: c */
    public void mo141941c(C101834rc0 rc02, String str) {
        RecordOperationEvent recordOperationEvent = new RecordOperationEvent();
        RecordOperationEvent.C92551a aVar = recordOperationEvent.f265027d;
        aVar.f265029a = 8;
        aVar.f265031c = rc02;
        aVar.f265032d = this.f301513v.longValue();
        recordOperationEvent.f265027d.f265038j = str;
        recordOperationEvent.publish();
    }

    /* renamed from: d */
    public String mo141942d(C101834rc0 rc02) {
        RecordOperationEvent recordOperationEvent = new RecordOperationEvent();
        RecordOperationEvent.C92551a aVar = recordOperationEvent.f265027d;
        aVar.f265029a = 1;
        aVar.f265031c = rc02;
        aVar.f265032d = this.f301513v.longValue();
        recordOperationEvent.publish();
        return recordOperationEvent.f265028e.f265049b;
    }

    /* renamed from: g */
    public String mo141945g() {
        if (this.f301511E == null) {
            String str = "";
            if (this.f301513v.longValue() != -1) {
                C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(this.f301513v.longValue());
                str = b002.mo108774y2() + str;
            }
            this.f301511E = str;
        }
        return this.f301511E;
    }

    /* renamed from: i */
    public String mo141947i(C101834rc0 rc02) {
        RecordOperationEvent recordOperationEvent = new RecordOperationEvent();
        RecordOperationEvent.C92551a aVar = recordOperationEvent.f265027d;
        aVar.f265029a = 1;
        aVar.f265031c = rc02;
        aVar.f265032d = this.f301513v.longValue();
        recordOperationEvent.publish();
        return recordOperationEvent.f265028e.f265050c;
    }

    /* renamed from: j */
    public void mo141948j(Context context, String str) {
        Intent intent = new Intent();
        intent.putExtra("message_id", this.f301513v);
        intent.putExtra("record_xml", this.f301512u);
        intent.putExtra("record_data_id", ((C102599o) ((LinkedHashMap) this.f301471h).get(str)).f302070a);
        C88144b.m109791i(MMApplicationContext.getContext(), "record", ".ui.RecordMsgFileUI", intent, (Bundle) null);
    }

    /* renamed from: k */
    public void mo141949k(Context context, String str) {
        if (C28293f.f77884a.mo55909a()) {
            mo141963p(context, str);
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("message_id", this.f301513v);
        intent.putExtra("record_data_id", ((C102599o) ((LinkedHashMap) this.f301471h).get(str)).f302070a);
        intent.putExtra("record_xml", this.f301512u);
        intent.putExtra("from_scene", 1);
        C88144b.m109791i(MMApplicationContext.getContext(), "record", ".ui.RecordMsgImageUI", intent, (Bundle) null);
    }

    /* renamed from: l */
    public void mo141950l(Context context, String str) {
        C101846tc0 tc02;
        Class cls = C75339i.class;
        C101834rc0 rc02 = ((C102599o) ((LinkedHashMap) this.f301471h).get(str)).f302097n;
        C101841sc0 sc02 = rc02.f299296c1;
        if (sc02 != null) {
            sc02.getClass();
            tc02 = rc02.f299296c1.f299405d;
        } else {
            tc02 = null;
        }
        String displayName = tc02 != null ? !Util.isNullOrNil(tc02.f299525o) ? ((C75339i) C86312j.m106911c(cls)).getDisplayName(tc02.f299525o) : ((C75339i) C86312j.m106911c(cls)).getDisplayName(tc02.f299519f) : null;
        C102603s sVar = (C102603s) ((LinkedHashMap) this.f301471h).get(str);
        if (sVar == null) {
            C76879j.m92726T(MMApplicationContext.getContext(), MMApplicationContext.getContext().getString(C0966R.string.cqd));
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("map_view_type", 12);
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
        intent.putExtra("kisUsername", displayName);
        intent.putExtra("kwebmap_from_to", true);
        intent.putExtra("KFavLocSigleView", true);
        intent.putExtra("kFavCanDel", false);
        intent.putExtra("kFavCanRemark", false);
        C88144b.m109791i(MMApplicationContext.getContext(), FirebaseAnalytics.C113379b.LOCATION, ".ui.RedirectUI", intent, (Bundle) null);
    }

    /* renamed from: m */
    public boolean mo141951m(Context context, String str) {
        if (!C28293f.f77884a.mo55909a()) {
            return false;
        }
        mo141963p(context, str);
        return true;
    }

    /* renamed from: p */
    public final void mo141963p(Context context, String str) {
        byte[] bArr;
        Intent putExtra = new Intent().addFlags(536870912).putExtra("message_id", this.f301513v).putExtra("record_data_id", ((C102599o) ((LinkedHashMap) this.f301471h).get(str)).f302070a).putExtra("record_xml", this.f301512u).putExtra("from_scene", 1);
        C64420hd0 hd02 = new C64420hd0();
        for (C102599o oVar : ((LinkedHashMap) this.f301471h).values()) {
            if (oVar instanceof C102595k) {
                C102595k kVar = (C102595k) oVar;
                C64443id0 id02 = new C64443id0();
                id02.f183676d = kVar.f302101r;
                id02.f183677e = kVar.f302084s;
                id02.f183678f = kVar.f302085t;
                id02.f183679g = kVar.f302070a;
                id02.f183680h = kVar.f302097n.f299259I1;
                id02.f183681i = 4;
                hd02.f183477d.add(id02);
            }
        }
        try {
            bArr = hd02.toByteArray();
        } catch (Throwable th) {
            Log.printErrStackTrace("MicroMsg.WNNoteMsgProcess", th, "to bytes err", new Object[0]);
            bArr = null;
        }
        Intent putExtra2 = putExtra.putExtra("KEY_MEDIA_FAV_PREVIEW_DATA", bArr);
        if (context instanceof Activity) {
            C88144b.m109795m((Activity) context, "record", ".ui.RecordMsgImageUI", putExtra2, 1);
        } else {
            C88144b.m109791i(MMApplicationContext.getContext(), "record", ".ui.RecordMsgImageUI", putExtra2, (Bundle) null);
        }
    }

    /* renamed from: q */
    public void mo141964q(String str, Long l, boolean z, Context context, int i, int i2, C101811md0 md02, Bundle bundle) {
        LinkedList<C101834rc0> linkedList;
        Log.m105925i("MicroMsg.WNNoteMsgProcess", "setupWNNoteData noteXmlStr:%s msgid:%s", str, l);
        this.f301512u = str;
        this.f301513v = l;
        this.f301514w = z;
        this.f301516y = i;
        this.f301517z = i2;
        this.f301509C = md02;
        if (bundle != null) {
            this.f301510D = bundle.getByteArray("key_multi_task_common_info");
        }
        RecordOperationEvent recordOperationEvent = new RecordOperationEvent();
        RecordOperationEvent.C92551a aVar = recordOperationEvent.f265027d;
        aVar.f265029a = 0;
        aVar.f265030b = str;
        recordOperationEvent.publish();
        C77915dp3 dp32 = recordOperationEvent.f265028e.f265048a;
        this.f301515x = dp32;
        if (!(dp32 == null || (linkedList = dp32.f227155f) == null || linkedList.size() <= 1)) {
            RecordOperationEvent recordOperationEvent2 = new RecordOperationEvent();
            RecordOperationEvent.C92551a aVar2 = recordOperationEvent2.f265027d;
            aVar2.f265029a = 9;
            aVar2.f265031c = this.f301515x.f227155f.get(0);
            recordOperationEvent2.f265027d.f265032d = this.f301513v.longValue();
            recordOperationEvent2.publish();
            this.f301507A = recordOperationEvent2.f265028e.f265051d;
        }
        C77915dp3 dp33 = this.f301515x;
        if (dp33 == null || dp33.f227157h == null) {
            this.f301508B = null;
        } else {
            this.f301508B = this.f301515x.f227157h.f227115d + ";" + this.f301515x.f227157h.f227116e + ";" + this.f301515x.f227158i;
        }
        Intent intent = new Intent();
        intent.putExtra("note_open_from_scene", 1);
        intent.putExtra("edit_status", this.f301474n);
        intent.putExtra("note_msgid", this.f301513v);
        intent.putExtra("Retr_Security_Msg_Id", this.f301513v);
        intent.putExtra("record_show_share", this.f301514w);
        intent.putExtra("fav_note_xml", this.f301512u);
        intent.putExtra("fav_note_out_of_date", this.f301507A);
        intent.putExtra("fav_note_scroll_to_position", this.f301516y);
        intent.putExtra("fav_note_scroll_to_offset", this.f301517z);
        intent.putExtra("fav_note_scroll_to_offset", this.f301517z);
        if (!Util.isNullOrNil(this.f301508B)) {
            intent.putExtra("fav_note_link_source_info", this.f301508B);
        }
        intent.putExtra("key_detail_fav_scene", this.f301509C.f298813d);
        intent.putExtra("key_detail_fav_sub_scene", this.f301509C.f298814e);
        intent.putExtra("key_detail_fav_index", this.f301509C.f298815f);
        intent.putExtra("key_multi_task_common_info", this.f301510D);
        C85861e4.m106117d(NoteEditorUI.class, 0);
        C88144b.m109791i(context, "wenote", ".ui.nativenote.NoteEditorUI", intent, (Bundle) null);
        C86709a0.m107525e().postToWorker(new C102376a());
    }
}

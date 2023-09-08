package gz0;

import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import f40.C86709a0;
import hz0.C46146f;
import hz0.C46153l0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import l20.C21388a;
import p327ct.C20362d;
import p327ct.C30914c;

/* renamed from: gz0.o */
public class C45995o {

    /* renamed from: a */
    public List<WeakReference<C45997b>> f124032a = new ArrayList();

    /* renamed from: b */
    public List<C46146f> f124033b = new ArrayList();

    /* renamed from: c */
    public int f124034c = 0;

    /* renamed from: gz0.o$a */
    public class C45996a implements Runnable {
        public void run() {
            Class cls = C30914c.class;
            Log.m105924i("MicroMsg.CardMsgManager", "begin to clearRedDotAndWording()");
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CARD_REDOT_WORDING_STRING_SYNC, "");
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CARD_GET_LAYOUT_SCENE_INT_SYNC, 0);
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CARD_REDOT_ICON_URL_STRING_SYNC, "");
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CARD_MSG_TIPS_TITLE_STRING_SYNC, "");
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CARD_MSG_TIPS_ICON_URL_STRING_SYNC, "");
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CARD_MSG_CARD_ID_STRING_SYNC, "");
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_CARD_MSG_NEED_CHECK_BOOLEAN_SYNC, Boolean.FALSE);
            if (((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33494b(262152, 266256)) {
                ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33507p(262152, false);
            }
            if (((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33497e(262152, 266256)) {
                ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33509r(262152, false);
            }
            C20362d sM = ((C30914c) C86312j.m106911c(cls)).mo17862sM();
            C72994y1.C72995a aVar = C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_NEW_CARD_REDDOT_WORDING_STRING_SYNC;
            if (((C21388a) sM).mo33498f(aVar, C72994y1.C72995a.NEW_BANDAGE_WATCHER_SETTING_CARD_ENTRY_REDDOT_WORDING_STRING_SYNC)) {
                ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33510s(aVar, false);
            }
            C20362d sM2 = ((C30914c) C86312j.m106911c(cls)).mo17862sM();
            C72994y1.C72995a aVar2 = C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_NEW_CARD_ICON_STRING_SYNC;
            if (((C21388a) sM2).mo33498f(aVar2, C72994y1.C72995a.NEW_BANDAGE_WATCHER_SETTING_CARD_ENTRY_ICON_STRING_SYNC)) {
                ((C21388a) ((C30914c) C86312j.m106911c(cls)).mo17862sM()).mo33510s(aVar2, false);
            }
            Log.m105924i("MicroMsg.CardMsgManager", "end to clearRedDotAndWording()");
        }
    }

    /* renamed from: gz0.o$b */
    public interface C45997b {
        /* renamed from: D7 */
        void mo63787D7(C46146f fVar);

        void onChange();
    }

    public C45995o() {
        C45995o oVar;
        Cursor all = C46153l0.Cx0().getAll();
        if (all == null || all.getCount() <= 0) {
            oVar = this;
        } else {
            all.moveToFirst();
            int columnIndex = all.getColumnIndex("card_type");
            int columnIndex2 = all.getColumnIndex(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            int columnIndex3 = all.getColumnIndex("description");
            int columnIndex4 = all.getColumnIndex("logo_url");
            int columnIndex5 = all.getColumnIndex("time");
            int columnIndex6 = all.getColumnIndex("card_id");
            int columnIndex7 = all.getColumnIndex("card_tp_id");
            int columnIndex8 = all.getColumnIndex("msg_id");
            int columnIndex9 = all.getColumnIndex("msg_type");
            int columnIndex10 = all.getColumnIndex("jump_type");
            int columnIndex11 = all.getColumnIndex("url");
            int columnIndex12 = all.getColumnIndex("buttonData");
            int columnIndex13 = all.getColumnIndex("operData");
            int columnIndex14 = all.getColumnIndex("report_scene");
            int columnIndex15 = all.getColumnIndex("read_state");
            while (!all.isAfterLast()) {
                int i = columnIndex15;
                C46146f fVar = new C46146f();
                fVar.field_card_type = all.getInt(columnIndex);
                fVar.field_title = all.getString(columnIndex2);
                fVar.field_description = all.getString(columnIndex3);
                fVar.field_logo_url = all.getString(columnIndex4);
                fVar.field_time = all.getInt(columnIndex5);
                fVar.field_card_id = all.getString(columnIndex6);
                fVar.field_card_tp_id = all.getString(columnIndex7);
                fVar.field_msg_id = all.getString(columnIndex8);
                fVar.field_msg_type = all.getInt(columnIndex9);
                fVar.field_jump_type = all.getInt(columnIndex10);
                fVar.field_url = all.getString(columnIndex11);
                fVar.field_buttonData = all.getBlob(columnIndex12);
                fVar.field_operData = all.getBlob(columnIndex13);
                int i2 = columnIndex14;
                int i3 = columnIndex;
                fVar.field_report_scene = all.getInt(i2);
                int i4 = i;
                fVar.field_read_state = all.getInt(i4);
                all.moveToNext();
                int i5 = i4;
                this.f124033b.add(fVar);
                columnIndex14 = i2;
                columnIndex = i3;
                columnIndex15 = i5;
            }
            oVar = this;
        }
        if (all != null) {
            all.close();
        }
        Object e = C86709a0.m107535s().mo121142i().mo119684e(139268, (Object) null);
        oVar.f124034c = e == null ? 0 : ((Integer) e).intValue();
    }

    /* renamed from: a */
    public static void m51273a() {
        Log.m105924i("MicroMsg.CardMsgManager", "clearRedDotAndWording()");
        ThreadPool.post(new C45996a(), "clearRedDotAndWording");
    }

    /* renamed from: b */
    public boolean mo71403b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C46146f fVar = null;
        if (this.f124033b != null && !TextUtils.isEmpty(str)) {
            int i = 0;
            while (true) {
                if (i >= ((ArrayList) this.f124033b).size()) {
                    break;
                }
                C46146f fVar2 = (C46146f) ((ArrayList) this.f124033b).get(i);
                if (str.equals(fVar2.field_msg_id)) {
                    fVar = fVar2;
                    break;
                }
                i++;
            }
        }
        if (fVar == null) {
            return false;
        }
        ((ArrayList) this.f124033b).remove(fVar);
        mo71404c(fVar);
        return true;
    }

    /* renamed from: c */
    public final boolean mo71404c(C46146f fVar) {
        if (fVar == null) {
            return false;
        }
        boolean delete = C46153l0.Cx0().delete(fVar, new String[0]);
        if (!delete) {
            Log.m105920e("MicroMsg.CardMsgManager", "delete CardMsgInfo failed! id:" + fVar.field_msg_id);
        }
        return delete;
    }

    /* renamed from: d */
    public void mo71405d() {
        this.f124034c = 0;
        C86709a0.m107535s().mo121142i().mo119676J(139268, Integer.valueOf(this.f124034c));
    }

    /* renamed from: e */
    public final void mo71406e(C46146f fVar) {
        if (fVar != null && !C46153l0.Cx0().insert(fVar)) {
            Log.m105920e("MicroMsg.CardMsgManager", "insert CardMsgInfo failed! id:" + fVar.field_msg_id);
        }
    }

    /* renamed from: f */
    public void mo71407f(C45997b bVar) {
        C45997b bVar2;
        if (this.f124032a != null && bVar != null) {
            int i = 0;
            while (i < this.f124032a.size()) {
                WeakReference weakReference = this.f124032a.get(i);
                if (weakReference == null || (bVar2 = (C45997b) weakReference.get()) == null || !bVar2.equals(bVar)) {
                    i++;
                } else {
                    this.f124032a.remove(weakReference);
                    return;
                }
            }
        }
    }
}

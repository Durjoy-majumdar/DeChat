package qm2;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import c62.C0419f;
import com.tencent.neattextview.textview.view.NeatTextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.ShareRoomHistoryCheckStruct;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import d62.C7240a;
import d62.C7241k;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ke3.C88144b;
import lu3.C34379c;
import nj3.C76879j;
import nm2.C76929c;
import o62.C11375e;
import p1081gi.C98120c;
import p1081gi.C98121d;
import p1081gi.C98124g;
import p663qo.C101213l;
import p823sg.C90193h;
import te3.C49042cs;
import te3.C77949j3;
import te3.C77952jg2;
import wd3.C53155r0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: qm2.b */
public class C77369b extends C11375e implements C77368a {

    /* renamed from: n */
    public static final Map<String, C77952jg2> f225571n = new ConcurrentHashMap();

    /* renamed from: o */
    public static final Map<Long, C77368a> f225572o = new ConcurrentHashMap();

    /* renamed from: p */
    public static C98124g.C98125a f225573p = new C77370a();

    /* renamed from: e */
    public ProgressDialog f225574e = null;

    /* renamed from: f */
    public long f225575f;

    /* renamed from: g */
    public String f225576g;

    /* renamed from: h */
    public String f225577h;

    /* renamed from: i */
    public String f225578i;

    /* renamed from: j */
    public boolean f225579j = false;

    /* renamed from: qm2.b$a */
    public class C77370a implements C98124g.C98125a {
        /* renamed from: g0 */
        public int mo1773g0(String str, int i, C98120c cVar, C98121d dVar, boolean z) {
            C77952jg2 jg22;
            C34379c<?> cVar2;
            Log.m105925i("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "cdn callback, id: %s, ret: %s, sceneResult: %s", str, Integer.valueOf(i), dVar);
            if (dVar != null) {
                try {
                    if (dVar.field_retCode == 0) {
                        C77952jg2 jg23 = (C77952jg2) ((ConcurrentHashMap) C77369b.f225571n).get(str);
                        if (jg23 == null) {
                            Log.m105920e("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "cdn callback, info is null??");
                        } else {
                            jg23.f227670j = 1;
                            byte[] O = C86013q1.m106433O(jg23.f227665e, 0, -1);
                            if (jg23.f227666f) {
                                C49042cs csVar = new C49042cs();
                                csVar.parseFrom(O);
                                LinkedList<C77949j3> linkedList = csVar.f131925d;
                                if (linkedList != null) {
                                    C119179t tVar = C119157j.f356862d;
                                    C76929c cVar3 = new C76929c(jg23, linkedList);
                                    C119157j jVar = (C119157j) tVar;
                                    jVar.getClass();
                                    cVar2 = jVar.mo183878i(cVar3, 0);
                                } else {
                                    cVar2 = null;
                                }
                                if (cVar2 == null) {
                                    Log.m105920e("MicroMsg.selectRecord.HistoryRecordUnPackMsgLogic", "unPackMsg magList is null");
                                }
                                Log.m105925i("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "cdn callback， msg size:%s", Integer.valueOf(csVar.f131925d.size()));
                            } else {
                                String str2 = new String(O);
                                long j = jg23.f227664d;
                                StringBuilder sb = new StringBuilder();
                                C0419f.Bx0();
                                sb.append("wcf://selectrecord/");
                                sb.append(j);
                                String sb4 = sb.toString();
                                if (C86013q1.m106450k(sb4)) {
                                    C86013q1.m106447h(sb4);
                                }
                                Log.m105925i("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "cdn callback, msgId:%s filePath:%s xml:%s result:%s delResult:%s", Long.valueOf(jg23.f227664d), jg23.f227665e, Util.secPrint(str2), Long.valueOf(C86013q1.m106443d(jg23.f227665e, sb4, false)), Boolean.valueOf(C86013q1.m106447h(jg23.f227665e)));
                                C77368a aVar = (C77368a) ((ConcurrentHashMap) C77369b.f225572o).get(Long.valueOf(jg23.f227664d));
                                if (aVar != null) {
                                    aVar.mo107492a(jg23.f227664d, str2);
                                }
                            }
                        }
                        return 0;
                    }
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "callback %s %s", e.getClass().getSimpleName(), e.getMessage());
                }
            }
            if (!(dVar == null || dVar.field_retCode == 0 || (jg22 = (C77952jg2) ((ConcurrentHashMap) C77369b.f225571n).get(str)) == null)) {
                jg22.f227670j = 2;
            }
            if (cVar != null) {
                Log.m105925i("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "cdn process: %f", Double.valueOf(((double) cVar.field_finishedLength) / ((double) cVar.field_toltalLength)));
            }
            return 0;
        }

        /* renamed from: h */
        public void mo1774h(String str, ByteArrayOutputStream byteArrayOutputStream) {
            Log.m105925i("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "getCdnAuthInfo, mediaId = %s", str);
        }

        /* renamed from: j */
        public byte[] mo1775j(String str, byte[] bArr) {
            Log.m105925i("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "decodePrepareResponse, mediaId = %s", str);
            return null;
        }
    }

    /* renamed from: qm2.b$b */
    public class C77371b extends C7240a {

        /* renamed from: e */
        public final /* synthetic */ Map f225580e;

        /* renamed from: f */
        public final /* synthetic */ Bundle f225581f;

        /* renamed from: g */
        public final /* synthetic */ WeakReference f225582g;

        /* renamed from: h */
        public final /* synthetic */ WeakReference f225583h;

        /* renamed from: qm2.b$b$a */
        public class C77372a implements DialogInterface.OnClickListener {
            public C77372a(C77371b bVar) {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Log.m105924i("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "click i know");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C77371b(int i, C53155r0 r0Var, Map map, Bundle bundle, WeakReference weakReference, String str, String str2, WeakReference weakReference2) {
            super(i, r0Var);
            this.f225580e = map;
            this.f225581f = bundle;
            this.f225582g = weakReference;
            this.f225583h = weakReference2;
        }

        /* renamed from: a */
        public void mo1118a(View view) {
            String str;
            C77369b bVar = C77369b.this;
            Map map = this.f225580e;
            Map<String, C77952jg2> map2 = C77369b.f225571n;
            bVar.getClass();
            int i = 0;
            while (true) {
                str = ".sysmsg.sysmsgtemplate.content_template.link_list.link";
                if (i != 0) {
                    str = str + i;
                }
                if (Util.isNullOrNil((String) map.get(str))) {
                    str = null;
                    break;
                }
                if (Util.isEqual((String) map.get(str + ".$type"), "link_history")) {
                    break;
                }
                i++;
            }
            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(this.f225581f.getLong("msg_id"));
            int i2 = 2;
            if ((b002.f230723F & 4096) > 0) {
                C76879j.m92754y((Context) this.f225582g.get(), MMApplicationContext.getContext().getString(C0966R.string.hu_), "", MMApplicationContext.getContext().getString(C0966R.string.lkg), new C77372a(this));
            } else {
                C77369b bVar2 = C77369b.this;
                Map map3 = this.f225580e;
                Bundle bundle = this.f225581f;
                WeakReference weakReference = this.f225582g;
                bVar2.getClass();
                if (weakReference != null) {
                    try {
                        if (weakReference.get() != null) {
                            bVar2.f225575f = bundle.getLong("msg_sever_id");
                            bVar2.f225576g = bundle.getString("conv_talker_username");
                            bVar2.f225577h = bundle.getString("send_msg_username");
                            long msgId = b002.getMsgId();
                            StringBuilder sb = new StringBuilder();
                            C0419f.Bx0();
                            sb.append("wcf://selectrecord/");
                            sb.append(msgId);
                            String sb4 = sb.toString();
                            bVar2.f225578i = sb4;
                            if (C86013q1.m106450k(sb4)) {
                                C77369b.m93265e(b002.getMsgId(), bVar2.f225575f, bVar2.f225577h, bVar2.f225576g, new String(C86013q1.m106433O(bVar2.f225578i, 0, -1)));
                            } else {
                                bVar2.f225579j = true;
                                Context context = (Context) weakReference.get();
                                ProgressDialog progressDialog = bVar2.f225574e;
                                if (progressDialog == null) {
                                    bVar2.f225574e = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), context.getString(C0966R.string.f360085a04), true, true, new C77373c(bVar2));
                                } else if (!progressDialog.isShowing()) {
                                    bVar2.f225574e.show();
                                }
                                C77369b.m93267g(b002, map3, str, "tmpl_type_profilewithrevoke", bVar2);
                            }
                        }
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "Exception:%s %s", e.getClass().getSimpleName(), e.getMessage());
                    }
                }
            }
            C77369b bVar3 = C77369b.this;
            Bundle bundle2 = this.f225581f;
            bVar3.getClass();
            String string = bundle2.getString("conv_talker_username", (String) null);
            if (!(!Util.isEqual(bundle2.getString("template_type"), "tmpl_type_profilewithrevoke"))) {
                i2 = 1;
            }
            long parseLong = Long.parseLong(b002.mo108764r2());
            ShareRoomHistoryCheckStruct shareRoomHistoryCheckStruct = new ShareRoomHistoryCheckStruct();
            shareRoomHistoryCheckStruct.f194386d = shareRoomHistoryCheckStruct.mo86045b("RoomId", string, true);
            shareRoomHistoryCheckStruct.f194387e = (long) i2;
            shareRoomHistoryCheckStruct.f194388f = parseLong;
            Log.m105919d("MicroMsg.selectrecord.SelectRecordReporter", "reportShareRoomHistoryCheck %s", shareRoomHistoryCheckStruct.mo1006q());
            shareRoomHistoryCheckStruct.mo86054n();
            C77369b.this.getClass();
            ((C7241k) C86312j.m106911c(C7241k.class)).h80("link_history", this.f225580e, this.f225581f, this.f225582g, this.f225583h);
        }
    }

    public C77369b(C11375e.C11378c cVar) {
        super(cVar);
    }

    /* renamed from: e */
    public static void m93265e(long j, long j2, String str, String str2, String str3) {
        Log.m105925i("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "gotoRecordDetailUI msgId:%s msgSvrId:%s sendUserName:%s talker:%s xml:%s", Long.valueOf(j), Long.valueOf(j2), Util.nullAs(str, ""), Util.nullAs(str2, ""), Util.secPrint(str3));
        C68070l.C68072b u = C68070l.C68072b.m80422u(str3, (String) null);
        if (u == null) {
            Log.m105920e("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "gotoRecordDetailUI content is null???");
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("message_id", j);
        intent.putExtra("record_xml", u.f195571f0);
        intent.putExtra("record_show_share", false);
        intent.putExtra("from_scene", 2);
        intent.putExtra("prePublishId", "msg_" + Long.toString(j2));
        intent.putExtra("preUsername", str);
        intent.putExtra("preChatName", str2);
        intent.putExtra("preChatTYPE", 2);
        C88144b.m109791i(MMApplicationContext.getContext(), "record", ".ui.RecordMsgDetailUI", intent, (Bundle) null);
    }

    /* renamed from: f */
    public static boolean m93266f(String str) {
        for (Map.Entry value : ((ConcurrentHashMap) f225571n).entrySet()) {
            C77952jg2 jg22 = (C77952jg2) value.getValue();
            if (TextUtils.equals(jg22.f227669i, str)) {
                return jg22.f227666f && jg22.f227670j != 2;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m93267g(C72963f4 f4Var, Map<String, String> map, String str, String str2, C77368a aVar) {
        String str3;
        String str4;
        boolean z;
        String str5;
        Map<String, String> map2 = map;
        String str6 = str;
        String str7 = str2;
        C77368a aVar2 = aVar;
        if (Log.getLogLevel() <= 1) {
            Log.m105918d("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "parseNewLinkHistory() called with: msgInfo = [" + f4Var + "], values = [" + map2 + "], head = [" + str6 + "], templateType = [" + str7 + "], callback = [" + aVar2 + "] stack:[" + Util.getStack() + "]");
        } else {
            C72963f4 f4Var2 = f4Var;
        }
        long msgId = f4Var.getMsgId();
        if (aVar2 != null) {
            ((ConcurrentHashMap) f225572o).put(Long.valueOf(msgId), aVar2);
        }
        if (Util.isEqual(str7, "tmpl_type_profilewithrevoke")) {
            str5 = Util.nullAs(map2.get(str6 + ".fileid"), "");
            str4 = Util.nullAs(map2.get(str6 + ".aeskey"), "");
            str3 = Util.nullAs(map2.get(str6 + ".filelength"), "");
            Util.nullAs(map2.get(str6 + ".msgcount"), "");
            z = false;
        } else {
            str5 = Util.nullAs(map2.get(str6 + ".newformatfileid"), "");
            str4 = Util.nullAs(map2.get(str6 + ".newformataeskey"), "");
            str3 = Util.nullAs(map2.get(str6 + ".newfromatfilelength"), "");
            Util.nullAs(map2.get(str6 + ".newformatmsgcount"), "");
            z = true;
        }
        if (Util.isNullOrNil(str5)) {
            str5 = Util.nullAs(map2.get(str6 + ".fileid"), "");
            str4 = Util.nullAs(map2.get(str6 + ".aeskey"), "");
            str3 = Util.nullAs(map2.get(str6 + ".filelength"), "");
            Util.nullAs(map2.get(str6 + ".msgcount"), "");
            z = false;
        }
        String nullAs = Util.nullAs(map2.get(str6 + ".historyid"), "");
        C0419f.Bx0();
        if (!C86013q1.m106450k("wcf://selectrecord/downloadcache/")) {
            C86013q1.m106461v("wcf://selectrecord/downloadcache/");
        }
        String str8 = "wcf://selectrecord/downloadcache/" + msgId;
        if (C86013q1.m106450k(str8)) {
            C86013q1.m106447h(str8);
        }
        String f = C90193h.m112878f(("" + Util.currentTicks() + ", " + msgId).getBytes());
        C98124g gVar = new C98124g();
        gVar.f287662f = f225573p;
        gVar.f287661e = false;
        gVar.field_mediaId = f;
        gVar.field_fullpath = str8;
        gVar.field_totalLen = Integer.parseInt(str3);
        gVar.field_fileType = 5;
        gVar.field_fileId = str5;
        gVar.field_aesKey = str4;
        gVar.field_priority = 2;
        gVar.field_needStorage = false;
        gVar.field_isStreamMedia = false;
        C77952jg2 jg22 = new C77952jg2();
        jg22.f227664d = msgId;
        jg22.f227665e = str8;
        jg22.f227666f = z;
        jg22.f227667g = f4Var.getCreateTime();
        jg22.f227668h = f4Var.mo108768t();
        jg22.f227669i = nullAs;
        ((ConcurrentHashMap) f225571n).put(f, jg22);
        boolean xf02 = ((C101213l) C86312j.m106911c(C101213l.class)).xf0(gVar);
        Log.m105925i("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "add download cdn task : %b, msgId : %s, newWay:%s", Boolean.valueOf(xf02), Long.valueOf(msgId), Boolean.valueOf(z));
        if (!xf02) {
            Log.m105925i("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "triggerErrorCallback errCode:%s errMsg:%s", 0, Util.nullAs("add to cdn failed", ""));
        }
        return z;
    }

    /* renamed from: a */
    public void mo107492a(long j, String str) {
        Log.m105925i("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "onClickHistory msgId:%s", Long.valueOf(j));
        if (this.f225579j) {
            ProgressDialog progressDialog = this.f225574e;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            m93265e(j, this.f225575f, this.f225577h, this.f225576g, str);
        }
    }

    /* renamed from: b */
    public String mo11238b() {
        return "link_history";
    }

    /* renamed from: c */
    public CharSequence mo11239c(Map<String, String> map, String str, Bundle bundle, WeakReference<Context> weakReference, WeakReference<NeatTextView> weakReference2) {
        String str2 = str;
        Bundle bundle2 = bundle;
        if (map == null) {
            return null;
        }
        String string = bundle2 != null ? bundle2.getString("conv_talker_username") : "";
        String nullAsNil = Util.nullAsNil(map.get(str2 + ".title"));
        String string2 = bundle2.getString("template_type");
        boolean z = true;
        if (Log.getLogLevel() <= 1) {
            Log.m105919d("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "handleImp title:%s, contentTemplateType:%s stack:%s", nullAsNil, string2, Util.getStack());
        }
        if (Util.isEqual(string2, "tmpl_type_profile")) {
            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(bundle2.getLong("msg_id"));
            if ((b002.f230723F & 262144) == 0) {
                z = false;
            }
            if (z || m93266f(b002.mo108764r2())) {
                Log.m105918d("MicroMsg.selectRecord.SysMsgTemplateLinkHandlerHistory", "return title directly");
                String nullAsNil2 = Util.nullAsNil(map.get(str2 + ".newformattitle"));
                return !TextUtils.isEmpty(nullAsNil2) ? nullAsNil2 : nullAsNil;
            }
        }
        SpannableString spannableString = new SpannableString(nullAsNil);
        spannableString.setSpan(new C77371b(1, (C53155r0) null, map, bundle, weakReference, string, str, weakReference2), 0, nullAsNil.length(), 33);
        return spannableString;
    }

    /* renamed from: d */
    public void mo11240d() {
        super.mo11240d();
    }
}

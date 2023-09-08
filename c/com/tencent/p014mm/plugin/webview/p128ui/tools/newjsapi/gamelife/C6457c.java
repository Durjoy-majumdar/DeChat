package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife;

import android.database.Cursor;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiGamelifeManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import cz1.C45230i;
import cz1.C7143c;
import d62.C7250m;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import g62.C75875l;
import gy3.C8477a0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONArray;
import p170ic.C87689c;
import pe3.C89349b;
import q20.C89449a;
import sx3.C36907w;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;
import wy1.C53224d;
import xy1.C15913g;
import xy1.C53472h;
import xy1.C53475k;
import zy1.C16411b;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.c */
public final class C6457c extends C15053a {

    /* renamed from: d */
    public static final C6457c f23522d = new C6457c();

    /* renamed from: e */
    public static final int f23523e = 452;

    /* renamed from: f */
    public static final String f23524f = JsApiGamelifeManager.NAME;

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/c$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/AddConversationParams;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GamelifeGeneralReturnParam;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.c$a */
    public static final class C6458a implements C80883e<AddConversationParams, GamelifeGeneralReturnParam> {
        public void invoke(Object obj, C1256g gVar) {
            AddConversationParams addConversationParams = (AddConversationParams) obj;
            if (addConversationParams != null) {
                C45230i y2 = ((C53472h) C86312j.m106911c(C53472h.class)).mo70732y2();
                C7143c jo = y2.mo70735jo(addConversationParams.f23467d);
                if (!(jo.systemRowid == -1 || gVar == null)) {
                    gVar.mo894a(new GamelifeGeneralReturnParam(false, "conversation already exist"));
                }
                jo.field_digest = "";
                jo.field_sessionId = addConversationParams.f23467d;
                jo.field_talker = addConversationParams.f23469f;
                jo.field_selfUserName = addConversationParams.f23468e;
                y2.insert(jo);
                if (gVar != null) {
                    gVar.mo894a(new GamelifeGeneralReturnParam(true, "add conversation"));
                }
            } else if (gVar != null) {
                gVar.mo894a(new GamelifeGeneralReturnParam(false, "system err"));
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/c$b;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.c$b */
    public static final class C6459b implements C80883e<IPCString, IPCBoolean> {
        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            if (iPCString != null) {
                boolean d502 = ((C53472h) C86312j.m106911c(C53472h.class)).d50(iPCString.f10315d);
                if (gVar != null) {
                    gVar.mo894a(new IPCBoolean(d502));
                }
            } else if (gVar != null) {
                gVar.mo894a(new IPCBoolean(false));
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/c$c;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/DeleteMsgParams;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GamelifeGeneralReturnParam;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.c$c */
    public static final class C6460c implements C80883e<DeleteMsgParams, GamelifeGeneralReturnParam> {
        public void invoke(Object obj, C1256g gVar) {
            DeleteMsgParams deleteMsgParams = (DeleteMsgParams) obj;
            if (deleteMsgParams != null) {
                C75875l LE = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE();
                if (deleteMsgParams.f23472f) {
                    ((C72972g4) LE).mo101089TE(deleteMsgParams.f23470d);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = new JSONArray(deleteMsgParams.f23471e);
                C8477a0 a0Var = new C8477a0();
                C87689c.m109089b(jSONArray, new C6468d(deleteMsgParams, arrayList, a0Var));
                if (!a0Var.f27482d) {
                    ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Integer.valueOf(((C72972g4) LE).mo101125kD(((Number) it.next()).longValue())));
                    }
                    if (gVar != null) {
                        gVar.mo894a(new GamelifeGeneralReturnParam(true, "delete ok"));
                    }
                } else if (gVar != null) {
                    gVar.mo894a(new GamelifeGeneralReturnParam(false, "deletefail"));
                }
            } else if (gVar != null) {
                gVar.mo894a(new GamelifeGeneralReturnParam(false, "system err"));
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/c$d;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GetGamelifeConversationData;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.c$d */
    public static final class C6461d implements C80883e<IPCVoid, GetGamelifeConversationData> {
        public void invoke(Object obj, C1256g gVar) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            Cursor all = ((C53224d) C86312j.m106911c(C53224d.class)).zx0().getAll();
            ArrayList arrayList = new ArrayList();
            all.moveToFirst();
            while (!all.isAfterLast()) {
                C7143c cVar = new C7143c();
                cVar.convertFrom(all);
                String str = cVar.field_sessionId;
                C87412m.m108593f(str, "conversation.field_sessionId");
                String str2 = cVar.field_editingMsg;
                C87412m.m108593f(str2, "conversation.field_editingMsg");
                String str3 = cVar.field_selfUserName;
                C87412m.m108593f(str3, "conversation.field_selfUserName");
                String str4 = cVar.field_talker;
                C87412m.m108593f(str4, "conversation.field_talker");
                String str5 = cVar.field_digest;
                C87412m.m108593f(str5, "conversation.field_digest");
                arrayList.add(new GamelifeConversationData(str, cVar.field_unReadCount, (int) (cVar.field_updateTime / ((long) 1000)), str2, 0, str3, str4, str5));
                all.moveToNext();
            }
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((GamelifeConversationData) it.next()).f23484d);
            }
            if (!arrayList2.isEmpty()) {
                new C16411b(new LinkedList(arrayList2)).mo9225i().mo123419C(new C6469e(arrayList, gVar));
            } else if (gVar != null) {
                gVar.mo894a(new GetGamelifeConversationData((List<GamelifeConversationData>) null, "no conversation", true));
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/c$e;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GetGamelifeContactData;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.c$e */
    public static final class C6462e implements C80883e<IPCString, GetGamelifeContactData> {
        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            if (iPCString != null) {
                LinkedList linkedList = new LinkedList();
                C87689c.m109089b(new JSONArray(iPCString.f10315d), new C6470f(linkedList));
                linkedList.toString();
                ((C15913g) C86312j.m106911c(C15913g.class)).C40(linkedList, new C6471g(linkedList, gVar, new LinkedList()));
            } else if (gVar != null) {
                gVar.mo894a(new GetGamelifeContactData((LinkedList<Map<String, String>>) null, "system err", false));
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/c$f;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GetMsgParams;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GetMsgList;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.c$f */
    public static final class C6463f implements C80883e<GetMsgParams, GetMsgList> {
        public void invoke(Object obj, C1256g gVar) {
            String str;
            String str2;
            C1256g gVar2 = gVar;
            GetMsgParams getMsgParams = (GetMsgParams) obj;
            C75875l LE = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE();
            ((C53472h) C86312j.m106911c(C53472h.class)).mo70723K(getMsgParams != null ? getMsgParams.f23506d : null);
            if (getMsgParams != null) {
                long j = getMsgParams.f23507e;
                if (getMsgParams.f23509g || ((int) j) == 0) {
                    j = ((C72972g4) LE).Ex0(getMsgParams.f23506d).getMsgId();
                }
                LinkedList linkedList = new LinkedList();
                String str3 = getMsgParams.f23506d;
                int i = getMsgParams.f23508f;
                C72972g4 g4Var = (C72972g4) LE;
                g4Var.getClass();
                String str4 = ("SELECT * FROM " + g4Var.hy0(str3) + " WHERE" + g4Var.iy0(str3) + "AND ") + "msgId <= " + j + " ORDER BY " + "msgId" + " DESC LIMIT " + i;
                Log.m105918d("MicroMsg.MsgInfoStorage", "get cursor: " + str4);
                Cursor rawQuery = g4Var.f212775p.rawQuery(str4, (String[]) null);
                rawQuery.moveToFirst();
                while (true) {
                    int i2 = 1;
                    if (rawQuery.isAfterLast()) {
                        break;
                    }
                    C72963f4 f4Var = new C72963f4();
                    f4Var.convertFrom(rawQuery);
                    int i3 = -1;
                    if (f4Var.mo100993e4()) {
                        i3 = 0;
                    }
                    if (!f4Var.mo100973L3()) {
                        i2 = i3;
                    }
                    int i4 = f4Var.mo101020w3() ? 2 : i2;
                    int type = f4Var.getType();
                    String E2 = f4Var.mo100965E2();
                    if (E2 == null) {
                        E2 = "";
                    }
                    String p2 = f4Var.mo101010p2();
                    if (p2 == null) {
                        p2 = "";
                    }
                    if (f4Var.mo101010p2().equals(f4Var.mo108768t())) {
                        String t = f4Var.mo108768t();
                        C87412m.m108592e(t, "null cannot be cast to non-null type kotlin.String");
                        C7143c jo = ((C53224d) C86312j.m106911c(C53224d.class)).zx0().mo70735jo(t);
                        String str5 = jo.field_selfUserName;
                        C87412m.m108593f(str5, "conversation.field_selfUserName");
                        String str6 = jo.field_talker;
                        C87412m.m108593f(str6, "conversation.field_talker");
                        str = str6;
                        str2 = str5;
                    } else {
                        str2 = E2;
                        str = p2;
                    }
                    double createTime = ((double) f4Var.getCreateTime()) / ((double) 1000);
                    String content = f4Var.getContent();
                    String str7 = content == null ? "" : content;
                    int msgId = (int) f4Var.getMsgId();
                    String t2 = f4Var.mo108768t();
                    String str8 = t2 == null ? "" : t2;
                    int status = f4Var.getStatus();
                    String str9 = f4Var.f230724G;
                    GameLifeMsg gameLifeMsg = new GameLifeMsg(str2, str, createTime, str7, msgId, str8, status, str9 == null ? "" : str9, "", i4, type);
                    g4Var.ty0(f4Var);
                    linkedList.add(gameLifeMsg);
                    rawQuery.moveToNext();
                }
                GetMsgList getMsgList = new GetMsgList(linkedList, true, "getMsg ok");
                if (gVar2 != null) {
                    gVar2.mo894a(getMsgList);
                }
            } else if (gVar2 != null) {
                gVar2.mo894a(new GetMsgList((List<GameLifeMsg>) null, false, "system err"));
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/c$g;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GetSessionIdParams;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GetGamelifeSessionIdData;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.c$g */
    public static final class C6464g implements C80883e<GetSessionIdParams, GetGamelifeSessionIdData> {
        public void invoke(Object obj, C1256g gVar) {
            GetSessionIdParams getSessionIdParams = (GetSessionIdParams) obj;
            if (getSessionIdParams != null) {
                ((C53475k) C86312j.m106911c(C53475k.class)).mo59161fG(getSessionIdParams.f23510d, getSessionIdParams.f23511e, getSessionIdParams.f23512f, (C89349b) null, new C6472h(gVar));
            } else if (gVar != null) {
                gVar.mo894a(new GetGamelifeSessionIdData("", "system err", false));
            }
        }
    }

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/c$h;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/SendMsgParams;", "Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/gamelife/GamelifeGeneralReturnParam;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.c$h */
    public static final class C6465h implements C80883e<SendMsgParams, GamelifeGeneralReturnParam> {

        /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.c$h$a */
        public /* synthetic */ class C6466a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f23525a;

            static {
                int[] iArr = new int[C6456b.values().length];
                iArr[0] = 1;
                iArr[1] = 2;
                iArr[2] = 3;
                f23525a = iArr;
            }
        }

        public void invoke(Object obj, C1256g gVar) {
            C6456b bVar;
            SendMsgParams sendMsgParams = (SendMsgParams) obj;
            if (sendMsgParams != null) {
                if (((C53472h) C86312j.m106911c(C53472h.class)).mo70732y2().mo70735jo(sendMsgParams.f23513d).systemRowid != -1) {
                    int i = sendMsgParams.f23517h;
                    C6456b[] values = C6456b.values();
                    int length = values.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            bVar = null;
                            break;
                        }
                        bVar = values[i2];
                        if (bVar.f23521d == i) {
                            break;
                        }
                        i2++;
                    }
                    int i3 = bVar == null ? -1 : C6466a.f23525a[bVar.ordinal()];
                    if (i3 == 1) {
                        C6457c cVar = C6457c.f23522d;
                        String str = sendMsgParams.f23514e;
                        String str2 = sendMsgParams.f23513d;
                        String str3 = sendMsgParams.f23515f;
                        cVar.getClass();
                        C87412m.m108594g(str, "content");
                        C87412m.m108594g(str2, "talker");
                        C87412m.m108594g(str3, "selfUserName");
                        C7250m.m7431a().mo136257Tm(str2, str, C45628s0.m50810y(str2), 0);
                    } else if (i3 == 2) {
                        C6457c cVar2 = C6457c.f23522d;
                        String str4 = sendMsgParams.f23513d;
                        String str5 = sendMsgParams.f23514e;
                        cVar2.getClass();
                        C87412m.m108594g(str4, "sessionId");
                        C87412m.m108594g(str5, "md5");
                    } else if (i3 == 3) {
                        C6457c cVar3 = C6457c.f23522d;
                        String str6 = sendMsgParams.f23514e;
                        String str7 = sendMsgParams.f23516g;
                        String str8 = sendMsgParams.f23515f;
                        String str9 = sendMsgParams.f23513d;
                        cVar3.getClass();
                        C87412m.m108594g(str6, "content");
                        C87412m.m108594g(str7, "talker");
                        C87412m.m108594g(str8, "selfUserName");
                        C87412m.m108594g(str9, "sessionId");
                    } else if (gVar != null) {
                        gVar.mo894a(new GamelifeGeneralReturnParam(false, "system err"));
                        return;
                    } else {
                        return;
                    }
                    if (gVar != null) {
                        gVar.mo894a(new GamelifeGeneralReturnParam(true, "sendmsg"));
                    }
                } else if (gVar != null) {
                    gVar.mo894a(new GamelifeGeneralReturnParam(false, "no conversation"));
                }
            } else if (gVar != null) {
                gVar.mo894a(new GamelifeGeneralReturnParam(false, "system err"));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.c$i */
    public /* synthetic */ class C6467i {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23526a;

        static {
            int[] iArr = new int[C6455a.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            iArr[3] = 4;
            iArr[4] = 5;
            iArr[5] = 6;
            iArr[6] = 7;
            iArr[7] = 8;
            f23526a = iArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7286a(t83.C13855j r14, t83.C13851h1 r15) {
        /*
            r13 = this;
            java.lang.String r0 = "env"
            gy3.C87412m.m108594g(r14, r0)
            java.lang.String r0 = "msg"
            gy3.C87412m.m108594g(r15, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r15.f38983a
            java.lang.String r1 = "functionType"
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof java.lang.String
            r2 = 0
            if (r1 == 0) goto L_0x001a
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x001b
        L_0x001a:
            r0 = r2
        L_0x001b:
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.a[] r1 = com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife.C6455a.values()
            int r3 = r1.length
            r4 = 0
            r5 = 0
        L_0x0026:
            r6 = 1
            if (r5 >= r3) goto L_0x0038
            r7 = r1[r5]
            int r8 = r7.f23519d
            if (r8 != r0) goto L_0x0031
            r8 = 1
            goto L_0x0032
        L_0x0031:
            r8 = 0
        L_0x0032:
            if (r8 == 0) goto L_0x0035
            goto L_0x0039
        L_0x0035:
            int r5 = r5 + 1
            goto L_0x0026
        L_0x0038:
            r7 = r2
        L_0x0039:
            java.util.Objects.toString(r7)
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.a[] r1 = com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife.C6455a.values()
            int r3 = r1.length
            r5 = 0
        L_0x0042:
            if (r5 >= r3) goto L_0x0053
            r7 = r1[r5]
            int r8 = r7.f23519d
            if (r8 != r0) goto L_0x004c
            r8 = 1
            goto L_0x004d
        L_0x004c:
            r8 = 0
        L_0x004d:
            if (r8 == 0) goto L_0x0050
            goto L_0x0054
        L_0x0050:
            int r5 = r5 + 1
            goto L_0x0042
        L_0x0053:
            r7 = r2
        L_0x0054:
            if (r7 != 0) goto L_0x0058
            r0 = -1
            goto L_0x0060
        L_0x0058:
            int[] r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife.C6457c.C6467i.f23526a
            int r1 = r7.ordinal()
            r0 = r0[r1]
        L_0x0060:
            java.lang.String r1 = "talker"
            java.lang.String r3 = "selfUsername"
            java.lang.String r5 = "sessionId"
            switch(r0) {
                case 1: goto L_0x036e;
                case 2: goto L_0x031a;
                case 3: goto L_0x02ef;
                case 4: goto L_0x026c;
                case 5: goto L_0x01c0;
                case 6: goto L_0x0129;
                case 7: goto L_0x00dd;
                case 8: goto L_0x006e;
                default: goto L_0x006c;
            }
        L_0x006c:
            goto L_0x037d
        L_0x006e:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r15.f38983a
            java.lang.Object r3 = r0.get(r3)
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L_0x007b
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x007c
        L_0x007b:
            r3 = r2
        L_0x007c:
            java.lang.Object r1 = r0.get(r1)
            boolean r4 = r1 instanceof java.lang.String
            if (r4 == 0) goto L_0x0087
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0088
        L_0x0087:
            r1 = r2
        L_0x0088:
            java.lang.String r4 = "scene"
            java.lang.Object r0 = r0.get(r4)
            boolean r4 = r0 instanceof java.lang.String
            if (r4 == 0) goto L_0x0096
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0097
        L_0x0096:
            r0 = r2
        L_0x0097:
            int r0 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            boolean r4 = r13.mo7486f(r3, r14, r15)
            if (r4 == 0) goto L_0x00c1
            boolean r4 = r13.mo7486f(r1, r14, r15)
            if (r4 != 0) goto L_0x00a8
            goto L_0x00c1
        L_0x00a8:
            java.lang.String r2 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetSessionIdParams r4 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetSessionIdParams
            gy3.C87412m.m108591d(r3)
            gy3.C87412m.m108591d(r1)
            r4.<init>(r3, r1, r0)
            java.lang.Class<com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.c$g> r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife.C6457c.C6464g.class
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.o r1 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.o
            r1.<init>(r14, r15)
            com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker.m98748a(r2, r4, r0, r1)
            goto L_0x039c
        L_0x00c1:
            t83.g r14 = r14.f39001d
            java.lang.String r15 = r15.f38990c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = f23524f
            r0.append(r1)
            java.lang.String r1 = ":fail getSessionId ,wrong username"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.mo10774a(r15, r0, r2)
            goto L_0x039c
        L_0x00dd:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r15.f38983a
            java.lang.String r1 = "userNameList"
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x00ed
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00ee
        L_0x00ed:
            r0 = r2
        L_0x00ee:
            if (r0 == 0) goto L_0x00f6
            int r1 = r0.length()
            if (r1 != 0) goto L_0x00f7
        L_0x00f6:
            r4 = 1
        L_0x00f7:
            if (r4 == 0) goto L_0x0113
            t83.g r1 = r14.f39001d
            java.lang.String r3 = r15.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = f23524f
            r4.append(r5)
            java.lang.String r5 = ": fail: empty username"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r1.mo10774a(r3, r4, r2)
        L_0x0113:
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            com.tencent.mm.ipcinvoker.type.IPCString r2 = new com.tencent.mm.ipcinvoker.type.IPCString
            gy3.C87412m.m108591d(r0)
            r2.<init>(r0)
            java.lang.Class<com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.c$e> r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife.C6457c.C6462e.class
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.m r3 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.m
            r3.<init>(r14, r15)
            com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker.m98748a(r1, r2, r0, r3)
            goto L_0x039c
        L_0x0129:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r15.f38983a
            java.lang.Object r1 = r0.get(r5)
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L_0x0136
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0137
        L_0x0136:
            r1 = r2
        L_0x0137:
            boolean r3 = r13.mo7485e(r1, r14, r15)
            if (r3 != 0) goto L_0x013f
            goto L_0x039c
        L_0x013f:
            java.lang.String r3 = "messageList"
            java.lang.Object r3 = r0.get(r3)
            boolean r5 = r3 instanceof java.lang.String
            if (r5 == 0) goto L_0x014c
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x014d
        L_0x014c:
            r3 = r2
        L_0x014d:
            if (r3 == 0) goto L_0x017b
            int r5 = r3.length()
            if (r5 != 0) goto L_0x0157
            r5 = 1
            goto L_0x0158
        L_0x0157:
            r5 = 0
        L_0x0158:
            if (r5 == 0) goto L_0x017b
            t83.g r14 = r14.f39001d
            java.lang.String r15 = r15.f38990c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.c r1 = f23522d
            r1.getClass()
            java.lang.String r1 = f23524f
            r0.append(r1)
            java.lang.String r1 = " fail :empty messageList"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.mo10774a(r15, r0, r2)
            goto L_0x039c
        L_0x017b:
            java.lang.String r5 = "deleteAll"
            java.lang.Object r0 = r0.get(r5)
            boolean r5 = r0 instanceof java.lang.String
            if (r5 == 0) goto L_0x0188
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0189
        L_0x0188:
            r0 = r2
        L_0x0189:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.getBoolean(r0, r4)
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.DeleteMsgParams r5 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.DeleteMsgParams
            gy3.C87412m.m108591d(r1)
            gy3.C87412m.m108591d(r3)
            r5.<init>(r1, r3, r0)
            java.lang.Class<com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.c$c> r0 = com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife.C6457c.C6460c.class
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.k r1 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.k
            r1.<init>(r14, r15)
            com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker.m98748a(r4, r5, r0, r1)
            t83.g r14 = r14.f39001d
            java.lang.String r15 = r15.f38990c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = f23524f
            r0.append(r1)
            java.lang.String r1 = ": ok"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.mo10774a(r15, r0, r2)
            goto L_0x039c
        L_0x01c0:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r15.f38983a
            java.lang.Object r5 = r0.get(r5)
            boolean r7 = r5 instanceof java.lang.String
            if (r7 == 0) goto L_0x01ce
            java.lang.String r5 = (java.lang.String) r5
            r8 = r5
            goto L_0x01cf
        L_0x01ce:
            r8 = r2
        L_0x01cf:
            java.lang.String r5 = "content"
            java.lang.Object r5 = r0.get(r5)
            boolean r7 = r5 instanceof java.lang.String
            if (r7 == 0) goto L_0x01dd
            java.lang.String r5 = (java.lang.String) r5
            r9 = r5
            goto L_0x01de
        L_0x01dd:
            r9 = r2
        L_0x01de:
            java.lang.Object r3 = r0.get(r3)
            boolean r5 = r3 instanceof java.lang.String
            if (r5 == 0) goto L_0x01ea
            java.lang.String r3 = (java.lang.String) r3
            r10 = r3
            goto L_0x01eb
        L_0x01ea:
            r10 = r2
        L_0x01eb:
            java.lang.Object r1 = r0.get(r1)
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L_0x01f7
            java.lang.String r1 = (java.lang.String) r1
            r11 = r1
            goto L_0x01f8
        L_0x01f7:
            r11 = r2
        L_0x01f8:
            java.lang.String r1 = "messageType"
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x0205
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0206
        L_0x0205:
            r0 = r2
        L_0x0206:
            int r12 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r0)
            boolean r0 = r13.mo7485e(r8, r14, r15)
            if (r0 != 0) goto L_0x0212
            goto L_0x039c
        L_0x0212:
            if (r9 == 0) goto L_0x023e
            int r0 = r9.length()
            if (r0 != 0) goto L_0x021b
            r4 = 1
        L_0x021b:
            if (r4 == 0) goto L_0x023e
            t83.g r14 = r14.f39001d
            java.lang.String r15 = r15.f38990c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.c r1 = f23522d
            r1.getClass()
            java.lang.String r1 = f23524f
            r0.append(r1)
            java.lang.String r1 = ": fail content empty"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.mo10774a(r15, r0, r2)
            goto L_0x039c
        L_0x023e:
            boolean r0 = r13.mo7486f(r10, r14, r15)
            if (r0 == 0) goto L_0x039c
            boolean r0 = r13.mo7486f(r11, r14, r15)
            if (r0 != 0) goto L_0x024c
            goto L_0x039c
        L_0x024c:
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.SendMsgParams r1 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.SendMsgParams
            gy3.C87412m.m108591d(r8)
            gy3.C87412m.m108591d(r9)
            gy3.C87412m.m108591d(r10)
            gy3.C87412m.m108591d(r11)
            r7 = r1
            r7.<init>(r8, r9, r10, r11, r12)
            java.lang.Class<com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.c$h> r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife.C6457c.C6465h.class
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.p r3 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.p
            r3.<init>(r14, r15)
            com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker.m98748a(r0, r1, r2, r3)
            goto L_0x039c
        L_0x026c:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r15.f38983a
            java.lang.Object r1 = r0.get(r5)
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L_0x027a
            java.lang.String r1 = (java.lang.String) r1
            r8 = r1
            goto L_0x027b
        L_0x027a:
            r8 = r2
        L_0x027b:
            java.lang.String r1 = "messageId"
            java.lang.Object r1 = r0.get(r1)
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L_0x0288
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0289
        L_0x0288:
            r1 = r2
        L_0x0289:
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.safeParseLong(r1)
            r3 = 0
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x02ad
            t83.g r1 = r14.f39001d
            java.lang.String r3 = r15.f38990c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = f23524f
            r4.append(r5)
            java.lang.String r5 = " fail: messageid < 0"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r1.mo10774a(r3, r4, r2)
        L_0x02ad:
            java.lang.String r1 = "limit"
            java.lang.Object r1 = r0.get(r1)
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L_0x02ba
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x02bb
        L_0x02ba:
            r1 = r2
        L_0x02bb:
            int r11 = com.tencent.p014mm.sdk.platformtools.Util.safeParseInt(r1)
            java.lang.String r1 = "isNeedFromLast"
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x02cc
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L_0x02cc:
            boolean r12 = com.tencent.p014mm.sdk.platformtools.Util.getBoolean(r2, r6)
            boolean r0 = r13.mo7485e(r8, r14, r15)
            if (r0 != 0) goto L_0x02d8
            goto L_0x039c
        L_0x02d8:
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetMsgParams r1 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.GetMsgParams
            gy3.C87412m.m108591d(r8)
            r7 = r1
            r7.<init>(r8, r9, r11, r12)
            java.lang.Class<com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.c$f> r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife.C6457c.C6463f.class
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.n r3 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.n
            r3.<init>(r14, r15)
            com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker.m98748a(r0, r1, r2, r3)
            goto L_0x039c
        L_0x02ef:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r15.f38983a
            java.lang.Object r0 = r0.get(r5)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x02fc
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L_0x02fc:
            boolean r0 = r13.mo7485e(r2, r14, r15)
            if (r0 != 0) goto L_0x0304
            goto L_0x039c
        L_0x0304:
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            com.tencent.mm.ipcinvoker.type.IPCString r1 = new com.tencent.mm.ipcinvoker.type.IPCString
            gy3.C87412m.m108591d(r2)
            r1.<init>(r2)
            java.lang.Class<com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.c$b> r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife.C6457c.C6459b.class
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.j r3 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.j
            r3.<init>(r14, r15)
            com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker.m98748a(r0, r1, r2, r3)
            goto L_0x039c
        L_0x031a:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r15.f38983a
            java.lang.Object r4 = r0.get(r5)
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L_0x0327
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0328
        L_0x0327:
            r4 = r2
        L_0x0328:
            boolean r5 = r13.mo7485e(r4, r14, r15)
            if (r5 != 0) goto L_0x032f
            goto L_0x039c
        L_0x032f:
            java.lang.Object r3 = r0.get(r3)
            boolean r5 = r3 instanceof java.lang.String
            if (r5 == 0) goto L_0x033a
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x033b
        L_0x033a:
            r3 = r2
        L_0x033b:
            java.lang.Object r0 = r0.get(r1)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x0346
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L_0x0346:
            boolean r0 = r13.mo7486f(r3, r14, r15)
            if (r0 == 0) goto L_0x039c
            boolean r0 = r13.mo7486f(r2, r14, r15)
            if (r0 != 0) goto L_0x0353
            goto L_0x039c
        L_0x0353:
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.AddConversationParams r1 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.AddConversationParams
            gy3.C87412m.m108591d(r4)
            gy3.C87412m.m108591d(r3)
            gy3.C87412m.m108591d(r2)
            r1.<init>(r4, r3, r2)
            java.lang.Class<com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.c$a> r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife.C6457c.C6458a.class
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.i r3 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.i
            r3.<init>(r14, r15)
            com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker.m98748a(r0, r1, r2, r3)
            goto L_0x039c
        L_0x036e:
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.WeChatProcess.PROCESS_MAIN
            com.tencent.mm.ipcinvoker.type.IPCVoid r1 = com.tencent.p014mm.ipcinvoker.type.IPCVoid.f10316d
            java.lang.Class<com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.c$d> r2 = com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife.C6457c.C6461d.class
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.l r3 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.l
            r3.<init>(r14, r15)
            com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker.m98748a(r0, r1, r2, r3)
            goto L_0x039c
        L_0x037d:
            t83.g r14 = r14.f39001d
            java.lang.String r15 = r15.f38990c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 32
            r0.append(r1)
            java.lang.String r1 = f23524f
            r0.append(r1)
            java.lang.String r1 = "fail:wrongmsgType"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.mo10774a(r15, r0, r2)
        L_0x039c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife.C6457c.mo7286a(t83.j, t83.h1):boolean");
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23523e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23524f;
    }

    /* renamed from: e */
    public final boolean mo7485e(String str, C13855j jVar, C13851h1 h1Var) {
        boolean z;
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        if (str != null) {
            if (str.length() == 0) {
                C13849g gVar = jVar.f39001d;
                String str2 = h1Var.f38990c;
                StringBuilder sb = new StringBuilder();
                f23522d.getClass();
                sb.append(f23524f);
                sb.append(" fail: empty sessionId");
                gVar.mo10774a(str2, sb.toString(), (Map<String, Object>) null);
                return false;
            }
            if (C72996z1.m85832c5(str)) {
                z = true;
            } else {
                Log.m105924i("GameLife.PluginGameLife", "check sessionId failed");
                z = false;
            }
            if (z) {
                return true;
            }
            C13849g gVar2 = jVar.f39001d;
            String str3 = h1Var.f38990c;
            StringBuilder sb4 = new StringBuilder();
            f23522d.getClass();
            sb4.append(f23524f);
            sb4.append(" fail: invaild sessionId");
            gVar2.mo10774a(str3, sb4.toString(), (Map<String, Object>) null);
            return false;
        }
        C13849g gVar3 = jVar.f39001d;
        String str4 = h1Var.f38990c;
        gVar3.mo10774a(str4, f23524f + " fail: null sessionId", (Map<String, Object>) null);
        return false;
    }

    /* renamed from: f */
    public final boolean mo7486f(String str, C13855j jVar, C13851h1 h1Var) {
        boolean z;
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        if (str != null) {
            if (str.length() == 0) {
                C13849g gVar = jVar.f39001d;
                String str2 = h1Var.f38990c;
                StringBuilder sb = new StringBuilder();
                f23522d.getClass();
                sb.append(f23524f);
                sb.append(" fail: empty username ");
                gVar.mo10774a(str2, sb.toString(), (Map<String, Object>) null);
                return false;
            }
            if (C72996z1.m85831b5(str)) {
                z = true;
            } else {
                Log.m105924i("GameLife.PluginGameLife", "check username failed");
                z = false;
            }
            if (z) {
                return true;
            }
            C13849g gVar2 = jVar.f39001d;
            String str3 = h1Var.f38990c;
            StringBuilder sb4 = new StringBuilder();
            f23522d.getClass();
            sb4.append(f23524f);
            sb4.append(" fail: wrong username");
            gVar2.mo10774a(str3, sb4.toString(), (Map<String, Object>) null);
            return false;
        }
        C13849g gVar3 = jVar.f39001d;
        String str4 = h1Var.f38990c;
        gVar3.mo10774a(str4, f23524f + " fail: null username", (Map<String, Object>) null);
        return false;
    }
}

package jg0;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.events.VoipEvent;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import dg0.C75398e;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import f62.C75700k0;
import hg0.C76166a;
import ke3.C88144b;
import p214om.C11502f;
import p447aw.C103918d;
import p823sg.C90193h;
import p910lj.C76701a;
import wc3.C15131b;

/* renamed from: jg0.b */
public final class C9393b implements C9392a {

    /* renamed from: a */
    public int f29327a;

    /* renamed from: b */
    public String f29328b;

    /* renamed from: c */
    public Uri f29329c;

    public C9393b(int i, String str, Uri uri) {
        this.f29327a = i;
        this.f29328b = str;
        this.f29329c = uri;
    }

    /* renamed from: a */
    public int mo1376a(Context context) {
        String str;
        String str2;
        if (context == null) {
            Log.m105920e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "null context");
            return 1;
        } else if (!C86709a0.m107523b().mo121115m() || C86718e.m107551r()) {
            Log.m105918d("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "not login, start bind login");
            return 3;
        } else {
            String str3 = "";
            if (Util.isNullOrNil((String) C86709a0.m107535s().mo121142i().mo119684e(6, str3))) {
                Log.m105918d("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "not bind mobile, start bind mobie");
                return 2;
            } else if (!((C103918d) C86312j.m106911c(C103918d.class)).Lb0(context, "android.permission.READ_CONTACTS")) {
                Log.m105920e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "no contacts permission");
                return 1;
            } else if (this.f29329c != null) {
                Cursor query = context.getContentResolver().query(this.f29329c, new String[]{"contact_id", "_id", "data4"}, (String) null, (String[]) null, (String) null);
                if (query == null) {
                    Log.m105920e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "query database err");
                    return 1;
                } else if (!query.moveToFirst()) {
                    Log.m105920e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "query database err, move to first fail");
                    query.close();
                    return 1;
                } else {
                    int columnIndex = query.getColumnIndex("data4");
                    if (columnIndex == -1) {
                        Log.m105920e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "no data4 segment exist");
                        query.close();
                        return 1;
                    }
                    try {
                        str = query.getString(columnIndex);
                        try {
                            int columnIndex2 = query.getColumnIndex("contact_id");
                            str2 = columnIndex2 >= 0 ? query.getString(columnIndex2) : str3;
                            try {
                                int columnIndex3 = query.getColumnIndex("_id");
                                if (columnIndex3 >= 0) {
                                    str3 = query.getString(columnIndex3);
                                }
                                query.close();
                                if (!Util.isNullOrNil(str)) {
                                    return mo10115b(context, str, str3, str2);
                                }
                                Log.m105920e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "null friendmobile");
                                return 1;
                            } catch (Exception e) {
                                e = e;
                                try {
                                    Log.m105921e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "match error, %s\n%s", e.getMessage(), Util.stackTraceToString(e));
                                    Log.m105921e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "result friendMobileMd5 %s contact_id %s data_id %s", str, str2, str3);
                                    return 1;
                                } finally {
                                    query.close();
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            str2 = str3;
                            Log.m105921e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "match error, %s\n%s", e.getMessage(), Util.stackTraceToString(e));
                            Log.m105921e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "result friendMobileMd5 %s contact_id %s data_id %s", str, str2, str3);
                            return 1;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        str2 = str3;
                        str = str2;
                        Log.m105921e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "match error, %s\n%s", e.getMessage(), Util.stackTraceToString(e));
                        Log.m105921e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "result friendMobileMd5 %s contact_id %s data_id %s", str, str2, str3);
                        return 1;
                    }
                }
            } else if (!Util.isNullOrNil(this.f29328b)) {
                return mo10115b(context, C90193h.m112878f(C15131b.m14237a(this.f29328b).getBytes()), (String) null, (String) null);
            } else {
                Log.m105920e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "uri is null and the phone num is null");
                return 1;
            }
        }
    }

    /* renamed from: b */
    public final int mo10115b(Context context, String str, String str2, String str3) {
        C76166a b = C75398e.vx0().mo106402b(str);
        if (context == null) {
            Log.m105920e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "null context");
            return 1;
        } else if (b == null) {
            Log.m105920e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "this user is not my friend");
            return 1;
        } else {
            String i = b.mo106389i();
            if (Util.isNullOrNil(i)) {
                Log.m105920e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "get username failed, phonenum md5 is " + str);
                return 1;
            }
            if (((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().mo69724s3(i)) {
                C115669n.INSTANCE.mo160131h(11157, Integer.valueOf(this.f29327a));
                int i2 = this.f29327a;
                if (i2 == 1) {
                    Intent intent = new Intent();
                    intent.putExtra("Chat_User", i);
                    intent.putExtra("finish_direct", true);
                    intent.addFlags(67108864);
                    ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93173f(intent, context);
                    return 0;
                } else if (i2 == 2) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("sns_userName", i);
                    intent2.addFlags(67108864);
                    intent2.putExtra("sns_adapter_type", 1);
                    C88144b.m109791i(context, "sns", ".ui.SnsUserUI", intent2, (Bundle) null);
                    return 0;
                } else if (i2 == 3) {
                    VoipEvent voipEvent = new VoipEvent();
                    VoipEvent.C67818a aVar = voipEvent.f194019d;
                    aVar.f194022b = 5;
                    aVar.f194025e = i;
                    aVar.f194024d = context;
                    aVar.f194026f = 3;
                    voipEvent.publish();
                    return 0;
                } else if (i2 == 4) {
                    VoipEvent voipEvent2 = new VoipEvent();
                    VoipEvent.C67818a aVar2 = voipEvent2.f194019d;
                    aVar2.f194022b = 5;
                    aVar2.f194025e = i;
                    aVar2.f194024d = context;
                    aVar2.f194026f = 2;
                    voipEvent2.publish();
                    return 0;
                }
            } else if (!Util.isNullOrNil(str3) && !Util.isNullOrNil(str2)) {
                if (!((C103918d) C86312j.m106911c(C103918d.class)).Lb0(context, "android.permission.READ_CONTACTS")) {
                    Log.m105920e("MicroMsg.ProcessorToChattingOrTimeLineByPhone", "no contact permission");
                    return 1;
                }
                C76701a.makeText(context, (CharSequence) context.getString(C0966R.string.bus), 1).show();
                context.getContentResolver().delete(ContactsContract.Data.CONTENT_URI, "_id = ?", new String[]{str2});
                context.getContentResolver().delete(ContactsContract.RawContacts.CONTENT_URI, "contact_id = ? AND account_type = ?", new String[]{str3, "com.tencent.mm.account"});
            }
            return 1;
        }
    }
}

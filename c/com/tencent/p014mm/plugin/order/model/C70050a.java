package com.tencent.p014mm.plugin.order.model;

import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.p014mm.plugin.order.model.C70051b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import nd2.C76853c;
import qd2.C35830a;
import td2.C13874c;

/* renamed from: com.tencent.mm.plugin.order.model.a */
public class C70050a {

    /* renamed from: a */
    public List<C70051b> f202158a = new ArrayList();

    /* renamed from: b */
    public List<C35830a> f202159b = new ArrayList();

    public C70050a() {
        int i;
        C70051b a;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Cursor all = C76853c.vx0().xx0().getAll();
        if (all != null && all.getCount() > 0) {
            all.moveToFirst();
            int columnIndex = all.getColumnIndex("msgId");
            int columnIndex2 = all.getColumnIndex("msgContentXml");
            int columnIndex3 = all.getColumnIndex("isRead");
            while (!all.isAfterLast()) {
                C35830a aVar = new C35830a();
                aVar.field_msgId = all.getString(columnIndex);
                aVar.field_msgContentXml = all.getString(columnIndex2);
                aVar.field_isRead = all.getString(columnIndex3);
                all.moveToNext();
                ((ArrayList) this.f202159b).add(aVar);
            }
        }
        if (all != null) {
            all.close();
        }
        for (int i2 = 0; i2 < ((ArrayList) this.f202159b).size(); i2++) {
            C35830a aVar2 = (C35830a) ((ArrayList) this.f202159b).get(i2);
            String str6 = aVar2.field_msgContentXml;
            C70051b bVar = null;
            Map<String, String> parseXml = XmlParser.parseXml(str6, "sysmsg", (String) null);
            if (parseXml != null) {
                bVar = new C70051b();
                bVar.f202161b = parseXml.get(".sysmsg.paymsg.PayMsgType");
                String str7 = parseXml.get(".sysmsg.paymsg.Brief.IconUrl");
                bVar.f202162c = parseXml.get(".sysmsg.paymsg.Brief.CreateTime");
                bVar.f202163d = parseXml.get(".sysmsg.paymsg.StatusSection.IconUrl");
                bVar.f202164e = parseXml.get(".sysmsg.paymsg.StatusSection.StatusDesc");
                bVar.f202165f = parseXml.get(".sysmsg.paymsg.StatusSection.Content");
                bVar.f202166g = parseXml.get(".sysmsg.paymsg.StatusSection.JumpUrl");
                bVar.f202167h = parseXml.get(".sysmsg.paymsg.ContactSection.AppUserName");
                String str8 = parseXml.get(".sysmsg.paymsg.ContactSection.AppNickName");
                bVar.f202168i = parseXml.get(".sysmsg.paymsg.ContactSection.AppTelephone");
                int i3 = 0;
                while (true) {
                    if (i3 == 0) {
                        str2 = parseXml.get(".sysmsg.paymsg.StatusSection.Button.Name");
                        str = parseXml.get(".sysmsg.paymsg.StatusSection.Button.JumpUrl");
                    } else {
                        str2 = parseXml.get(".sysmsg.paymsg.StatusSection.Button" + i3 + ".Name");
                        str = parseXml.get(".sysmsg.paymsg.StatusSection.Button" + i3 + ".JumpUrl");
                    }
                    if (TextUtils.isEmpty(str2)) {
                        break;
                    }
                    C70051b.C70052a aVar3 = new C70051b.C70052a();
                    aVar3.f202171a = str2;
                    aVar3.f202172b = str;
                    if (bVar.f202169j == null) {
                        bVar.f202169j = new ArrayList();
                    }
                    ((ArrayList) bVar.f202169j).add(aVar3);
                    i3++;
                }
                int i4 = 0;
                while (true) {
                    if (i4 == 0) {
                        str5 = parseXml.get(".sysmsg.paymsg.NormalSection.Name");
                        str4 = parseXml.get(".sysmsg.paymsg.NormalSection.Value");
                        str3 = parseXml.get(".sysmsg.paymsg.NormalSection.JumpUrl");
                    } else {
                        str5 = parseXml.get(".sysmsg.paymsg.NormalSection" + i4 + ".Name");
                        StringBuilder sb = new StringBuilder();
                        sb.append(".sysmsg.paymsg.NormalSection");
                        sb.append(i4);
                        sb.append(".JumpUrl");
                        String str9 = parseXml.get(".sysmsg.paymsg.NormalSection" + i4 + ".Value");
                        str3 = parseXml.get(sb.toString());
                        str4 = str9;
                    }
                    if (TextUtils.isEmpty(str5)) {
                        break;
                    }
                    C70051b.C70053b bVar2 = new C70051b.C70053b();
                    bVar2.f202173a = str5;
                    bVar2.f202174b = str4;
                    bVar2.f202175c = str3;
                    if (bVar.f202170k == null) {
                        bVar.f202170k = new ArrayList();
                    }
                    ((ArrayList) bVar.f202170k).add(bVar2);
                    i4++;
                }
            }
            bVar.f202160a = aVar2.field_msgId;
            ((ArrayList) this.f202158a).add(bVar);
            Log.m105926v("MicroMsg.MallPayMsgManager", "parsePayMsgFromMsgXmlList xml:" + str6);
        }
        List<C70051b> list = this.f202158a;
        if (!(list == null || ((ArrayList) list).size() == 0)) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f202158a);
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                C70051b bVar3 = (C70051b) arrayList.get(i5);
                String str10 = bVar3.f202161b;
                if (str10 != null && C13874c.m13185a(str10) && (i = Util.getInt(bVar3.f202161b, 0)) != 2 && i != 1) {
                    String str11 = bVar3.f202160a;
                    if (!TextUtils.isEmpty(str11) && (a = mo96391a(str11)) != null) {
                        ((ArrayList) this.f202158a).remove(a);
                        int i6 = 0;
                        while (true) {
                            if (i6 >= ((ArrayList) this.f202159b).size()) {
                                break;
                            }
                            C35830a aVar4 = (C35830a) ((ArrayList) this.f202159b).get(i6);
                            if (a.f202160a.equals(aVar4.field_msgId)) {
                                ((ArrayList) this.f202159b).remove(aVar4);
                                C76853c.vx0().xx0().delete(aVar4, new String[0]);
                                break;
                            }
                            i6++;
                        }
                    }
                }
            }
        }
        int b = mo96392b();
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119676J(204820, Integer.valueOf(b));
        Log.m105926v("MicroMsg.MallPayMsgManager", "save unread msg is :" + b);
    }

    /* renamed from: a */
    public final C70051b mo96391a(String str) {
        if (this.f202158a != null && !TextUtils.isEmpty(str)) {
            for (int i = 0; i < this.f202158a.size(); i++) {
                C70051b bVar = this.f202158a.get(i);
                if (str.equals(bVar.f202160a)) {
                    return bVar;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public int mo96392b() {
        List<C35830a> list = this.f202159b;
        if (list == null || list.size() == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f202159b.size(); i2++) {
            C35830a aVar = this.f202159b.get(i2);
            if (aVar != null && "0".equals(aVar.field_isRead)) {
                i++;
            }
        }
        Log.m105926v("MicroMsg.MallPayMsgManager", "msg xml unread msg is %s:" + i);
        return i;
    }

    /* renamed from: c */
    public boolean mo96393c(String str) {
        if (this.f202158a != null && !TextUtils.isEmpty(str)) {
            for (int i = 0; i < ((ArrayList) this.f202158a).size(); i++) {
                C70051b bVar = (C70051b) ((ArrayList) this.f202158a).get(i);
                if (bVar != null && bVar.f202160a.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}

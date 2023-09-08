package com.tencent.p014mm.p136ui.chatting;

import android.content.Context;
import android.net.Uri;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.LocationServerEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.FileProviderHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import d62.C75339i;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C97625j3;
import hd0.C98410o0;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import p158gt.C98201k;
import p682rz.C101488s;
import p740wo.C53193b;
import p763ym.C79138l;

/* renamed from: com.tencent.mm.ui.chatting.c4 */
public class C73327c4 {

    /* renamed from: a */
    public Context f215444a;

    /* renamed from: b */
    public List<C72963f4> f215445b;

    /* renamed from: c */
    public String f215446c = null;

    /* renamed from: d */
    public C72996z1 f215447d = null;

    /* renamed from: e */
    public SimpleDateFormat f215448e = new SimpleDateFormat("yyyy-MM-dd");

    /* renamed from: f */
    public String f215449f = null;

    /* renamed from: g */
    public ArrayList<Uri> f215450g = new ArrayList<>();

    public C73327c4(Context context, List<C72963f4> list, C72996z1 z1Var) {
        this.f215444a = context;
        this.f215445b = list;
        this.f215447d = z1Var;
    }

    /* renamed from: a */
    public final String mo102145a(C72963f4 f4Var) {
        String str;
        Class cls = C75339i.class;
        if (!C72996z1.m85820U5(this.f215447d.getUsername())) {
            str = ((C75339i) C86312j.m106911c(cls)).getDisplayName(f4Var.mo108768t());
        } else {
            String content = f4Var.getContent();
            int t = C75604z3.m90848t(content);
            if (t != -1) {
                str = ((C75339i) C86312j.m106911c(cls)).getDisplayName(content.substring(0, t).trim());
            } else {
                str = null;
            }
        }
        if (f4Var.mo108769t2() == 1) {
            Log.m105924i("MicroMsg.OtherMailHistoryExporter", "isSend");
            str = C75592q0.m90783m();
        }
        String format = new SimpleDateFormat("HH:mm").format(new Date(f4Var.getCreateTime()));
        return "" + str + "  " + format;
    }

    /* renamed from: b */
    public String mo102146b() {
        String str;
        int i;
        String str2;
        String str3;
        String str4;
        Class cls = C98201k.class;
        int i2 = 2;
        Object[] objArr = new Object[2];
        objArr[0] = Boolean.valueOf(this.f215449f == null);
        objArr[1] = Integer.valueOf(this.f215445b.size());
        Log.m105919d("MicroMsg.OtherMailHistoryExporter", "export: history is null? %B, selectItems.size = %d", objArr);
        String str5 = this.f215449f;
        if (str5 != null) {
            return str5;
        }
        this.f215450g.clear();
        StringBuilder sb = new StringBuilder();
        if (!C72996z1.m85820U5(this.f215447d.getUsername())) {
            str = String.format(this.f215444a.getString(C0966R.string.il9), new Object[]{this.f215447d.mo62909j3(), C97625j3.m125812b().mo105906u().mo119684e(4, (Object) null)});
        } else {
            if (Util.isNullOrNil(this.f215447d.getNickname())) {
                String str6 = "";
                for (String displayName : ((C53193b) C86312j.m106911c(C53193b.class)).mo73727k5(this.f215447d.getUsername())) {
                    str6 = str6 + ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(displayName) + ", ";
                }
                str4 = str6.substring(0, str6.length() - 2);
            } else {
                str4 = this.f215447d.mo62909j3();
            }
            str = String.format(this.f215444a.getString(C0966R.string.il8), new Object[]{str4});
        }
        sb.append(str);
        sb.append("\n\n");
        for (C72963f4 next : this.f215445b) {
            if (this.f215446c == null) {
                String format = this.f215448e.format(new Date(next.getCreateTime()));
                this.f215446c = format;
                sb.append(String.format("—————  %s  —————\n\n", new Object[]{format}));
                sb.append("\n");
            } else {
                String format2 = this.f215448e.format(new Date(next.getCreateTime()));
                if (!format2.equals(this.f215446c)) {
                    this.f215446c = format2;
                    sb.append(String.format("—————  %s  —————\n\n", new Object[]{format2}));
                    sb.append("\n");
                }
            }
            if (next.mo100993e4()) {
                if (next.mo100993e4()) {
                    if (next.mo108769t2() == 1) {
                        Object[] objArr2 = new Object[i2];
                        objArr2[0] = mo102145a(next);
                        objArr2[1] = next.getContent();
                        str3 = String.format("%s\n\n%s\n\n", objArr2);
                    } else if (!C72996z1.m85820U5(this.f215447d.getUsername())) {
                        Object[] objArr3 = new Object[i2];
                        objArr3[0] = mo102145a(next);
                        objArr3[1] = next.getContent();
                        str3 = String.format("%s\n\n%s\n\n", objArr3);
                    } else {
                        int t = C75604z3.m90848t(next.getContent());
                        if (t != -1) {
                            Object[] objArr4 = new Object[i2];
                            objArr4[0] = mo102145a(next);
                            objArr4[1] = next.getContent().substring(t + 1).trim();
                            str3 = String.format("%s\n\n%s\n\n", objArr4);
                        }
                    }
                    sb.append(str3);
                }
                str3 = null;
                sb.append(str3);
            } else if (next.mo100979R3()) {
                if (next.mo100979R3()) {
                    long msgId = next.getMsgId();
                    long y2 = next.mo108774y2();
                    String b = C73869u3.m87559b(((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127200vP(next.mo108768t(), msgId));
                    if (b == null) {
                        b = null;
                    }
                    if (Util.isNullOrNil(b)) {
                        b = C73869u3.m87559b(((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127168NQ(next.mo108768t(), y2));
                        if (b == null) {
                            b = null;
                        }
                    }
                    Log.m105919d("MicroMsg.OtherMailHistoryExporter", "imgPath[%s]", b);
                    if (!Util.isNullOrNil(b)) {
                        C86009m1 m1Var = new C86009m1(b);
                        this.f215450g.add(FileProviderHelper.getUriForFile(this.f215444a, m1Var));
                        str2 = String.format("%s\n\n%s\n\n", new Object[]{mo102145a(next), String.format("[%s: %s(%s)]", new Object[]{this.f215444a.getString(C0966R.string.c47), m1Var.getName(), this.f215444a.getString(C0966R.string.f360361c43)})});
                        sb.append(str2);
                        i2 = 2;
                    }
                }
                str2 = null;
                sb.append(str2);
                i2 = 2;
            } else {
                if (next.mo101020w3()) {
                    C68070l.C68072b u = C68070l.C68072b.m80422u(next.getContent(), (String) null);
                    if (u == null || !((i = u.f195582i) == 53 || i == 57)) {
                        sb.append(mo102147c(next));
                    } else {
                        sb.append((i == 53 || i == 57) ? String.format("%s\n\n%s\n\n", new Object[]{mo102145a(next), u.f195570f}) : null);
                    }
                } else {
                    sb.append(mo102147c(next));
                }
                i2 = 2;
            }
        }
        sb.append("\n\n");
        String sb4 = sb.toString();
        this.f215449f = sb4;
        return sb4;
    }

    /* renamed from: c */
    public final String mo102147c(C72963f4 f4Var) {
        String format;
        C72683d qq;
        Class cls = C101488s.class;
        String str = null;
        if (f4Var.mo100995g4()) {
            str = String.format("[%s]", new Object[]{this.f215444a.getString(C0966R.string.c4b)});
        } else if (f4Var.mo101002k4()) {
            str = f4Var.mo108769t2() == 1 ? this.f215444a.getString(C0966R.string.c4_) : this.f215444a.getString(C0966R.string.c49);
        } else if (f4Var.mo100982U3()) {
            LocationServerEvent locationServerEvent = new LocationServerEvent();
            LocationServerEvent.C67729a aVar = locationServerEvent.f193728d;
            aVar.f193730a = 1;
            aVar.f193733d = f4Var;
            locationServerEvent.publish();
            str = String.format("[%s]", new Object[]{locationServerEvent.f193729e.f193734a});
        } else if (f4Var.mo101020w3()) {
            C68070l.C68072b u = C68070l.C68072b.m80422u(Util.processXml(f4Var.getContent()), (String) null);
            if (u != null) {
                int i = u.f195582i;
                if ((i == 4 || i == 6) && (qq = C72709y1.vx0().mo100154qq(u.f195606o)) != null) {
                    C86009m1 m1Var = new C86009m1(qq.field_fileFullPath);
                    if (m1Var.mo119967g()) {
                        this.f215450g.add(FileProviderHelper.getUriForFile(this.f215444a, m1Var));
                    }
                }
                C44561j appInfo = ((C79138l) C86312j.m106911c(C79138l.class)).getAppInfo(u.f195562d);
                if (appInfo == null) {
                    format = "";
                } else {
                    String str2 = appInfo.field_appName;
                    format = 6 == u.f195582i ? String.format("[%s: %s(%s)]", new Object[]{this.f215444a.getString(C0966R.string.f360360c42), str2, this.f215444a.getString(C0966R.string.f360361c43)}) : String.format("[%s: %s]", new Object[]{this.f215444a.getString(C0966R.string.f360360c42), str2});
                }
                str = format;
            }
        } else if (f4Var.mo100975N3()) {
            str = String.format("[%s: %s]", new Object[]{this.f215444a.getString(C0966R.string.c44), ((C72972g4) C97625j3.m125812b().mo105911z()).Rv0(f4Var.getContent()).f212676b});
        } else if (f4Var.mo100994f4()) {
            Object[] objArr = new Object[3];
            objArr[0] = this.f215444a.getString(C0966R.string.c4a);
            Uri n = C116299g2.m163858n(((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137728q(f4Var.mo108765s2()));
            String path = n.getPath();
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            String path2 = n.getPath();
            int lastIndexOf = path2.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                path2 = path2.substring(lastIndexOf + 1);
            }
            objArr[1] = path2;
            objArr[2] = this.f215444a.getString(C0966R.string.f360361c43);
            str = String.format("[%s: %s(%s)]", objArr);
            C86009m1 m1Var2 = new C86009m1(((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137728q(f4Var.mo108765s2()));
            if (m1Var2.mo119967g()) {
                this.f215450g.add(FileProviderHelper.getUriForFile(this.f215444a, m1Var2));
            }
        } else if (f4Var.mo100973L3() || f4Var.mo101022y3()) {
            str = String.format("[%s]", new Object[]{this.f215444a.getString(C0966R.string.c45)});
        }
        Log.m105925i("MicroMsg.OtherMailHistoryExporter", "formatOtherMsg, msgStr = %s", str);
        return String.format("%s\n\n%s\n\n", new Object[]{mo102145a(f4Var), str});
    }
}

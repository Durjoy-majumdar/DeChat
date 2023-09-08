package c62;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.mmdata.rpt.OpenIMSucceedContactLogStruct;
import com.tencent.p014mm.modelavatar.C68097n;
import com.tencent.p014mm.modelavatar.C68098o;
import com.tencent.p014mm.plugin.messenger.SwitchContactDialogCustomView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.storage.C30771q3;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import f62.C75700k0;
import gy3.C87412m;
import i40.C98597b;
import i40.C98598e;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import k62.C99107b;
import ke3.C88144b;
import nj3.C76879j;
import o62.C11379f;
import ob0.C117747y;
import p196ln.C76706g;
import p239sv.C13785l;
import p239sv.C77792p;
import p629ny.C76979h;
import qo3.C47883u;
import qo3.C77426q;
import zt3.C119157j;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: c62.f */
public class C0419f extends C98598e {

    /* renamed from: i */
    public ProgressDialog f1033i = null;

    /* renamed from: j */
    public C13785l f1034j;

    /* renamed from: c62.f$a */
    public class C0420a implements Runnable {
        public C0420a(C0419f fVar) {
        }

        public void run() {
            int i;
            Class cls = C75700k0.class;
            C30771q3 q3Var = (C30771q3) ((C75700k0) C86709a0.m107533q(cls)).mo96107x4();
            q3Var.getClass();
            Cursor rawQuery = q3Var.f82746d.rawQuery(String.format("select count(rowid) from %s", new Object[]{"FriendUser"}), (String[]) null);
            if (rawQuery == null || !rawQuery.moveToFirst()) {
                i = 0;
            } else {
                i = rawQuery.getInt(0);
                rawQuery.close();
                Log.m105924i("MicroMsg.FriendUserStorage", "#recordCnts#, count:" + i);
            }
            C30771q3 q3Var2 = (C30771q3) ((C75700k0) C86709a0.m107533q(cls)).mo96107x4();
            q3Var2.getClass();
            ISQLiteDatabase iSQLiteDatabase = q3Var2.f82746d;
            int delete = iSQLiteDatabase.delete("FriendUser", "(modifyTime< ?)", new String[]{"" + (System.currentTimeMillis() - (((long) 7) * 86400000))});
            if (delete > 0) {
                q3Var2.doNotify();
            }
            Log.m105924i("MicroMsg.FriendUserStorage", "#Clear Records#, result:" + delete);
            C115669n.INSTANCE.mo160131h(20460, Integer.valueOf(i), Integer.valueOf(delete));
        }
    }

    /* renamed from: c62.f$b */
    public class C0421b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f1035d;

        /* renamed from: e */
        public final /* synthetic */ String f1036e;

        /* renamed from: f */
        public final /* synthetic */ Context f1037f;

        public C0421b(C0419f fVar, String str, String str2, Context context) {
            this.f1035d = str;
            this.f1036e = str2;
            this.f1037f = context;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/messenger/PluginMessenger$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Intent intent = new Intent();
            intent.putExtra("Contact_User", this.f1035d);
            intent.putExtra("AntispamTicket", this.f1036e);
            C88144b.m109795m(this.f1037f, Scopes.PROFILE, ".ui.ContactInfoUI", intent, 0);
            C117292a.m165361g(this, "com/tencent/mm/plugin/messenger/PluginMessenger$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: c62.f$c */
    public class C0422c implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ String f1038a;

        /* renamed from: b */
        public final /* synthetic */ String f1039b;

        public C0422c(C0419f fVar, String str, String str2) {
            this.f1038a = str;
            this.f1039b = str2;
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            OpenIMSucceedContactLogStruct openIMSucceedContactLogStruct = new OpenIMSucceedContactLogStruct();
            openIMSucceedContactLogStruct.mo1063s(this.f1038a);
            openIMSucceedContactLogStruct.mo1064t(this.f1039b);
            openIMSucceedContactLogStruct.f10024f = 1;
            openIMSucceedContactLogStruct.f10025g = 1;
            openIMSucceedContactLogStruct.f10027i = 1;
            openIMSucceedContactLogStruct.mo86054n();
        }
    }

    /* renamed from: c62.f$d */
    public class C0423d implements C47883u {

        /* renamed from: a */
        public final /* synthetic */ String f1040a;

        /* renamed from: b */
        public final /* synthetic */ String f1041b;

        /* renamed from: c */
        public final /* synthetic */ String f1042c;

        /* renamed from: d */
        public final /* synthetic */ String f1043d;

        /* renamed from: e */
        public final /* synthetic */ Context f1044e;

        /* renamed from: c62.f$d$a */
        public class C0424a implements DialogInterface.OnCancelListener {
            public C0424a() {
            }

            public void onCancel(DialogInterface dialogInterface) {
                C86709a0.m107524d().mo123458d((C117747y) C0419f.this.f1034j);
            }
        }

        public C0423d(String str, String str2, String str3, String str4, Context context) {
            this.f1040a = str;
            this.f1041b = str2;
            this.f1042c = str3;
            this.f1043d = str4;
            this.f1044e = context;
        }

        /* renamed from: a */
        public void mo353a(boolean z, String str) {
            if (z && C72996z1.m85843n5(this.f1040a)) {
                OpenIMSucceedContactLogStruct openIMSucceedContactLogStruct = new OpenIMSucceedContactLogStruct();
                openIMSucceedContactLogStruct.mo1063s(this.f1041b);
                openIMSucceedContactLogStruct.f10024f = 1;
                openIMSucceedContactLogStruct.mo1064t(this.f1042c);
                openIMSucceedContactLogStruct.f10025g = 1;
                openIMSucceedContactLogStruct.f10027i = 2;
                openIMSucceedContactLogStruct.mo86054n();
                C0419f.this.f1034j = ((C77792p) C86312j.m106911c(C77792p.class)).mo107737fD(this.f1040a, this.f1043d, 0);
                C0419f.this.f1034j.mo13148k0(this.f1042c);
                C86709a0.m107524d().mo123460f((C117747y) C0419f.this.f1034j);
                C0419f fVar = C0419f.this;
                Context context = this.f1044e;
                fVar.f1033i = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), this.f1044e.getString(C0966R.string.hfy), true, true, new C0424a());
            }
        }
    }

    public static String Bx0() {
        if (!C86013q1.m106450k("wcf://selectrecord/")) {
            C86013q1.m106461v("wcf://selectrecord/");
        }
        return "wcf://selectrecord/";
    }

    public final CharSequence Ax0(ArrayList<CharSequence> arrayList) {
        CharSequence spannableString = new SpannableString("");
        if (arrayList == null) {
            return spannableString;
        }
        Iterator<CharSequence> it = arrayList.iterator();
        while (it.hasNext()) {
            spannableString = TextUtils.concat(new CharSequence[]{spannableString, it.next()});
        }
        return spannableString;
    }

    public final String Cx0(String str, String str2) {
        return "FirstSwitchContactTips_" + str + "_" + str2 + "_" + ((String) C86709a0.m107535s().mo121142i().mo119684e(2, ""));
    }

    public final String Dx0(String str, String str2) {
        return "switch_contact_prefs_" + str + "_" + str2 + "_" + ((String) C86709a0.m107535s().mo121142i().mo119684e(2, ""));
    }

    public final CharSequence Ex0(CharSequence charSequence) {
        return (charSequence == null || charSequence.length() == 0) ? new SpannableString("") : charSequence;
    }

    public void Fx0(Map<String, String> map, String str, Bundle bundle, WeakReference<Context> weakReference, String str2, boolean z) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Iterator<C11379f.C11380a> it;
        String str8;
        Map<String, String> map2 = map;
        String str9 = str;
        String str10 = str2;
        Class cls = C76706g.class;
        try {
            String nullAs = Util.nullAs(bundle.getString("local_session"), "");
            if (weakReference != null && weakReference.get() != null) {
                int safeParseInt = Util.safeParseInt(map2.get(".sysmsg.sysmsgtemplate.content_template.succeed_scene"));
                if ("tmpl_type_succeed_contact_window".equals(map2.get(str9 + ".window_template.$type"))) {
                    String str11 = map2.get(str9 + ".window_template.template");
                    String str12 = map2.get(str9 + ".window_template.tp_username");
                    String str13 = map2.get(str9 + ".window_template.headimgurl");
                    if (!Util.isNullOrNil(str13) && ((C68098o) ((C76706g) C86312j.m106911c(cls)).mo106832eg()).mo93607Lo(str12) == null) {
                        C68097n nVar = new C68097n();
                        nVar.f195728a = str12;
                        nVar.f195731d = str13;
                        nVar.f195729b = 3;
                        nVar.f195733f = 0;
                        ((C68098o) ((C76706g) C86312j.m106911c(cls)).mo106832eg()).mo93608Yt(nVar);
                    }
                    String str14 = "switch_contact_prefs";
                    if (z) {
                        if (MMApplicationContext.getContext().getSharedPreferences(str14, 0).getBoolean(Dx0(str12, str10), false)) {
                            Hx0(str12);
                            return;
                        }
                    }
                    String str15 = map2.get(str9 + ".window_template.ticket");
                    String str16 = map2.get(str9 + ".window_template.antispam_ticket");
                    String str17 = map2.get(str9 + ".window_template.title");
                    String str18 = map2.get(str9 + ".window_template.cancel_wording");
                    String str19 = map2.get(str9 + ".window_template.confirm_wording");
                    ArrayList<C11379f.C11380a> a = C11379f.m11201a(str11);
                    if (a != null && a.size() > 0) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<C11379f.C11380a> it4 = a.iterator();
                        String str20 = "";
                        String str21 = str20;
                        while (true) {
                            str3 = str14;
                            if (!it4.hasNext()) {
                                break;
                            }
                            C11379f.C11380a next = it4.next();
                            if (next != null) {
                                if (next.f33506b != null) {
                                    int i = next.f33505a;
                                    if (i == 0) {
                                        it = it4;
                                        str7 = str19;
                                        arrayList.add(new SpannableString(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(MMApplicationContext.getContext(), next.f33506b)));
                                    } else {
                                        it = it4;
                                        str7 = str19;
                                        if (i == 1) {
                                            int i2 = 0;
                                            while (true) {
                                                String str22 = str9 + ".window_template.link_list.link";
                                                if (i2 != 0) {
                                                    str22 = str22 + i2;
                                                }
                                                if (Util.isNullOrNil(map2.get(str22))) {
                                                    break;
                                                }
                                                String str23 = map2.get(str22 + ".$name");
                                                StringBuilder sb = new StringBuilder();
                                                sb.append(str22);
                                                String str24 = str18;
                                                sb.append(".$type");
                                                String str25 = map2.get(sb.toString());
                                                C11379f.C11380a aVar = next;
                                                String str26 = str17;
                                                if (next.f33506b.equals(str23)) {
                                                    if ("link_plain".equals(str25)) {
                                                        arrayList.add(Ex0(map2.get(str22 + ".plain")));
                                                    }
                                                }
                                                if (!"company".equals(str23) || !"link_userdescid".equals(str25)) {
                                                    str8 = str16;
                                                } else {
                                                    StringBuilder sb4 = new StringBuilder();
                                                    sb4.append(str22);
                                                    str8 = str16;
                                                    sb4.append(".userdesc");
                                                    str21 = Ex0(map2.get(sb4.toString())).toString();
                                                }
                                                if ("nickname".equals(str23) && "link_plain".equals(str25)) {
                                                    str20 = Ex0(map2.get(str22 + ".plain")).toString();
                                                }
                                                i2++;
                                                str9 = str;
                                                next = aVar;
                                                str18 = str24;
                                                str17 = str26;
                                                str16 = str8;
                                            }
                                        }
                                    }
                                    str4 = str16;
                                    str5 = str17;
                                    str6 = str18;
                                    str9 = str;
                                    str14 = str3;
                                    it4 = it;
                                    str19 = str7;
                                    str18 = str6;
                                    str17 = str5;
                                    str16 = str4;
                                }
                            }
                            it = it4;
                            str4 = str16;
                            str5 = str17;
                            str6 = str18;
                            str7 = str19;
                            str9 = str;
                            str14 = str3;
                            it4 = it;
                            str19 = str7;
                            str18 = str6;
                            str17 = str5;
                            str16 = str4;
                        }
                        String str27 = str16;
                        String str28 = str17;
                        String str29 = str18;
                        String str30 = str19;
                        if (z) {
                            if (safeParseInt == 1) {
                                OpenIMSucceedContactLogStruct openIMSucceedContactLogStruct = new OpenIMSucceedContactLogStruct();
                                openIMSucceedContactLogStruct.mo1063s(nullAs);
                                openIMSucceedContactLogStruct.mo1064t(str10);
                                openIMSucceedContactLogStruct.f10024f = 1;
                                openIMSucceedContactLogStruct.f10025g = 1;
                                openIMSucceedContactLogStruct.f10026h = 3;
                                openIMSucceedContactLogStruct.mo86054n();
                            } else if (safeParseInt == 0) {
                                OpenIMSucceedContactLogStruct openIMSucceedContactLogStruct2 = new OpenIMSucceedContactLogStruct();
                                openIMSucceedContactLogStruct2.mo1063s(nullAs);
                                openIMSucceedContactLogStruct2.mo1064t(str10);
                                openIMSucceedContactLogStruct2.f10024f = 1;
                                openIMSucceedContactLogStruct2.f10025g = 1;
                                openIMSucceedContactLogStruct2.f10026h = 2;
                                openIMSucceedContactLogStruct2.mo86054n();
                            }
                            Gx0(weakReference.get(), nullAs, Ax0(arrayList).toString(), str12, str15, str27, str20, str21, str2, str28, str29, str30);
                            return;
                        }
                        String str31 = str3;
                        if (MMApplicationContext.getContext().getSharedPreferences(str31, 0).getBoolean(Cx0(str12, str10), true)) {
                            MMApplicationContext.getContext().getSharedPreferences(str31, 0).edit().putBoolean(Cx0(str12, str10), false).commit();
                            OpenIMSucceedContactLogStruct openIMSucceedContactLogStruct3 = new OpenIMSucceedContactLogStruct();
                            openIMSucceedContactLogStruct3.mo1063s(nullAs);
                            openIMSucceedContactLogStruct3.mo1064t(str10);
                            openIMSucceedContactLogStruct3.f10024f = 1;
                            openIMSucceedContactLogStruct3.f10025g = 1;
                            openIMSucceedContactLogStruct3.f10026h = 1;
                            openIMSucceedContactLogStruct3.mo86054n();
                            Gx0(weakReference.get(), nullAs, Ax0(arrayList).toString(), str12, str15, str27, str20, str21, str2, str28, str29, str30);
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void Gx0(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        Context context2 = context;
        String str12 = str3;
        C77426q qVar = new C77426q(context);
        SwitchContactDialogCustomView switchContactDialogCustomView = new SwitchContactDialogCustomView(context, (AttributeSet) null);
        if (Util.isNullOrNil(str9)) {
            switchContactDialogCustomView.setTilte(context.getString(C0966R.string.hfx));
        } else {
            switchContactDialogCustomView.setTilte(str9);
        }
        String str13 = str2;
        switchContactDialogCustomView.setContent(str2);
        switchContactDialogCustomView.setDesc(str6);
        switchContactDialogCustomView.setSubDesc("@" + str7);
        switchContactDialogCustomView.setPhoto(str3);
        switchContactDialogCustomView.setOnPhotoOnClick(new C0421b(this, str3, str5, context));
        String string = Util.isNullOrNil(str10) ? context.getString(C0966R.string.hfu) : str10;
        String string2 = Util.isNullOrNil(str11) ? context.getString(C0966R.string.hfw) : str11;
        qVar.mo107592d(switchContactDialogCustomView);
        qVar.mo107602n(string2);
        qVar.mo107598j(string);
        String str14 = str8;
        qVar.mo107591c(new C0422c(this, str, str14), new C0423d(str3, str, str14, str4, context));
        qVar.mo107603o();
    }

    public void Hx0(String str) {
        Log.m105924i("MicroMsg.PluginMessenger", "startChattingUI userName: " + str);
        Intent intent = new Intent();
        intent.putExtra("Chat_User", str);
        intent.putExtra("Chat_Mode", 1);
        C88144b.m109801s(MMApplicationContext.getContext(), ".ui.chatting.ChattingUI", intent, (Bundle) null);
    }

    public void wx0(HashSet<Class<? extends C98597b>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        hashSet.add(C99107b.class);
    }

    public void xx0(Context context) {
        ((C119157j) C119157j.f356862d).mo183878i(new C0420a(this), 60000);
    }
}

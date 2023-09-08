package com.tencent.p014mm.plugin.ext.provider;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import cd3.C39944a;
import com.google.android.gms.common.Scopes;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.ext.key.AESUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatAuthorities;
import com.tencent.p014mm.storage.C30733e5;
import com.tencent.p014mm.storage.C72996z1;
import eb0.C97625j3;
import j20.C117292a;
import k20.C9556a;
import ke3.C88144b;
import ra1.C47958b;

/* renamed from: com.tencent.mm.plugin.ext.provider.ExtControlProviderEntry */
public class ExtControlProviderEntry extends ExtContentProviderBase {

    /* renamed from: s */
    public static final UriMatcher f269500s;

    /* renamed from: o */
    public boolean f269501o;

    /* renamed from: p */
    public String[] f269502p;

    /* renamed from: q */
    public int f269503q;

    /* renamed from: r */
    public Context f269504r;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f269500s = uriMatcher;
        uriMatcher.addURI(WeChatAuthorities.AUTHORITIES_PLUGIN_EXT_ENTRY(), "view_profile", 2);
        uriMatcher.addURI(WeChatAuthorities.AUTHORITIES_PLUGIN_EXT_ENTRY(), "to_chatting", 3);
        uriMatcher.addURI(WeChatAuthorities.AUTHORITIES_PLUGIN_EXT_ENTRY(), "to_nearby", 4);
        uriMatcher.addURI(WeChatAuthorities.AUTHORITIES_PLUGIN_EXT_ENTRY(), "sns_comment_detail", 5);
        uriMatcher.addURI(WeChatAuthorities.AUTHORITIES_PLUGIN_EXT_ENTRY(), "share_time_line", 6);
    }

    public ExtControlProviderEntry() {
        this.f269501o = false;
        this.f269502p = null;
        this.f269503q = -1;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C72996z1 z1Var;
        Uri uri2 = uri;
        String[] strArr3 = strArr2;
        Log.m105924i("MicroMsg.ExtControlEntryProvider", "ExtControlProviderEntry query() mIsLocalUsed :" + this.f269501o);
        if (this.f269501o) {
            mo128170c(uri2, this.f269504r, this.f269503q, this.f269502p);
            if (Util.isNullOrNil(this.f269494g)) {
                Log.m105920e("MicroMsg.ExtControlEntryProvider", "AppID == null");
                mo128177j(3, 7);
                return C39944a.m42754a(7);
            } else if (Util.isNullOrNil(mo128169b())) {
                Log.m105920e("MicroMsg.ExtControlEntryProvider", "PkgName == null");
                mo128177j(3, 6);
                return C39944a.m42754a(6);
            } else {
                int f = mo128173f();
                if (f != 1) {
                    Log.m105920e("MicroMsg.ExtControlEntryProvider", "invalid appid ! return code = " + f);
                    mo128177j(2, f);
                    return C39944a.m42754a(f);
                }
            }
        } else {
            Context context = getContext();
            this.f269504r = context;
            mo128171d(uri2, context, f269500s);
            if (uri2 == null) {
                mo128176i(3);
                return null;
            } else if (Util.isNullOrNil(this.f269494g) || Util.isNullOrNil(mo128169b())) {
                mo128176i(3);
                return C39944a.m42754a(3);
            } else if (!mo128168a()) {
                mo128176i(1);
                return this.f269491d;
            } else if (!mo128174g(this.f269504r)) {
                Log.m105928w("MicroMsg.ExtControlEntryProvider", "invalid appid ! return null");
                mo128176i(2);
                return null;
            }
        }
        String nullAsNil = Util.nullAsNil(uri2.getQueryParameter(FirebaseAnalytics.C113379b.SOURCE));
        if (!this.f269501o) {
            this.f269503q = f269500s.match(uri2);
        }
        int i = this.f269503q;
        String str3 = "";
        if (i != 2) {
            if (i == 3) {
                Log.m105924i("MicroMsg.ExtControlEntryProvider", "toChattingUI");
                if (strArr3 == null || strArr3.length <= 0) {
                    Log.m105928w("MicroMsg.ExtControlEntryProvider", "wrong args");
                    mo128177j(3, 3601);
                    return C39944a.m42754a(3601);
                } else if (Util.isNullOrNil(nullAsNil)) {
                    Log.m105928w("MicroMsg.ExtControlEntryProvider", "callSource == null");
                    mo128177j(3, 3602);
                    return C39944a.m42754a(3602);
                } else {
                    String str4 = strArr3[0];
                    if (str4 == null || str4.length() <= 0) {
                        Log.m105928w("MicroMsg.ExtControlEntryProvider", "contactId == null");
                        mo128177j(3, 3603);
                        return C39944a.m42754a(3603);
                    }
                    if (nullAsNil != null && nullAsNil.equalsIgnoreCase("openapi")) {
                        try {
                            C30733e5 Lo = C47958b.Ax0().mo57647Lo(str4);
                            if (Lo != null && !Util.isNullOrNil(Lo.field_openId)) {
                                if (!Util.isNullOrNil(Lo.field_username)) {
                                    z1Var = C97625j3.m125812b().mo105907v().get(Lo.field_username);
                                }
                            }
                            Log.m105920e("MicroMsg.ExtControlEntryProvider", "openidInApp is null");
                            mo128177j(3, 3604);
                            return C39944a.m42754a(3604);
                        } catch (Exception e) {
                            Log.m105928w("MicroMsg.ExtControlEntryProvider", e.getMessage());
                            Log.printErrStackTrace("MicroMsg.ExtControlEntryProvider", e, str3, new Object[0]);
                            mo128175h(5, 4, 12);
                            return C39944a.m42754a(12);
                        }
                    } else {
                        z1Var = C97625j3.m125812b().mo105907v().mo69694e4(AESUtil.m105052a(str4));
                    }
                    if (z1Var == null || ((int) z1Var.f108320R1) <= 0 || this.f269504r == null) {
                        Log.m105920e("MicroMsg.ExtControlEntryProvider", "wrong args ct");
                        mo128177j(3, 3605);
                        return C39944a.m42754a(3605);
                    }
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName(MMApplicationContext.getApplicationId(), "com.tencent.mm.ui.chatting.ChattingUI"));
                    intent.putExtra("Chat_User", z1Var.getUsername());
                    intent.putExtra("finish_direct", true);
                    intent.addFlags(268435456);
                    intent.addFlags(67108864);
                    Context context2 = this.f269504r;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    Context context3 = context2;
                    C117292a.m165358d(context3, aVar.mo10232b(), "com/tencent/mm/plugin/ext/provider/ExtControlProviderEntry", "toChattingUI", "([Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context2.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context3, "com/tencent/mm/plugin/ext/provider/ExtControlProviderEntry", "toChattingUI", "([Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    mo128175h(4, 0, 1);
                    return C39944a.m42754a(1);
                }
            } else if (i != 4) {
                if (i != 5) {
                    if (i != 6) {
                        mo128177j(3, 15);
                        return null;
                    } else if (strArr3 == null || strArr3.length <= 0) {
                        Log.m105928w("MicroMsg.ExtControlEntryProvider", "wrong args");
                        mo128176i(3);
                        return null;
                    } else if (this.f269504r == null) {
                        mo128176i(4);
                        return null;
                    } else {
                        Intent intent2 = new Intent();
                        intent2.setComponent(new ComponentName(MMApplicationContext.getApplicationId(), "com.tencent.mm.ui.tools.ShareToTimeLineUI"));
                        intent2.setAction("android.intent.action.SEND");
                        intent2.addCategory("android.intent.category.DEFAULT");
                        intent2.addFlags(268435456);
                        String str5 = strArr3[1];
                        if (str5 != null) {
                            str3 = str5;
                        }
                        intent2.putExtra("android.intent.extra.TEXT", str3);
                        String str6 = strArr3[0];
                        if (str6 != null && str6.trim().length() > 0) {
                            intent2.putExtra("android.intent.extra.STREAM", Uri.parse(strArr3[0]));
                        }
                        intent2.putExtra("Ksnsupload_empty_img", true);
                        intent2.setType("image/*");
                        Context context4 = this.f269504r;
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(intent2);
                        Context context5 = context4;
                        C117292a.m165358d(context5, aVar2.mo10232b(), "com/tencent/mm/plugin/ext/provider/ExtControlProviderEntry", "toShareTimeLine", "([Ljava/lang/String;)Landroid/database/Cursor;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context4.startActivity((Intent) aVar2.mo10231a(0));
                        C117292a.m165359e(context5, "com/tencent/mm/plugin/ext/provider/ExtControlProviderEntry", "toShareTimeLine", "([Ljava/lang/String;)Landroid/database/Cursor;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        mo128176i(0);
                        return C39944a.m42754a(1);
                    }
                } else if (strArr3 == null || strArr3.length <= 0) {
                    Log.m105928w("MicroMsg.ExtControlEntryProvider", "wrong args");
                    mo128176i(3);
                    return null;
                } else {
                    String str7 = strArr3[0];
                    if (str7 == null || str7.length() <= 0) {
                        Log.m105928w("MicroMsg.ExtControlEntryProvider", "wrong args");
                        mo128176i(3);
                        return null;
                    }
                    try {
                        long a = AESUtil.m105052a(str7);
                        if (a <= 0) {
                            mo128176i(3);
                            return null;
                        } else if (this.f269504r == null) {
                            mo128176i(4);
                            return null;
                        } else {
                            Intent intent3 = new Intent();
                            intent3.setComponent(new ComponentName(MMApplicationContext.getApplicationId(), "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI"));
                            intent3.putExtra("INTENT_SNS_LOCAL_ID", (int) a);
                            intent3.addCategory("android.intent.category.DEFAULT");
                            intent3.addFlags(268435456);
                            Context context6 = this.f269504r;
                            C9556a aVar3 = new C9556a();
                            aVar3.mo10233c(intent3);
                            Context context7 = context6;
                            C117292a.m165358d(context7, aVar3.mo10232b(), "com/tencent/mm/plugin/ext/provider/ExtControlProviderEntry", "toSnsCommentDetail", "([Ljava/lang/String;)Landroid/database/Cursor;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            context6.startActivity((Intent) aVar3.mo10231a(0));
                            C117292a.m165359e(context7, "com/tencent/mm/plugin/ext/provider/ExtControlProviderEntry", "toSnsCommentDetail", "([Ljava/lang/String;)Landroid/database/Cursor;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            mo128176i(0);
                            return C39944a.m42754a(1);
                        }
                    } catch (Exception e2) {
                        Exception exc = e2;
                        Log.m105928w("MicroMsg.ExtControlEntryProvider", exc.getMessage());
                        Log.printErrStackTrace("MicroMsg.ExtControlEntryProvider", exc, str3, new Object[0]);
                        mo128176i(3);
                        return null;
                    }
                }
            } else if (this.f269504r == null) {
                mo128176i(4);
                return null;
            } else {
                Intent intent4 = new Intent();
                intent4.setComponent(new ComponentName(MMApplicationContext.getApplicationId(), "com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI"));
                intent4.addFlags(268435456);
                Context context8 = this.f269504r;
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(intent4);
                Context context9 = context8;
                C117292a.m165358d(context9, aVar4.mo10232b(), "com/tencent/mm/plugin/ext/provider/ExtControlProviderEntry", "toNearBy", "()Landroid/database/Cursor;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context8.startActivity((Intent) aVar4.mo10231a(0));
                C117292a.m165359e(context9, "com/tencent/mm/plugin/ext/provider/ExtControlProviderEntry", "toNearBy", "()Landroid/database/Cursor;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mo128176i(0);
                return C39944a.m42754a(1);
            }
        } else if (strArr3 == null || strArr3.length <= 0) {
            Log.m105928w("MicroMsg.ExtControlEntryProvider", "wrong args");
            mo128176i(3);
            return null;
        } else {
            String str8 = strArr3[0];
            if (str8 == null || str8.length() <= 0) {
                Log.m105928w("MicroMsg.ExtControlEntryProvider", "contactId == null");
                mo128176i(3);
                return null;
            }
            try {
                C72996z1 e4 = C97625j3.m125812b().mo105907v().mo69694e4(AESUtil.m105052a(str8));
                if (e4 == null || ((int) e4.f108320R1) <= 0 || this.f269504r == null) {
                    mo128176i(3);
                    return null;
                }
                Intent intent5 = new Intent();
                intent5.addFlags(268435456);
                intent5.putExtra("Contact_User", e4.getUsername());
                C88144b.m109791i(this.f269504r, Scopes.PROFILE, ".ui.ContactInfoUI", intent5, (Bundle) null);
                mo128176i(0);
                return C39944a.m42754a(1);
            } catch (Exception e3) {
                Log.m105928w("MicroMsg.ExtControlEntryProvider", e3.getMessage());
                Log.printErrStackTrace("MicroMsg.ExtControlEntryProvider", e3, str3, new Object[0]);
                mo128176i(3);
                return null;
            }
        }
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public ExtControlProviderEntry(String[] strArr, int i, Context context) {
        this.f269501o = true;
        this.f269502p = strArr;
        this.f269503q = i;
        this.f269504r = context;
    }
}

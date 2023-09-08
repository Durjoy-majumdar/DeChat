package com.tencent.wework.api;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.wework.api.IWWAPI;
import com.tencent.wework.api.model.BaseMessage;
import com.tencent.wework.api.util.OpenDataUtils;
import j20.C117292a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import k20.C9556a;

public final class WWAPIImplLocal implements IWWAPI {

    /* renamed from: e */
    public static final ArrayList<String> f285793e = new ArrayList<String>() {
        {
            add("011A40266C8C75D181DDD8E4DDC50075");
            add("F5BF8B3B1B616EFEF88681716C061BA4");
            add("99A7B5BDA8615128675831C01F208344");
            add("B374B823AD2BF3F216AC8F67B86CE189");
        }
    };

    /* renamed from: a */
    public final Context f285794a;

    /* renamed from: b */
    public Map<String, Object> f285795b = new HashMap();

    /* renamed from: c */
    public BroadcastReceiver f285796c = new BroadcastReceiver() {
        public void onReceive(Context context, Intent intent) {
            try {
                WWAPIImplLocal wWAPIImplLocal = WWAPIImplLocal.this;
                ArrayList<String> arrayList = WWAPIImplLocal.f285793e;
                wWAPIImplLocal.getClass();
                intent.getScheme();
                throw null;
            } catch (Throwable unused) {
            }
        }
    };

    /* renamed from: d */
    public SharedPreferences f285797d = null;

    static {
        new ArrayList<String>() {
            {
                add("com.tencent.wework");
                add("com.tencent.wwgovernment");
            }
        };
        new ArrayList<String>() {
            {
                add("com.tencent.wework");
            }
        };
    }

    public WWAPIImplLocal(Context context) {
        this.f285794a = context;
        this.f285797d = context.getSharedPreferences("wxwork_wwapi_store", 0);
    }

    /* renamed from: f */
    public static String m125320f(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.reset();
            instance.update(bArr);
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b : digest) {
                sb.append(Integer.toHexString((b & 240) >>> 4));
                sb.append(Integer.toHexString(b & 15));
            }
            return sb.toString().toUpperCase();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* renamed from: a */
    public boolean mo136603a(BaseMessage baseMessage, IWWAPI.WWAppType wWAppType) {
        BaseMessage baseMessage2 = baseMessage;
        IWWAPI.WWAppType wWAppType2 = wWAppType;
        ArrayList arrayList = new ArrayList();
        if (wWAppType2 == IWWAPI.WWAppType.WwAppTypeDefault) {
            arrayList.add("com.tencent.wework");
        } else if (wWAppType2 == IWWAPI.WWAppType.WwAppTypeWxwork) {
            arrayList.add("com.tencent.wework");
            arrayList.add("com.tencent.weworkenterprise");
        } else if (wWAppType2 == IWWAPI.WWAppType.WwAppTypeLocal) {
            arrayList.add("com.tencent.wwgovernment");
            arrayList.add("com.tencent.weworklocal");
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if ((str.equals("com.tencent.wework") || str.equals("com.tencent.wwgovernment")) && mo136612i(str)) {
                Intent intent = new Intent("com.tencent.wework.apihost");
                intent.setClassName(str, "com.tencent.wework.apihost.WWAPIActivity");
                intent.addFlags(411041792);
                try {
                    baseMessage2.mo136618e(str);
                    baseMessage2.mo136617d(this.f285794a);
                    Bundle c = BaseMessage.m125331c(baseMessage);
                    Context context = this.f285794a;
                    long a = OpenDataUtils.m125363a(context, context.getPackageName(), str, c);
                    if (a > 0) {
                        intent.putExtra("data_id", a);
                        intent.putExtra("data_pkg", this.f285794a.getPackageName());
                    } else {
                        intent.putExtras(c);
                    }
                    intent.putExtra("PendingIntent", PendingIntent.getBroadcast(this.f285794a, 0, new Intent(this.f285794a, this.f285796c.getClass()), 201326592));
                    baseMessage2.mo136615a(intent, str);
                    Context context2 = this.f285794a;
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/wework/api/WWAPIImplLocal", "sendMessage", "(Lcom/tencent/wework/api/model/BaseMessage;Lcom/tencent/wework/api/IWWAPI$WWAppType;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context2.startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(context2, "com/tencent/wework/api/WWAPIImplLocal", "sendMessage", "(Lcom/tencent/wework/api/model/BaseMessage;Lcom/tencent/wework/api/IWWAPI$WWAppType;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return true;
                } catch (Throwable unused) {
                }
            } else {
                String str2 = "";
                if (str.equals("com.tencent.weworkenterprise")) {
                    Intent intent2 = new Intent("com.tencent.wework.api.sharemsg", Uri.parse("wxwork://jump"));
                    if (mo136611h(intent2)) {
                        str = mo136610g(intent2);
                        if (!mo136612i(str)) {
                            return false;
                        }
                        str2 = "wxwork";
                    }
                } else if (str.equals("com.tencent.weworklocal")) {
                    Intent intent3 = new Intent("com.tencent.wework.api.sharemsg", Uri.parse("wxworkgovuniform://jump"));
                    if (mo136611h(intent3)) {
                        str = mo136610g(intent3);
                        if (!mo136612i(str)) {
                            return false;
                        }
                        str2 = "wxworkgovuniform";
                    }
                } else {
                    continue;
                }
                if (TextUtils.isEmpty(str2)) {
                    continue;
                } else {
                    Intent intent4 = new Intent("com.tencent.wework.api.sharemsg", Uri.parse(str2 + "://jump"));
                    intent4.addFlags(411041792);
                    try {
                        baseMessage2.mo136618e(str);
                        baseMessage2.mo136617d(this.f285794a);
                        Bundle c2 = BaseMessage.m125331c(baseMessage);
                        Context context3 = this.f285794a;
                        long a2 = OpenDataUtils.m125363a(context3, context3.getPackageName(), str, c2);
                        if (a2 > 0) {
                            intent4.putExtra("data_id", a2);
                            intent4.putExtra("data_pkg", this.f285794a.getPackageName());
                        } else {
                            intent4.putExtras(c2);
                        }
                        intent4.putExtra("PendingIntent", PendingIntent.getBroadcast(this.f285794a, 0, new Intent(this.f285794a, this.f285796c.getClass()), 201326592));
                        baseMessage2.mo136615a(intent4, str);
                        Context context4 = this.f285794a;
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(intent4);
                        C117292a.m165358d(context4, aVar2.mo10232b(), "com/tencent/wework/api/WWAPIImplLocal", "sendMessage", "(Lcom/tencent/wework/api/model/BaseMessage;Lcom/tencent/wework/api/IWWAPI$WWAppType;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context4.startActivity((Intent) aVar2.mo10231a(0));
                        C117292a.m165359e(context4, "com/tencent/wework/api/WWAPIImplLocal", "sendMessage", "(Lcom/tencent/wework/api/model/BaseMessage;Lcom/tencent/wework/api/IWWAPI$WWAppType;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        Objects.toString(wWAppType);
                        return true;
                    } catch (Throwable unused2) {
                        Objects.toString(wWAppType);
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public String mo136604b(IWWAPI.WWAppType wWAppType) {
        return wWAppType == IWWAPI.WWAppType.WwAppTypeLocal ? "政务微信" : "企业微信";
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo136605c() {
        /*
            r4 = this;
            java.lang.String r0 = "com.tencent.wework"
            r1 = 0
            android.content.Context r2 = r4.f285794a     // Catch:{ all -> 0x0015 }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ all -> 0x0015 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r0 = r2.getPackageInfo(r0, r3)     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x0012
            goto L_0x0015
        L_0x0012:
            int r0 = r0.versionCode     // Catch:{ all -> 0x0015 }
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            r2 = 20104(0x4e88, float:2.8172E-41)
            if (r0 <= r2) goto L_0x001b
            r1 = 1
        L_0x001b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wework.api.WWAPIImplLocal.mo136605c():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo136606d() {
        /*
            r4 = this;
            java.lang.String r0 = "com.tencent.wework"
            r1 = 0
            android.content.Context r2 = r4.f285794a     // Catch:{ all -> 0x0015 }
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch:{ all -> 0x0015 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r0 = r2.getPackageInfo(r0, r3)     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x0012
            goto L_0x0015
        L_0x0012:
            int r0 = r0.versionCode     // Catch:{ all -> 0x0015 }
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            r2 = 20104(0x4e88, float:2.8172E-41)
            if (r0 < r2) goto L_0x001b
            r1 = 1
        L_0x001b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wework.api.WWAPIImplLocal.mo136606d():boolean");
    }

    /* renamed from: e */
    public boolean mo136607e(IWWAPI.WWAppType wWAppType) {
        if (wWAppType == IWWAPI.WWAppType.WwAppTypeDefault) {
            return mo136612i("com.tencent.wework");
        }
        if (wWAppType == IWWAPI.WWAppType.WwAppTypeWxwork) {
            return mo136612i("com.tencent.wework") || mo136612i("com.tencent.wwgovernment") || mo136611h(new Intent("com.tencent.wework.api.sharemsg", Uri.parse("wxwork://jump")));
        } else if (wWAppType != IWWAPI.WWAppType.WwAppTypeLocal) {
            return false;
        } else {
            return mo136612i("com.tencent.wwgovernment") || mo136611h(new Intent("com.tencent.wework.api.sharemsg", Uri.parse("wxworkgovuniform://jump")));
        }
    }

    /* renamed from: g */
    public final String mo136610g(Intent intent) {
        List<ResolveInfo> queryIntentActivities = this.f285794a.getPackageManager().queryIntentActivities(intent, 65536);
        return queryIntentActivities.size() > 0 ? queryIntentActivities.get(0).activityInfo.applicationInfo.packageName : "";
    }

    /* renamed from: h */
    public final boolean mo136611h(Intent intent) {
        return this.f285794a.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }

    /* renamed from: i */
    public final boolean mo136612i(String str) {
        String str2;
        try {
            str2 = m125320f(this.f285794a.getPackageManager().getPackageInfo(str, 64).signatures[0].toByteArray());
        } catch (Throwable unused) {
            str2 = "";
        }
        return f285793e.contains(str2);
    }
}

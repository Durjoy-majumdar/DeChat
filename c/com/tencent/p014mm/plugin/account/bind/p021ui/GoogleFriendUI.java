package com.tencent.p014mm.plugin.account.bind.p021ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.modelavatar.AvatarStorage;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.plugin.account.bind.p021ui.C40408a;
import com.tencent.p014mm.plugin.account.friend.p022ui.InviteFriendUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import hg0.C46060q0;
import hg0.C46061r0;
import hg0.C46065v;
import hg0.C46067w;
import hg0.C8524u;
import j20.C117292a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C9556a;
import mg0.C76754b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;
import p011cm.C28611c;
import p196ln.C10579k;
import p196ln.C76706g;
import p214om.C11502f;
import p910lj.C76701a;
import rm0.C90029f;
import te3.C49032co2;
import te3.C51552ui2;

/* renamed from: com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI */
public class GoogleFriendUI extends MMActivity implements C11385n, AdapterView.OnItemClickListener, C40408a.C40409a, C10579k.C10580a {

    /* renamed from: u */
    public static final /* synthetic */ int f108576u = 0;

    /* renamed from: d */
    public TextView f108577d;

    /* renamed from: e */
    public ListView f108578e;

    /* renamed from: f */
    public C40408a f108579f;

    /* renamed from: g */
    public String f108580g;

    /* renamed from: h */
    public boolean f108581h = false;

    /* renamed from: i */
    public String f108582i;

    /* renamed from: j */
    public String f108583j;

    /* renamed from: n */
    public String f108584n;

    /* renamed from: o */
    public boolean f108585o = false;

    /* renamed from: p */
    public ProgressDialog f108586p;

    /* renamed from: q */
    public C46061r0 f108587q;

    /* renamed from: r */
    public ArrayList<C46065v> f108588r = new ArrayList<>();

    /* renamed from: s */
    public HashMap<String, C46065v> f108589s = new HashMap<>();

    /* renamed from: t */
    public int f108590t;

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI$a */
    public class C40402a implements MenuItem.OnMenuItemClickListener {
        public C40402a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            GoogleFriendUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI$b */
    public class C40403b implements C106742j1.C106756o {
        public C40403b() {
        }

        /* renamed from: H5 */
        public void mo1321H5() {
        }

        /* renamed from: S6 */
        public boolean mo1322S6(String str) {
            return false;
        }

        /* renamed from: i7 */
        public void mo1323i7() {
        }

        /* renamed from: l3 */
        public void mo1324l3(String str) {
            GoogleFriendUI.this.f108580g = Util.escapeSqlValue(str);
            GoogleFriendUI googleFriendUI = GoogleFriendUI.this;
            C40408a aVar = googleFriendUI.f108579f;
            if (aVar != null) {
                String str2 = googleFriendUI.f108580g;
                aVar.getClass();
                aVar.f108610r = Util.escapeSqlValue(str2);
                aVar.mo5580b();
                aVar.mo1333o();
            }
        }

        /* renamed from: l5 */
        public void mo1325l5() {
        }

        /* renamed from: y4 */
        public void mo1326y4() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI$c */
    public class C40404c implements DialogInterface.OnCancelListener {
        public C40404c() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            GoogleFriendUI.this.f108585o = true;
            C86709a0.m107524d().mo123458d(GoogleFriendUI.this.f108587q);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI$d */
    public enum C40405d {
        SUCCESS,
        NO_CONTACT,
        ACCESS_DEDY,
        OTHER
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI$e */
    public class C40406e extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        public Context f108599a;

        /* renamed from: b */
        public String f108600b;

        /* renamed from: c */
        public C40405d f108601c = C40405d.OTHER;

        public C40406e(Context context, String str, C40402a aVar) {
            this.f108599a = context;
            this.f108600b = str;
        }

        /* renamed from: a */
        public final String mo63159a(String str, String str2, int i, int i2, String str3) {
            URL url = new URL("https://www.google.com/m8/feeds/contacts/default/property-email?alt=" + str2 + "&max-results=" + i + "&start-index=" + i2 + "&access_token=" + str3);
            Log.m105925i("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "requestURL:%s", url.toString());
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(20000);
            int responseCode = httpURLConnection.getResponseCode();
            Log.m105925i("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "responseCode:%d", Integer.valueOf(responseCode));
            if (responseCode == 200) {
                InputStream inputStream = httpURLConnection.getInputStream();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[20480];
                while (true) {
                    int read = inputStream.read(bArr, 0, 20480);
                    if (read != -1) {
                        byteArrayOutputStream.write(bArr, 0, read);
                    } else {
                        String str4 = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                        inputStream.close();
                        return str4;
                    }
                }
            } else {
                if (responseCode == 401) {
                    Log.m105920e("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "Server OAuth Error,Please Try Again.");
                } else {
                    Log.m105920e("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "Unknow Error.");
                }
                try {
                    httpURLConnection.getInputStream().close();
                } catch (Exception e) {
                    Log.m105920e("MicroMsg.GoogleContact.GoogleAPIAsyncTask", e.getMessage());
                }
                httpURLConnection.disconnect();
                return null;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x004a, code lost:
            r2 = r2.getString("$t");
            r8 = r2.lastIndexOf("/");
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo63160b(java.lang.String r11) {
            /*
                r10 = this;
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>(r11)
                java.lang.String r11 = "feed"
                org.json.JSONObject r11 = r0.getJSONObject(r11)
                java.lang.String r0 = "entry"
                org.json.JSONArray r11 = r11.getJSONArray(r0)
                if (r11 == 0) goto L_0x0108
                r0 = 0
                r1 = 0
            L_0x0015:
                int r2 = r11.length()
                if (r1 >= r2) goto L_0x0108
                org.json.JSONObject r2 = r11.getJSONObject(r1)
                java.lang.String r3 = "id"
                org.json.JSONObject r2 = r2.optJSONObject(r3)
                org.json.JSONObject r3 = r11.getJSONObject(r1)
                java.lang.String r4 = "title"
                org.json.JSONObject r3 = r3.optJSONObject(r4)
                org.json.JSONObject r4 = r11.getJSONObject(r1)
                java.lang.String r5 = "gd$email"
                org.json.JSONArray r4 = r4.optJSONArray(r5)
                org.json.JSONObject r5 = r11.getJSONObject(r1)
                java.lang.String r6 = "link"
                org.json.JSONArray r5 = r5.optJSONArray(r6)
                java.lang.String r6 = "$t"
                java.lang.String r7 = ""
                if (r2 == 0) goto L_0x005d
                java.lang.String r2 = r2.getString(r6)
                java.lang.String r8 = "/"
                int r8 = r2.lastIndexOf(r8)
                if (r8 <= 0) goto L_0x005d
                int r8 = r8 + 1
                java.lang.String r2 = r2.substring(r8)
                goto L_0x005e
            L_0x005d:
                r2 = r7
            L_0x005e:
                if (r3 == 0) goto L_0x0065
                java.lang.String r3 = r3.getString(r6)
                goto L_0x0066
            L_0x0065:
                r3 = r7
            L_0x0066:
                if (r5 == 0) goto L_0x00a2
                r6 = 0
            L_0x0069:
                int r8 = r5.length()
                if (r6 >= r8) goto L_0x00a2
                org.json.JSONObject r8 = r5.getJSONObject(r6)
                java.lang.String r9 = "rel"
                java.lang.String r8 = r8.getString(r9)
                java.lang.String r9 = "#"
                int r9 = r8.lastIndexOf(r9)
                if (r9 <= 0) goto L_0x009f
                int r9 = r9 + 1
                java.lang.String r8 = r8.substring(r9)
                boolean r9 = android.text.TextUtils.isEmpty(r8)
                if (r9 != 0) goto L_0x009f
                java.lang.String r9 = "photo"
                boolean r8 = r9.equals(r8)
                if (r8 == 0) goto L_0x009f
                org.json.JSONObject r7 = r5.getJSONObject(r6)
                java.lang.String r8 = "href"
                java.lang.String r7 = r7.getString(r8)
            L_0x009f:
                int r6 = r6 + 1
                goto L_0x0069
            L_0x00a2:
                if (r4 == 0) goto L_0x0104
                r5 = 0
            L_0x00a5:
                int r6 = r4.length()
                if (r5 >= r6) goto L_0x0104
                org.json.JSONObject r6 = r4.getJSONObject(r5)
                java.lang.String r8 = "address"
                java.lang.String r6 = r6.getString(r8)
                boolean r8 = android.text.TextUtils.isEmpty(r6)
                if (r8 != 0) goto L_0x0101
                boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isValidEmail(r6)
                if (r8 == 0) goto L_0x0101
                com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI r8 = com.tencent.p014mm.plugin.account.bind.p021ui.GoogleFriendUI.this
                java.lang.String r8 = r8.f108582i
                boolean r8 = r6.equals(r8)
                if (r8 != 0) goto L_0x0101
                hg0.v r8 = new hg0.v
                r8.<init>()
                r8.field_googleid = r2
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r2)
                r9.append(r6)
                java.lang.String r9 = r9.toString()
                r8.field_googleitemid = r9
                r8.field_googlename = r3
                r8.field_googlephotourl = r7
                r8.field_googlegmail = r6
                com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI r9 = com.tencent.p014mm.plugin.account.bind.p021ui.GoogleFriendUI.this
                java.util.HashMap<java.lang.String, hg0.v> r9 = r9.f108589s
                boolean r9 = r9.containsKey(r6)
                if (r9 != 0) goto L_0x0101
                com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI r9 = com.tencent.p014mm.plugin.account.bind.p021ui.GoogleFriendUI.this
                java.util.ArrayList<hg0.v> r9 = r9.f108588r
                r9.add(r8)
                com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI r9 = com.tencent.p014mm.plugin.account.bind.p021ui.GoogleFriendUI.this
                java.util.HashMap<java.lang.String, hg0.v> r9 = r9.f108589s
                r9.put(r6, r8)
            L_0x0101:
                int r5 = r5 + 1
                goto L_0x00a5
            L_0x0104:
                int r1 = r1 + 1
                goto L_0x0015
            L_0x0108:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.account.bind.p021ui.GoogleFriendUI.C40406e.mo63160b(java.lang.String):void");
        }

        /* renamed from: c */
        public final int mo63161c(String str) {
            return new JSONObject(str).getJSONObject("feed").getJSONObject("openSearch$totalResults").getInt("$t");
        }

        public Object doInBackground(Object[] objArr) {
            boolean z;
            Void[] voidArr = (Void[]) objArr;
            Log.m105924i("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "doInBackground");
            int i = 0;
            int i2 = 1;
            while (true) {
                try {
                    Log.m105925i("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "startInde:%d, totalCount:%d", Integer.valueOf(i2), Integer.valueOf(i));
                    String a = mo63159a("https://www.google.com/m8/feeds/contacts/default/full", "json", 100, i2, this.f108600b);
                    int c = mo63161c(a);
                    if (c > 0) {
                        mo63160b(a);
                    }
                    if (c - i2 > 100) {
                        i2 += 100;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        break;
                    } else if (GoogleFriendUI.this.f108585o) {
                        break;
                    } else {
                        i = c;
                    }
                } catch (IOException e) {
                    this.f108601c = C40405d.ACCESS_DEDY;
                    Log.m105920e("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "IOException" + e.getMessage());
                    return null;
                } catch (JSONException e2) {
                    this.f108601c = C40405d.OTHER;
                    Log.m105920e("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "JSONException" + e2.getMessage());
                    return null;
                }
            }
            this.f108601c = C40405d.SUCCESS;
            return null;
        }

        public void onPostExecute(Object obj) {
            super.onPostExecute((Void) obj);
            Log.m105924i("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "onPostExecute");
            C40405d dVar = this.f108601c;
            C40405d dVar2 = C40405d.SUCCESS;
            if (dVar == dVar2) {
                ArrayList<C46065v> arrayList = GoogleFriendUI.this.f108588r;
                if (arrayList == null || arrayList.size() <= 0) {
                    GoogleFriendUI.m43595H7(GoogleFriendUI.this, C40405d.NO_CONTACT, (ArrayList) null);
                    return;
                }
                GoogleFriendUI googleFriendUI = GoogleFriendUI.this;
                GoogleFriendUI.m43595H7(googleFriendUI, dVar2, googleFriendUI.f108588r);
                return;
            }
            GoogleFriendUI.m43595H7(GoogleFriendUI.this, dVar, (ArrayList) null);
        }

        public void onPreExecute() {
            super.onPreExecute();
            Log.m105924i("MicroMsg.GoogleContact.GoogleAPIAsyncTask", "onPreExecute");
            GoogleFriendUI.this.f108588r.clear();
            GoogleFriendUI.this.f108589s.clear();
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.bind.ui.GoogleFriendUI$f */
    public class C40407f extends AsyncTask<Void, Void, Void> {

        /* renamed from: a */
        public String f108603a;

        /* renamed from: b */
        public String f108604b;

        /* renamed from: c */
        public boolean f108605c;

        public C40407f(String str) {
            this.f108603a = str;
        }

        /* renamed from: a */
        public final String mo63165a(String str) {
            return new JSONObject(str).optString("access_token");
        }

        /* renamed from: b */
        public final String mo63166b() {
            String str;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/token").openConnection();
            httpURLConnection.setRequestProperty("Charset", "UTF-8");
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setConnectTimeout(20000);
            httpURLConnection.setReadTimeout(20000);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new BasicNameValuePair("refresh_token", this.f108603a));
            arrayList.add(new BasicNameValuePair("client_id", "369820936870.apps.googleusercontent.com"));
            arrayList.add(new BasicNameValuePair("client_secret", "wcFhvo-s7wNcmQ9Zjr00H06u"));
            arrayList.add(new BasicNameValuePair("grant_type", "refresh_token"));
            String a = C8524u.m8418a(arrayList);
            Log.m105924i("MicroMsg.GoogleContact.GoogleFriendUI", "QueryString:%s" + a);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8"));
            bufferedWriter.write(a);
            bufferedWriter.flush();
            bufferedWriter.close();
            int responseCode = httpURLConnection.getResponseCode();
            Log.m105920e("MicroMsg.GoogleContact.GoogleFriendUI", "responseCode:" + responseCode);
            if (200 == responseCode) {
                StringBuffer stringBuffer = new StringBuffer();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    stringBuffer.append(readLine);
                }
                bufferedReader.close();
                str = stringBuffer.toString();
                Log.m105924i("MicroMsg.GoogleContact.GoogleFriendUI", "exchange token respone:%s" + str);
            } else {
                str = "";
            }
            try {
                httpURLConnection.getInputStream().close();
            } catch (Exception e) {
                Log.m105920e("MicroMsg.GoogleContact.GoogleFriendUI", e.getMessage());
            }
            httpURLConnection.disconnect();
            return str;
        }

        public Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            Log.m105924i("MicroMsg.GoogleContact.GoogleFriendUI", "doInBackground");
            try {
                String b = mo63166b();
                Log.m105925i("MicroMsg.GoogleContact.GoogleFriendUI", "refresh response:%s", b);
                this.f108604b = mo63165a(b);
                this.f108605c = true;
                return null;
            } catch (ProtocolException e) {
                Log.m105921e("MicroMsg.GoogleContact.GoogleFriendUI", "ProtocolException:%s", e.getMessage());
                return null;
            } catch (MalformedURLException e2) {
                Log.m105921e("MicroMsg.GoogleContact.GoogleFriendUI", "MalformedURLException:%s", e2.getMessage());
                return null;
            } catch (IOException e3) {
                Log.m105921e("MicroMsg.GoogleContact.GoogleFriendUI", "IOException:%s", e3.getMessage());
                return null;
            } catch (JSONException e4) {
                Log.m105921e("MicroMsg.GoogleContact.GoogleFriendUI", "JSONException:%s", e4.getMessage());
                return null;
            }
        }

        public void onPostExecute(Object obj) {
            super.onPostExecute((Void) obj);
            Log.m105924i("MicroMsg.GoogleContact.GoogleFriendUI", "onPostExecute");
            GoogleFriendUI googleFriendUI = GoogleFriendUI.this;
            boolean z = this.f108605c;
            String str = this.f108604b;
            int i = GoogleFriendUI.f108576u;
            if (z) {
                googleFriendUI.getClass();
                if (!TextUtils.isEmpty(str)) {
                    googleFriendUI.f108583j = str;
                    C86709a0.m107535s().mo121142i().mo119676J(208902, str);
                    googleFriendUI.f108585o = false;
                    googleFriendUI.mo63154L7();
                    new C40406e(googleFriendUI, googleFriendUI.f108583j, (C40402a) null).execute(new Void[0]);
                    return;
                }
            }
            googleFriendUI.mo63152J7();
            googleFriendUI.mo63153K7(false);
        }

        public void onPreExecute() {
            super.onPreExecute();
            Log.m105924i("MicroMsg.GoogleContact.GoogleFriendUI", "onPreExecute");
            this.f108605c = false;
        }
    }

    /* renamed from: H7 */
    public static void m43595H7(GoogleFriendUI googleFriendUI, C40405d dVar, ArrayList arrayList) {
        googleFriendUI.getClass();
        Class<BindGoogleContactUI> cls = BindGoogleContactUI.class;
        Log.m105925i("MicroMsg.GoogleContact.GoogleFriendUI", "[handleGetGoogleContactListTaskReturn] success:%s", dVar);
        if (dVar == C40405d.SUCCESS && !googleFriendUI.f108585o) {
            googleFriendUI.f108587q = new C46061r0(arrayList, googleFriendUI.f108590t, googleFriendUI.f108589s, googleFriendUI.f108583j);
            C86709a0.m107524d().mo123460f(googleFriendUI.f108587q);
        } else if (dVar == C40405d.NO_CONTACT) {
            googleFriendUI.mo63152J7();
            Log.m105924i("MicroMsg.GoogleContact.GoogleFriendUI", "Google Contact is Empty.");
            googleFriendUI.mo63153K7(true);
        } else if (dVar == C40405d.ACCESS_DEDY) {
            googleFriendUI.mo63152J7();
            if (NetStatusUtil.isConnected((Context) googleFriendUI)) {
                Log.m105924i("MicroMsg.GoogleContact.GoogleFriendUI", "[handleGetGoogleContactListTaskReturn] start bindGoogleContactUI No Login or network unavaile.");
                Intent intent = new Intent(googleFriendUI, cls);
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                C117292a.m165358d(googleFriendUI, aVar.mo10232b(), "com/tencent/mm/plugin/account/bind/ui/GoogleFriendUI", "handleGetGoogleContactListTaskReturn", "(Lcom/tencent/mm/plugin/account/bind/ui/GoogleFriendUI$FetchContactStatus;Ljava/util/ArrayList;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                googleFriendUI.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(googleFriendUI, "com/tencent/mm/plugin/account/bind/ui/GoogleFriendUI", "handleGetGoogleContactListTaskReturn", "(Lcom/tencent/mm/plugin/account/bind/ui/GoogleFriendUI$FetchContactStatus;Ljava/util/ArrayList;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                googleFriendUI.finish();
                return;
            }
            googleFriendUI.mo63153K7(false);
        } else if (!googleFriendUI.f108585o) {
            Log.m105924i("MicroMsg.GoogleContact.GoogleFriendUI", "[handleGetGoogleContactListTaskReturn] start bindGoogleContactUI unknow error");
            googleFriendUI.mo63152J7();
            Intent intent2 = new Intent(googleFriendUI, cls);
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent2);
            C117292a.m165358d(googleFriendUI, aVar2.mo10232b(), "com/tencent/mm/plugin/account/bind/ui/GoogleFriendUI", "handleGetGoogleContactListTaskReturn", "(Lcom/tencent/mm/plugin/account/bind/ui/GoogleFriendUI$FetchContactStatus;Ljava/util/ArrayList;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            googleFriendUI.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(googleFriendUI, "com/tencent/mm/plugin/account/bind/ui/GoogleFriendUI", "handleGetGoogleContactListTaskReturn", "(Lcom/tencent/mm/plugin/account/bind/ui/GoogleFriendUI$FetchContactStatus;Ljava/util/ArrayList;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            googleFriendUI.finish();
        }
    }

    /* renamed from: I7 */
    public final void mo63151I7(C46065v vVar, C46065v vVar2) {
        Class cls = C76754b.class;
        ArrayList arrayList = new ArrayList();
        arrayList.add(vVar.field_googlegmail);
        C46060q0 q0Var = new C46060q0(arrayList);
        Log.m105919d("MicroMsg.GoogleContact.GoogleFriendUI", "gmailItem:%s", vVar.field_googleitemid);
        C86709a0.m107524d().mo123460f(q0Var);
        if (vVar2 == null) {
            q0Var.f124190g = vVar.field_googleitemid;
            vVar.field_googlecgistatus = 0;
            ((C46067w) ((C76754b) C86312j.m106911c(cls)).mo105746fv()).mo71483Yt(vVar);
        } else {
            q0Var.f124190g = vVar2.field_googleitemid;
            vVar2.field_googlecgistatus = 0;
            ((C46067w) ((C76754b) C86312j.m106911c(cls)).mo105746fv()).mo71483Yt(vVar2);
        }
        this.f108579f.mo1333o();
    }

    /* renamed from: J7 */
    public final void mo63152J7() {
        ProgressDialog progressDialog = this.f108586p;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f108586p.dismiss();
        }
    }

    /* renamed from: K7 */
    public final void mo63153K7(boolean z) {
        this.f108577d.setVisibility(0);
        this.f108577d.setText(!NetStatusUtil.isConnected((Context) this) ? getString(C0966R.string.fdl) : z ? getString(C0966R.string.fde) : getString(C0966R.string.fdd));
    }

    /* renamed from: L7 */
    public final void mo63154L7() {
        ProgressDialog progressDialog = this.f108586p;
        if (progressDialog == null || !progressDialog.isShowing()) {
            this.f108586p = C76879j.m92723Q(this, getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, new C40404c());
        }
    }

    /* renamed from: M7 */
    public final void mo63155M7() {
        Log.m105918d("MicroMsg.GoogleContact.GoogleFriendUI", "updateToken");
        if (this.f108581h) {
            this.f108583j = (String) C86709a0.m107535s().mo121142i().mo119684e(208901, (Object) null);
        } else {
            this.f108583j = (String) C86709a0.m107535s().mo121142i().mo119684e(208902, (Object) null);
            this.f108584n = (String) C86709a0.m107535s().mo121142i().mo119684e(208904, (Object) null);
        }
        if (TextUtils.isEmpty(this.f108583j) || (!this.f108581h && TextUtils.isEmpty(this.f108584n))) {
            startActivity(BindGoogleContactUI.class);
            finish();
        } else if (this.f108581h) {
            this.f108585o = false;
            mo63154L7();
            new C40406e(this, this.f108583j, (C40402a) null).execute(new Void[0]);
        } else {
            mo63154L7();
            new C40407f(this.f108584n).execute(new Void[0]);
        }
    }

    /* renamed from: X */
    public void mo1428X(String str) {
        C40408a aVar = this.f108579f;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aya;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.fdf);
        setBackBtn(new C40402a());
        this.f108577d = (TextView) findViewById(C0966R.C0970id.cig);
        ListView listView = (ListView) findViewById(C0966R.C0970id.eou);
        this.f108578e = listView;
        listView.setAdapter(this.f108579f);
        this.f108578e.setOnItemClickListener(this);
        C106742j1 j1Var = new C106742j1(true, true);
        j1Var.f319122j = new C40403b();
        addSearchMenu(true, j1Var);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105925i("MicroMsg.GoogleContact.GoogleFriendUI", "requestCode:%d, resultCode:%d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i != 2005) {
            return;
        }
        if (i2 == -1) {
            this.f108581h = intent.getBooleanExtra("gpservices", false);
            mo63155M7();
            return;
        }
        this.f108581h = intent.getBooleanExtra("gpservices", false);
        finish();
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(208903, (Object) null);
        this.f108582i = str;
        if (TextUtils.isEmpty(str)) {
            finish();
        }
        this.f108590t = getIntent().getIntExtra("enter_scene", 0);
        C40408a aVar = new C40408a(this, this.f108582i);
        this.f108579f = aVar;
        aVar.f108609q = this;
        initView();
        boolean b = C8524u.m8419b(this);
        this.f108581h = b;
        if (b) {
            Log.m105918d("MicroMsg.GoogleContact.GoogleFriendUI", "startActivityCheckGooglePlayServices");
            startActivityForResult(new Intent("com.tencent.mm.gms.CHECK_GP_SERVICES"), 2005);
        } else {
            mo63155M7();
        }
        C46067w wVar = (C46067w) ((C76754b) C86312j.m106911c(C76754b.class)).mo105746fv();
        wVar.f124209d.execSQL("GoogleFriend", " delete from GoogleFriend");
        MStorageEx mStorageEx = wVar.f124210e;
        mStorageEx.doNotify(5, mStorageEx, "");
    }

    public void onDestroy() {
        super.onDestroy();
        C46067w wVar = (C46067w) ((C76754b) C86312j.m106911c(C76754b.class)).mo105746fv();
        wVar.f124209d.execSQL("GoogleFriend", " delete from GoogleFriend");
        MStorageEx mStorageEx = wVar.f124210e;
        mStorageEx.doNotify(5, mStorageEx, "");
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Long.valueOf(j));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/account/bind/ui/GoogleFriendUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        Log.m105919d("MicroMsg.GoogleContact.GoogleFriendUI", "onItemClick position:%d,", Integer.valueOf(i));
        if (this.f108579f != null) {
            C46065v vVar = (C46065v) this.f108579f.getItem(i - this.f108578e.getHeaderViewsCount());
            if (vVar != null) {
                String str = vVar.field_username;
                Log.m105919d("MicroMsg.GoogleContact.GoogleFriendUI", "jumpToProfile email:%s, username:%s", vVar.field_googlegmail, str);
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(str);
                if ((z1Var == null || !z1Var.mo62927s3()) && TextUtils.isEmpty(vVar.field_nickname)) {
                    Intent intent = new Intent(this, InviteFriendUI.class);
                    intent.putExtra("friend_type", 2);
                    intent.putExtra("friend_user_name", str);
                    intent.putExtra("friend_num", vVar.field_googlegmail);
                    intent.putExtra("friend_nick", vVar.field_googlename);
                    intent.putExtra("friend_weixin_nick", vVar.field_nickname);
                    intent.putExtra("friend_googleID", vVar.field_googleid);
                    intent.putExtra("friend_googleItemID", vVar.field_googleitemid);
                    intent.putExtra("friend_scene", 58);
                    intent.putExtra("Contact_Scene", 58);
                    C9556a aVar = new C9556a();
                    aVar.mo10233c(intent);
                    C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/account/bind/ui/GoogleFriendUI", "jumpToProfile", "(Lcom/tencent/mm/plugin/account/friend/model/GoogleFriendInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/plugin/account/bind/ui/GoogleFriendUI", "jumpToProfile", "(Lcom/tencent/mm/plugin/account/friend/model/GoogleFriendInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    Intent intent2 = new Intent();
                    intent2.putExtra("Contact_User", str);
                    intent2.putExtra("Contact_Nick", vVar.field_nickname);
                    intent2.putExtra("Contact_ShowFMessageList", true);
                    intent2.putExtra("verify_gmail", vVar.field_googlegmail);
                    intent2.putExtra("profileName", vVar.field_googlename);
                    intent2.putExtra("Contact_Source_FMessage", 58);
                    intent2.putExtra("Contact_Scene", 58);
                    if (str != null && str.length() > 0) {
                        ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93174g(intent2, getContext());
                    }
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/account/bind/ui/GoogleFriendUI", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    public void onResume() {
        super.onResume();
        C86709a0.m107524d().mo123455a(C90029f.CTRL_INDEX, this);
        C86709a0.m107524d().mo123455a(489, this);
        ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).mo93556a(this);
        C40408a aVar = this.f108579f;
        if (aVar != null) {
            aVar.mo1333o();
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Class cls = C76754b.class;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.valueOf(i);
        objArr[1] = Integer.valueOf(i2);
        objArr[2] = TextUtils.isEmpty(str) ? "" : str;
        Log.m105925i("MicroMsg.GoogleContact.GoogleFriendUI", "[onSceneEnd] errType:%d,errCode:%d,errMsg:%s", objArr);
        int type = yVar.getType();
        if (i == 0 && i2 == 0) {
            if (type == 30 || type == 137) {
                if (this.f108579f != null) {
                    C28611c cVar = (C28611c) yVar;
                    cVar.mo56093b1();
                    String m0 = cVar.mo56094m0();
                    Log.m105919d("MicroMsg.GoogleContact.GoogleFriendUI", "gmailItem:%s", m0);
                    ((C46067w) ((C76754b) C86312j.m106911c(cls)).mo105746fv()).mo71482Ow(m0, 1);
                    this.f108579f.mo1333o();
                }
            } else if (type == 488) {
                C49032co2 co22 = (C49032co2) ((C46061r0) yVar).f124191d.f127056b.f127083a;
                synchronized (this) {
                    Log.m105925i("MicroMsg.GoogleContact.GoogleFriendUI", "handleListGoogleContactCGIResponse Count:%d", Integer.valueOf(co22.f131870d));
                    C40408a aVar = this.f108579f;
                    if (aVar != null) {
                        aVar.mo1333o();
                    }
                }
            } else if (type != 489) {
                Log.m105928w("MicroMsg.GoogleContact.GoogleFriendUI", "Unknow scene type.");
            } else if (this.f108579f != null) {
                C46060q0 q0Var = (C46060q0) yVar;
                Log.m105925i("MicroMsg.GoogleContact.GoogleFriendUI", "count:%d", Integer.valueOf(((C51552ui2) q0Var.f124187d.f127056b.f127083a).f142867d));
                String str2 = q0Var.f124190g;
                Log.m105919d("MicroMsg.GoogleContact.GoogleFriendUI", "gmailItem:%s", str2);
                ((C46067w) ((C76754b) C86312j.m106911c(cls)).mo105746fv()).mo71482Ow(str2, 1);
                this.f108579f.mo1333o();
            }
        } else if (type == 30 || type == 137) {
            if (i2 == -87) {
                C76879j.m92748s(this, getString(C0966R.string.bkh), "");
            } else if ((i2 == -24 || i2 == -101) && !Util.isNullOrNil(str)) {
                C76701a.makeText((Context) this, (CharSequence) str, 1).show();
            }
            if (this.f108579f != null) {
                C28611c cVar2 = (C28611c) yVar;
                cVar2.mo56093b1();
                String m05 = cVar2.mo56094m0();
                Log.m105919d("MicroMsg.GoogleContact.GoogleFriendUI", "gmailItem:%s", m05);
                ((C46067w) ((C76754b) C86312j.m106911c(cls)).mo105746fv()).mo71482Ow(m05, 2);
                this.f108579f.mo1333o();
            }
        } else if (type == 488) {
            mo63153K7(false);
        } else if (type != 489) {
            Log.m105928w("MicroMsg.GoogleContact.GoogleFriendUI", "Unknow scene type.");
        } else if (this.f108579f != null) {
            C46060q0 q0Var2 = (C46060q0) yVar;
            Log.m105925i("MicroMsg.GoogleContact.GoogleFriendUI", "count:%d", Integer.valueOf(((C51552ui2) q0Var2.f124187d.f127056b.f127083a).f142867d));
            String str3 = q0Var2.f124190g;
            Log.m105919d("MicroMsg.GoogleContact.GoogleFriendUI", "gmailItem:%s", str3);
            ((C46067w) ((C76754b) C86312j.m106911c(cls)).mo105746fv()).mo71482Ow(str3, 1);
            this.f108579f.mo1333o();
        }
        mo63152J7();
    }

    public void onStop() {
        super.onStop();
        C86709a0.m107524d().mo123470p(C90029f.CTRL_INDEX, this);
        C86709a0.m107524d().mo123470p(489, this);
        ((AvatarStorage) ((C76706g) C86312j.m106911c(C76706g.class)).mo106826RE()).f195667a.remove(this);
    }
}

package com.unionpay;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;
import ix3.C117289g;
import ix3.C46352e;
import java.io.ByteArrayInputStream;
import org.json.JSONObject;

public class UPPayWapActivity extends HellActivity {

    /* renamed from: o */
    public static final /* synthetic */ int f349470o = 0;

    /* renamed from: d */
    public WebView f349471d;

    /* renamed from: e */
    public C116516b f349472e;

    /* renamed from: f */
    public AlertDialog f349473f;

    /* renamed from: g */
    public boolean f349474g = false;

    /* renamed from: h */
    public String f349475h = "";

    /* renamed from: i */
    public String f349476i;

    /* renamed from: j */
    public View f349477j;

    /* renamed from: n */
    public C116517b0 f349478n;

    /* renamed from: F7 */
    public static /* synthetic */ void m164323F7(UPPayWapActivity uPPayWapActivity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(uPPayWapActivity);
        uPPayWapActivity.f349473f = builder.create();
        builder.setMessage(C117289g.m165354a().f351152a);
        builder.setTitle(C117289g.m165354a().f351155d);
        builder.setPositiveButton(C117289g.m165354a().f351153b, new C116527o(uPPayWapActivity));
        builder.setNegativeButton(C117289g.m165354a().f351154c, new C116528p(uPPayWapActivity));
        builder.create().show();
    }

    /* renamed from: H7 */
    public static String m164324H7(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject("{\"code\":\"0\",\"msg\":\"success\"}");
            if (str != null) {
                jSONObject.put("code", str);
            }
            if (str2 != null) {
                jSONObject.put("msg", str2);
            }
            if (str3 != null) {
                jSONObject.put("value", str3);
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: I7 */
    public static String m164325I7(String str, String str2, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject("{\"code\":\"0\",\"msg\":\"success\"}");
            if (str != null) {
                jSONObject2.put("code", str);
            }
            if (str2 != null) {
                jSONObject2.put("msg", str2);
            }
            if (jSONObject != null) {
                jSONObject2.put("value", jSONObject);
            }
            return jSONObject2.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: E7 */
    public final View mo180508E7(RelativeLayout relativeLayout, View.OnClickListener onClickListener) {
        ImageView imageView = new ImageView(this);
        BitmapDrawable bitmapDrawable = null;
        if (!TextUtils.isEmpty("iVBORw0KGgoAAAANSUhEUgAAAGAAAABgCAYAAADimHc4AAAAAXNSR0IArs4c6QAAA8JJREFUeF7tnD9uE0EUh980lmxRUEAJCLhADkABbSrgEDaWXKSg4QRQUKSIBLuXCBUtKThALoCQTQkFBbIlS86glbySieJodufP7/fIc5ViVm/m++bNTHbs58Q+UAIOGt2CiwkATwITYALABMDhLQNMAJgAOLxlgAkAEwCHtwwwAWAC4PCWASYATAAc3jLABIAJgMNbBvwPAsbj8WMReS8iT0Rk6Zz7PBwO3xwfH/8Gjy9J+KOjo9vL5fKdc+7Qez8Uka8i8rqu62+xAaIzoIHvnDv33t+61Jn5YDB4dnJy8j22k8jnZ7PZw/V6/UVEHuz2wzn3x3t/ECshhYBTEXm+B9JiMBg81SphC/9MRO7vGd+nuq5fxEyQFAJ+isidazqhUkIA/GbIv+q6vosWML9mhrR9UyUhEH4ztkVd1/8sTV1lRGfAZDL54L1/FRBYhYQO8MU597GqqmnA2Pc2iRawPSGcX96kNO4JXeCLyHw0Gh3EnvSiBTSgO3acMhNQY0giQLsEFPyGWzIBWiUg4ScXoE0CGn4WAVokMMDPJoBdAgv8rAJYJTDBzy6ATQIb/CICWCQwwi8mAC2BFX5RASgJzPCLCygtgR0+REApCRrgwwTklqAFPlRALgma4MMFpJagDT6FgFQSNMKnERArQSt8KgF9JTTPrdfr67460jRpP3S3cUkvZHZH2vfvrrN5G2ff93ao4dNlQEuro4QQ13Qzv+00XQZkkEALnzYDEkqghk8voMfGTL/mX14vaZeg3Y722BPoZz79HmACQs4WBdr0mP20Z/6rcFEvQRHw1UigFZAAvgoJlAISwqeXQCegI/yFvYpIuBF3hd/8/myz2biLi4sz7/29gK7QHU9pMqAP/PbHf9Pp9JFWCRQCYuC3s16rBLiAFPA1S4AKSAlfqwSYgBzwNUqACMgJX5uE4gJKwN+VsNlsmjoPtFeWRQWUhK9FQjEBCPgaJBQRgITPLiG7AAb4Pe+Yi7y2yCqACT6rhGwCGOEzSsgigBk+m4TkAjTAZ5KQVIAm+CwSkgnQCJ9BQhIBmuGjJUQLsJJlccVpowVY0T5w0b7JZLIIuBAv8l9lwKV8UJPQJdU596OqqpA3rXvjRmfAeDy2wq1BWq9ulELAjS1d7Jw7rarqZQT/+KJ9Vrw7roJ6dAY09m9C+frVavXWe38oIiOq8vUx6WfPJq4bakC7E0iyBHUPa0+0BEwAeC6YABMAJgAObxlgAsAEwOEtA0wAmAA4vGWACQATAIe3DDABYALg8JYBJgBMABz+L3oFF51bXkJGAAAAAElFTkSuQmCC")) {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode("iVBORw0KGgoAAAANSUhEUgAAAGAAAABgCAYAAADimHc4AAAAAXNSR0IArs4c6QAAA8JJREFUeF7tnD9uE0EUh980lmxRUEAJCLhADkABbSrgEDaWXKSg4QRQUKSIBLuXCBUtKThALoCQTQkFBbIlS86glbySieJodufP7/fIc5ViVm/m++bNTHbs58Q+UAIOGt2CiwkATwITYALABMDhLQNMAJgAOLxlgAkAEwCHtwwwAWAC4PCWASYATAAc3jLABIAJgMNbBvwPAsbj8WMReS8iT0Rk6Zz7PBwO3xwfH/8Gjy9J+KOjo9vL5fKdc+7Qez8Uka8i8rqu62+xAaIzoIHvnDv33t+61Jn5YDB4dnJy8j22k8jnZ7PZw/V6/UVEHuz2wzn3x3t/ECshhYBTEXm+B9JiMBg81SphC/9MRO7vGd+nuq5fxEyQFAJ+isidazqhUkIA/GbIv+q6vosWML9mhrR9UyUhEH4ztkVd1/8sTV1lRGfAZDL54L1/FRBYhYQO8MU597GqqmnA2Pc2iRawPSGcX96kNO4JXeCLyHw0Gh3EnvSiBTSgO3acMhNQY0giQLsEFPyGWzIBWiUg4ScXoE0CGn4WAVokMMDPJoBdAgv8rAJYJTDBzy6ATQIb/CICWCQwwi8mAC2BFX5RASgJzPCLCygtgR0+REApCRrgwwTklqAFPlRALgma4MMFpJagDT6FgFQSNMKnERArQSt8KgF9JTTPrdfr67460jRpP3S3cUkvZHZH2vfvrrN5G2ff93ao4dNlQEuro4QQ13Qzv+00XQZkkEALnzYDEkqghk8voMfGTL/mX14vaZeg3Y722BPoZz79HmACQs4WBdr0mP20Z/6rcFEvQRHw1UigFZAAvgoJlAISwqeXQCegI/yFvYpIuBF3hd/8/myz2biLi4sz7/29gK7QHU9pMqAP/PbHf9Pp9JFWCRQCYuC3s16rBLiAFPA1S4AKSAlfqwSYgBzwNUqACMgJX5uE4gJKwN+VsNlsmjoPtFeWRQWUhK9FQjEBCPgaJBQRgITPLiG7AAb4Pe+Yi7y2yCqACT6rhGwCGOEzSsgigBk+m4TkAjTAZ5KQVIAm+CwSkgnQCJ9BQhIBmuGjJUQLsJJlccVpowVY0T5w0b7JZLIIuBAv8l9lwKV8UJPQJdU596OqqpA3rXvjRmfAeDy2wq1BWq9ulELAjS1d7Jw7rarqZQT/+KJ9Vrw7roJ6dAY09m9C+frVavXWe38oIiOq8vUx6WfPJq4bakC7E0iyBHUPa0+0BEwAeC6YABMAJgAObxlgAsAEwOEtA0wAmAA4vGWACQATAIe3DDABYALg8JYBJgBMABz+L3oFF51bXkJGAAAAAElFTkSuQmCC", 2));
                BitmapDrawable bitmapDrawable2 = new BitmapDrawable(BitmapFactory.decodeStream(byteArrayInputStream));
                byteArrayInputStream.close();
                bitmapDrawable = bitmapDrawable2;
            } catch (Exception unused) {
            }
        }
        imageView.setBackgroundDrawable(bitmapDrawable);
        int a = C46352e.m51675a(this, 24.0f);
        int a2 = C46352e.m51675a(this, 18.0f);
        int a3 = C46352e.m51675a(this, 14.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a, a);
        layoutParams.addRule(9, -1);
        layoutParams.addRule(10, -1);
        layoutParams.setMargins(a2, a3, 0, 0);
        relativeLayout.addView(imageView, layoutParams);
        if (onClickListener == null) {
            imageView.setOnClickListener(new C116525m(this));
        } else {
            imageView.setOnClickListener(onClickListener);
        }
        return imageView;
    }

    /* renamed from: G7 */
    public final void mo180509G7(String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("pay_result", str);
        intent.putExtra("result_data", str2);
        setResult(-1, intent);
        finish();
    }

    public void finish() {
        try {
            super.finish();
        } catch (Exception unused) {
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String str = "";
                    String string = extras.containsKey("pay_result") ? extras.getString("pay_result") : extras.containsKey("code") ? extras.getString("code") : str;
                    if (TextUtils.isEmpty(string)) {
                        string = str;
                    }
                    String string2 = extras.containsKey("data") ? extras.getString("data") : str;
                    if (!TextUtils.isEmpty(string2)) {
                        str = string2;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", string);
                    jSONObject.put("data", str);
                    C116517b0 b0Var = this.f349478n;
                    if (b0Var != null) {
                        b0Var.mo180515a(m164325I7("0", (String) null, jSONObject));
                    }
                } else {
                    C116517b0 b0Var2 = this.f349478n;
                    if (b0Var2 != null) {
                        b0Var2.mo180515a(m164324H7("1", "No pay result", (String) null));
                    }
                }
            } catch (Exception unused) {
                C116517b0 b0Var3 = this.f349478n;
                if (b0Var3 != null) {
                    b0Var3.mo180515a(m164324H7("1", "No pay result", (String) null));
                }
            }
            this.f349478n = null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:46|47|51) */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:16|17|18|19|20|21|22|23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x00d0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x01f7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            java.lang.String r0 = "actionType"
            java.lang.String r1 = "link"
            super.onCreate(r10)
            android.view.Window r10 = r9.getWindow()
            r2 = 8192(0x2000, float:1.14794E-41)
            r10.addFlags(r2)
            android.content.Intent r10 = r9.getIntent()     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r2 = "magic_data"
            java.lang.String r10 = r10.getStringExtra(r2)     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r2 = "949A1CC"
            boolean r10 = r2.equalsIgnoreCase(r10)     // Catch:{ Exception -> 0x01f7 }
            if (r10 != 0) goto L_0x0025
            r9.finish()     // Catch:{ Exception -> 0x01f7 }
        L_0x0025:
            android.content.Intent r10 = r9.getIntent()     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r10 = r10.getStringExtra(r0)     // Catch:{ Exception -> 0x01f7 }
            boolean r10 = r1.equals(r10)     // Catch:{ Exception -> 0x01f7 }
            r9.f349474g = r10     // Catch:{ Exception -> 0x01f7 }
            android.content.Intent r10 = r9.getIntent()     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r2 = "ex_mode"
            java.lang.String r10 = r10.getStringExtra(r2)     // Catch:{ Exception -> 0x01f7 }
            r9.f349475h = r10     // Catch:{ Exception -> 0x01f7 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Exception -> 0x01f7 }
            if (r10 == 0) goto L_0x0049
            java.lang.String r10 = "00"
            r9.f349475h = r10     // Catch:{ Exception -> 0x01f7 }
        L_0x0049:
            java.lang.String r10 = ""
            android.view.Window r2 = r9.getWindow()     // Catch:{ Exception -> 0x01f7 }
            r3 = 1
            r2.requestFeature(r3)     // Catch:{ Exception -> 0x01f7 }
            android.widget.RelativeLayout r2 = new android.widget.RelativeLayout     // Catch:{ Exception -> 0x01f7 }
            r2.<init>(r9)     // Catch:{ Exception -> 0x01f7 }
            android.widget.LinearLayout r4 = new android.widget.LinearLayout     // Catch:{ Exception -> 0x01f7 }
            r4.<init>(r9)     // Catch:{ Exception -> 0x01f7 }
            r4.setOrientation(r3)     // Catch:{ Exception -> 0x01f7 }
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ Exception -> 0x01f7 }
            r5 = -1
            r3.<init>(r5, r5)     // Catch:{ Exception -> 0x01f7 }
            r2.addView(r4, r3)     // Catch:{ Exception -> 0x01f7 }
            r9.setContentView(r2)     // Catch:{ Exception -> 0x01f7 }
            android.webkit.WebView r3 = new android.webkit.WebView     // Catch:{ Exception -> 0x01f7 }
            r3.<init>(r9)     // Catch:{ Exception -> 0x01f7 }
            r9.f349471d = r3     // Catch:{ Exception -> 0x01f7 }
            android.content.Intent r3 = r9.getIntent()     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r0 = r3.getStringExtra(r0)     // Catch:{ Exception -> 0x01f7 }
            r9.f349476i = r0     // Catch:{ Exception -> 0x01f7 }
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x01f7 }
            r1 = 0
            java.lang.String r3 = "wapurl"
            if (r0 == 0) goto L_0x0090
            android.content.Intent r10 = r9.getIntent()     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r10 = r10.getStringExtra(r3)     // Catch:{ Exception -> 0x01f7 }
            goto L_0x014d
        L_0x0090:
            java.lang.String r0 = "wcd"
            java.lang.String r6 = r9.f349476i     // Catch:{ Exception -> 0x01f7 }
            boolean r0 = r0.equals(r6)     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r6 = "?s="
            if (r0 == 0) goto L_0x00eb
            android.view.View r0 = r9.mo180508E7(r2, r1)     // Catch:{ Exception -> 0x01f7 }
            r9.f349477j = r0     // Catch:{ Exception -> 0x01f7 }
            android.content.Intent r0 = r9.getIntent()     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r0 = r0.getStringExtra(r3)     // Catch:{ Exception -> 0x01f7 }
            android.content.Intent r2 = r9.getIntent()     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r3 = "pay_tn"
            java.lang.String r2 = r2.getStringExtra(r3)     // Catch:{ Exception -> 0x01f7 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x014d }
            r3.<init>()     // Catch:{ Exception -> 0x014d }
            java.lang.String r7 = "os"
            java.lang.String r8 = "android"
            r3.put(r7, r8)     // Catch:{ Exception -> 0x014d }
            java.lang.String r7 = "tn"
            r3.put(r7, r2)     // Catch:{ Exception -> 0x014d }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x014d }
            r3 = 0
            java.lang.String r7 = r9.f349475h     // Catch:{ Exception -> 0x00d0 }
            int r3 = java.lang.Integer.parseInt(r7)     // Catch:{ Exception -> 0x00d0 }
        L_0x00d0:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014d }
            r7.<init>()     // Catch:{ Exception -> 0x014d }
            r7.append(r0)     // Catch:{ Exception -> 0x014d }
            r7.append(r6)     // Catch:{ Exception -> 0x014d }
            java.lang.String r0 = ix3.C76375b.m91805g(r2)     // Catch:{ Exception -> 0x014d }
            java.lang.String r0 = com.unionpay.utils.UPUtils.forWap(r3, r0)     // Catch:{ Exception -> 0x014d }
            r7.append(r0)     // Catch:{ Exception -> 0x014d }
            java.lang.String r10 = r7.toString()     // Catch:{ Exception -> 0x014d }
            goto L_0x014d
        L_0x00eb:
            android.content.Intent r0 = r9.getIntent()     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r7 = "waptype"
            java.lang.String r0 = r0.getStringExtra(r7)     // Catch:{ Exception -> 0x01f7 }
            if (r0 == 0) goto L_0x0119
            java.lang.String r7 = "new_page"
            boolean r0 = r0.equals(r7)     // Catch:{ Exception -> 0x01f7 }
            if (r0 == 0) goto L_0x0119
            android.content.Intent r0 = r9.getIntent()     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r0 = r0.getStringExtra(r3)     // Catch:{ Exception -> 0x01f7 }
            android.content.Intent r3 = r9.getIntent()     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r6 = "waptitle"
            r3.getStringExtra(r6)     // Catch:{ Exception -> 0x01f7 }
            if (r0 == 0) goto L_0x0113
            r10 = r0
        L_0x0113:
            com.unionpay.f r0 = new com.unionpay.f     // Catch:{ Exception -> 0x01f7 }
            r0.<init>(r9)     // Catch:{ Exception -> 0x01f7 }
            goto L_0x0147
        L_0x0119:
            android.content.Intent r0 = r9.getIntent()     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r0 = r0.getStringExtra(r3)     // Catch:{ Exception -> 0x01f7 }
            android.content.Intent r3 = r9.getIntent()     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r7 = "paydata"
            java.lang.String r3 = r3.getStringExtra(r7)     // Catch:{ Exception -> 0x01f7 }
            if (r3 == 0) goto L_0x013f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f7 }
            r10.<init>()     // Catch:{ Exception -> 0x01f7 }
            r10.append(r0)     // Catch:{ Exception -> 0x01f7 }
            r10.append(r6)     // Catch:{ Exception -> 0x01f7 }
            r10.append(r3)     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x01f7 }
        L_0x013f:
            ix3.C117289g.m165354a()     // Catch:{ Exception -> 0x01f7 }
            com.unionpay.n r0 = new com.unionpay.n     // Catch:{ Exception -> 0x01f7 }
            r0.<init>(r9)     // Catch:{ Exception -> 0x01f7 }
        L_0x0147:
            android.view.View r0 = r9.mo180508E7(r2, r0)     // Catch:{ Exception -> 0x01f7 }
            r9.f349477j = r0     // Catch:{ Exception -> 0x01f7 }
        L_0x014d:
            android.webkit.WebView r0 = r9.f349471d     // Catch:{ Exception -> 0x01f7 }
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ Exception -> 0x01f7 }
            r2.<init>(r5, r5)     // Catch:{ Exception -> 0x01f7 }
            r0.setLayoutParams(r2)     // Catch:{ Exception -> 0x01f7 }
            android.webkit.WebView r0 = r9.f349471d     // Catch:{ Exception -> 0x01f7 }
            r4.addView(r0)     // Catch:{ Exception -> 0x01f7 }
            com.unionpay.b r0 = new com.unionpay.b     // Catch:{ Exception -> 0x01f7 }
            android.webkit.WebView r2 = r9.f349471d     // Catch:{ Exception -> 0x01f7 }
            r0.<init>(r9, r2, r1)     // Catch:{ Exception -> 0x01f7 }
            r9.f349472e = r0     // Catch:{ Exception -> 0x01f7 }
            boolean r1 = r9.f349474g     // Catch:{ Exception -> 0x01f7 }
            r0.f349484i = r1     // Catch:{ Exception -> 0x01f7 }
            android.webkit.WebView r0 = r9.f349471d     // Catch:{ Exception -> 0x01f7 }
            if (r0 == 0) goto L_0x0170
            r0.loadUrl(r10)     // Catch:{ Exception -> 0x01f7 }
        L_0x0170:
            com.unionpay.b r10 = r9.f349472e     // Catch:{ Exception -> 0x01f7 }
            if (r10 == 0) goto L_0x01f6
            java.lang.String r0 = "getDeviceInfo"
            com.unionpay.q r1 = new com.unionpay.q     // Catch:{ Exception -> 0x01f7 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x01f7 }
            r10.mo180514a(r0, r1)     // Catch:{ Exception -> 0x01f7 }
            com.unionpay.b r10 = r9.f349472e     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r0 = "saveData"
            com.unionpay.r r1 = new com.unionpay.r     // Catch:{ Exception -> 0x01f7 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x01f7 }
            r10.mo180514a(r0, r1)     // Catch:{ Exception -> 0x01f7 }
            com.unionpay.b r10 = r9.f349472e     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r0 = "getData"
            com.unionpay.s r1 = new com.unionpay.s     // Catch:{ Exception -> 0x01f7 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x01f7 }
            r10.mo180514a(r0, r1)     // Catch:{ Exception -> 0x01f7 }
            com.unionpay.b r10 = r9.f349472e     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r0 = "removeData"
            com.unionpay.t r1 = new com.unionpay.t     // Catch:{ Exception -> 0x01f7 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x01f7 }
            r10.mo180514a(r0, r1)     // Catch:{ Exception -> 0x01f7 }
            com.unionpay.b r10 = r9.f349472e     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r0 = "setPageBackEnable"
            com.unionpay.u r1 = new com.unionpay.u     // Catch:{ Exception -> 0x01f7 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x01f7 }
            r10.mo180514a(r0, r1)     // Catch:{ Exception -> 0x01f7 }
            com.unionpay.b r10 = r9.f349472e     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r0 = "payBySDK"
            com.unionpay.g r1 = new com.unionpay.g     // Catch:{ Exception -> 0x01f7 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x01f7 }
            r10.mo180514a(r0, r1)     // Catch:{ Exception -> 0x01f7 }
            com.unionpay.b r10 = r9.f349472e     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r0 = "payResult"
            com.unionpay.h r1 = new com.unionpay.h     // Catch:{ Exception -> 0x01f7 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x01f7 }
            r10.mo180514a(r0, r1)     // Catch:{ Exception -> 0x01f7 }
            com.unionpay.b r10 = r9.f349472e     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r0 = "closePage"
            com.unionpay.i r1 = new com.unionpay.i     // Catch:{ Exception -> 0x01f7 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x01f7 }
            r10.mo180514a(r0, r1)     // Catch:{ Exception -> 0x01f7 }
            com.unionpay.b r10 = r9.f349472e     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r0 = "openNewPage"
            com.unionpay.j r1 = new com.unionpay.j     // Catch:{ Exception -> 0x01f7 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x01f7 }
            r10.mo180514a(r0, r1)     // Catch:{ Exception -> 0x01f7 }
            com.unionpay.b r10 = r9.f349472e     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r0 = "checkBankSchemes"
            com.unionpay.k r1 = new com.unionpay.k     // Catch:{ Exception -> 0x01f7 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x01f7 }
            r10.mo180514a(r0, r1)     // Catch:{ Exception -> 0x01f7 }
            com.unionpay.b r10 = r9.f349472e     // Catch:{ Exception -> 0x01f7 }
            java.lang.String r0 = "openBankApp"
            com.unionpay.l r1 = new com.unionpay.l     // Catch:{ Exception -> 0x01f7 }
            r1.<init>(r9)     // Catch:{ Exception -> 0x01f7 }
            r10.mo180514a(r0, r1)     // Catch:{ Exception -> 0x01f7 }
        L_0x01f6:
            return
        L_0x01f7:
            r9.finish()     // Catch:{ Exception -> 0x01fa }
        L_0x01fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.UPPayWapActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f349474g) {
            WebView webView = this.f349471d;
            if (webView == null || !webView.canGoBack()) {
                mo180509G7("cancel", (String) null);
            } else {
                this.f349471d.goBack();
                return true;
            }
        } else {
            onPause();
        }
        return true;
    }
}

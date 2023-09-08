package com.tencent.p014mm.plugin.appbrand.p026ui.record;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.pluginsdk.p133ui.C96814a;
import com.tencent.p014mm.pluginsdk.p133ui.CommonVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.wcdb.FileUtils;
import di3.C86312j;
import eb0.C75592q0;
import fs0.C97957a;
import fs0.C97961b;
import fs0.C97969c;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kotlin.Metadata;
import p385u2.C111105a;
import rx3.C13598b0;
import sw1.C48478n;
import w10.C53065b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "ShareResult", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI */
public class WAGameRecordShareUI extends MMActivity {

    /* renamed from: p */
    public static final /* synthetic */ int f267608p = 0;

    /* renamed from: d */
    public CommonVideoView f267609d;

    /* renamed from: e */
    public final ArrayList<C48478n.C13793h> f267610e = new ArrayList<>();

    /* renamed from: f */
    public C48478n.C13793h f267611f = new C48478n.C13793h();

    /* renamed from: g */
    public String f267612g;

    /* renamed from: h */
    public ArrayList<Integer> f267613h;

    /* renamed from: i */
    public Button f267614i;

    /* renamed from: j */
    public Button f267615j;

    /* renamed from: n */
    public TextView f267616n;

    /* renamed from: o */
    public final HashMap<Integer, ShareResult> f267617o = new HashMap<>(4);

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"Lcom/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareUI$ShareResult;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    /* renamed from: com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI$ShareResult */
    public static final class ShareResult implements Parcelable {
        public static final Parcelable.Creator<ShareResult> CREATOR = new C84671a();

        /* renamed from: d */
        public final int f247024d;

        /* renamed from: e */
        public final String f247025e;

        /* renamed from: com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI$ShareResult$a */
        public static final class C84671a implements Parcelable.Creator<ShareResult> {
            public Object createFromParcel(Parcel parcel) {
                C87412m.m108594g(parcel, "parcel");
                return new ShareResult(parcel.readInt(), parcel.readString());
            }

            public Object[] newArray(int i) {
                return new ShareResult[i];
            }
        }

        public ShareResult(int i, String str) {
            C87412m.m108594g(str, "errMsg");
            this.f247024d = i;
            this.f247025e = str;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C87412m.m108594g(parcel, "out");
            parcel.writeInt(this.f247024d);
            parcel.writeString(this.f247025e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI$a */
    public static final class C92912a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ WAGameRecordShareUI f267618d;

        public C92912a(WAGameRecordShareUI wAGameRecordShareUI) {
            this.f267618d = wAGameRecordShareUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f267618d.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public static final void m117228H7(WAGameRecordShareUI wAGameRecordShareUI, String str) {
        wAGameRecordShareUI.getClass();
        Log.m105924i("MicroMsg.WAGameRecordShareUI", "hy: jump to " + str);
        Intent intent = new Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("geta8key_username", C75592q0.m90789s());
        C88144b.m109791i(wAGameRecordShareUI, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: I7 */
    public static final void m117229I7(WAGameRecordShareUI wAGameRecordShareUI, int i, int i2, String str) {
        C13598b0 b0Var;
        ShareResult shareResult = wAGameRecordShareUI.f267617o.get(Integer.valueOf(i));
        if (shareResult != null) {
            if (shareResult.f247024d != 0) {
                Log.m105924i("MicroMsg.WAGameRecordShareUI", "hy: share option " + i + " update with " + i2 + ", " + str);
                wAGameRecordShareUI.f267617o.put(Integer.valueOf(i), new ShareResult(i2, str));
            } else {
                Log.m105924i("MicroMsg.WAGameRecordShareUI", "hy: share option " + i + " will not update result due to former success");
            }
            b0Var = C13598b0.f38549a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            Log.m105924i("MicroMsg.WAGameRecordShareUI", "hy: share option " + i + " init with " + i2 + ", " + str);
            wAGameRecordShareUI.f267617o.put(Integer.valueOf(i), new ShareResult(i2, str));
        }
    }

    /* renamed from: N7 */
    public static /* synthetic */ void m117230N7(WAGameRecordShareUI wAGameRecordShareUI, long j, long j2, int i, int i2, String str, int i3, Object obj) {
        if (obj == null) {
            wAGameRecordShareUI.mo127312M7(j, j2, i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? null : str);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report");
    }

    /* renamed from: J7 */
    public int mo117383J7(int i) {
        float f;
        int i2;
        if (i == C0966R.C0971layout.d0w) {
            f = getResources().getDisplayMetrics().density;
            i2 = FileUtils.S_IRWXU;
        } else if (i != C0966R.C0971layout.d3k) {
            return 0;
        } else {
            f = getResources().getDisplayMetrics().density;
            i2 = 371;
        }
        return (int) (f * ((float) i2));
    }

    /* renamed from: K7 */
    public double mo117384K7() {
        return 0.74d;
    }

    /* renamed from: L7 */
    public void mo127311L7(View view, View view2) {
        C87412m.m108594g(view, "reLayoutButton");
        C87412m.m108594g(view2, "hideButton");
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        View view3 = view2;
        C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareUI", "reLayoutAndHideButton", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/appbrand/ui/record/WAGameRecordShareUI", "reLayoutAndHideButton", "(Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(view.getLayoutParams());
        layoutParams.width = getResources().getDimensionPixelSize(C0966R.dimen.f3730cj);
        layoutParams.setMarginStart(0);
        layoutParams.setMarginEnd(0);
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: M7 */
    public final void mo127312M7(long j, long j2, int i, int i2, String str) {
        C48478n.C13793h hVar = this.f267610e.get(0);
        C87412m.m108593f(hVar, "videoFileList[0]");
        C48478n.C13793h hVar2 = hVar;
        this.f267611f = hVar2;
        ((C48478n) C86312j.m106911c(C48478n.class)).Zs0(new C53065b(hVar2.f38917a, j, j2, i, i2, 0, hVar2.f38923g, hVar2.f38924h, str));
    }

    public void finish() {
        Intent intent = new Intent();
        intent.putExtra("k_ext_data", this.f267617o);
        setResult(-1, intent);
        super.finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a8z;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setNavigationbarColor(C111105a.m151500b(this, C0966R.color.f3278lx));
        setActionbarColor(C111105a.m151500b(this, C0966R.color.f3278lx));
        setMMTitle("");
        setBackGroundColorResource(C0966R.color.f3278lx);
        String valueOf = String.valueOf(getIntent().getStringExtra("k_ext_absFilePath"));
        this.f267612g = valueOf;
        C48478n.C13793h hVar = this.f267611f;
        hVar.f38919c = valueOf;
        hVar.f38917a = String.valueOf(getIntent().getStringExtra("k_ext_appid"));
        hVar.f38918b = String.valueOf(getIntent().getStringExtra("k_ext_appName"));
        hVar.f38920d = String.valueOf(getIntent().getStringExtra("k_ext_configJson"));
        hVar.f38921e = String.valueOf(getIntent().getStringExtra("k_ext_share_title"));
        hVar.f38922f = String.valueOf(getIntent().getStringExtra("k_ext_share_desc"));
        hVar.f38923g = getIntent().getIntExtra("k_ext_app_version", 0);
        hVar.f38924h = getIntent().getIntExtra("k_ext_app_version_type", 0);
        hVar.f38925i = getIntent().getIntExtra("k_ext_is_dev_edited", 0);
        this.f267610e.add(this.f267611f);
        ArrayList<Integer> integerArrayListExtra = getIntent().getIntegerArrayListExtra("k_ext_share_options");
        C87412m.m108592e(integerArrayListExtra, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Int>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.Int> }");
        this.f267613h = integerArrayListExtra;
        setBackBtn(new C92912a(this));
        View findViewById = findViewById(C0966R.C0970id.f357749bm2);
        CommonVideoView commonVideoView = (CommonVideoView) findViewById;
        commonVideoView.setIMMVideoViewCallback(new C97969c(commonVideoView));
        String str = this.f267612g;
        if (str != null) {
            if (!Util.isNullOrNil(str)) {
                commonVideoView.stop();
                String str2 = this.f267612g;
                if (str2 != null) {
                    commonVideoView.mo76636h(false, str2, 0);
                } else {
                    C87412m.m108603p("absVideoPath");
                    throw null;
                }
            }
            commonVideoView.setIsShowBasicControls(true);
            commonVideoView.setScaleType(C96814a.C96817e.COVER);
            commonVideoView.getLayoutParams().height = (int) (((double) commonVideoView.getResources().getDisplayMetrics().heightPixels) * mo117384K7());
            C87412m.m108593f(findViewById, "findViewById<CommonVideo…reen()).toInt()\n        }");
            this.f267609d = (CommonVideoView) findViewById;
            View findViewById2 = findViewById(C0966R.C0970id.bdg);
            C87412m.m108593f(findViewById2, "findViewById(R.id.stash_button)");
            this.f267614i = (Button) findViewById2;
            View findViewById3 = findViewById(C0966R.C0970id.f359185a43);
            C87412m.m108593f(findViewById3, "findViewById(R.id.share_button)");
            this.f267615j = (Button) findViewById3;
            View findViewById4 = findViewById(C0966R.C0970id.a44);
            C87412m.m108593f(findViewById4, "findViewById(R.id.share_text)");
            this.f267616n = (TextView) findViewById4;
            ArrayList<Integer> arrayList = this.f267613h;
            if (arrayList != null) {
                if (arrayList.contains(3)) {
                    Button button = this.f267614i;
                    if (button != null) {
                        button.setOnClickListener(new C97957a(this));
                    } else {
                        C87412m.m108603p("stashButton");
                        throw null;
                    }
                } else {
                    Button button2 = this.f267615j;
                    if (button2 != null) {
                        Button button3 = this.f267614i;
                        if (button3 != null) {
                            mo127311L7(button2, button3);
                        } else {
                            C87412m.m108603p("stashButton");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("shareButton");
                        throw null;
                    }
                }
                ArrayList<Integer> arrayList2 = this.f267613h;
                if (arrayList2 != null) {
                    if (!arrayList2.contains(0)) {
                        ArrayList<Integer> arrayList3 = this.f267613h;
                        if (arrayList3 == null) {
                            C87412m.m108603p("shareOptionsInParam");
                            throw null;
                        } else if (!arrayList3.contains(1)) {
                            ArrayList<Integer> arrayList4 = this.f267613h;
                            if (arrayList4 == null) {
                                C87412m.m108603p("shareOptionsInParam");
                                throw null;
                            } else if (!arrayList4.contains(2)) {
                                Button button4 = this.f267614i;
                                if (button4 != null) {
                                    Button button5 = this.f267615j;
                                    if (button5 != null) {
                                        mo127311L7(button4, button5);
                                        mo127312M7(601, 0, 1, 1, "{\"isEdit\": " + this.f267611f.f38925i + '}');
                                        return;
                                    }
                                    C87412m.m108603p("shareButton");
                                    throw null;
                                }
                                C87412m.m108603p("stashButton");
                                throw null;
                            }
                        }
                    }
                    Button button6 = this.f267615j;
                    if (button6 != null) {
                        button6.setOnClickListener(new C97961b(this));
                        mo127312M7(601, 0, 1, 1, "{\"isEdit\": " + this.f267611f.f38925i + '}');
                        return;
                    }
                    C87412m.m108603p("shareButton");
                    throw null;
                }
                C87412m.m108603p("shareOptionsInParam");
                throw null;
            }
            C87412m.m108603p("shareOptionsInParam");
            throw null;
        }
        C87412m.m108603p("absVideoPath");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f267610e.clear();
    }

    public void onPause() {
        super.onPause();
        CommonVideoView commonVideoView = this.f267609d;
        if (commonVideoView == null) {
            C87412m.m108603p("playView");
            throw null;
        } else if (commonVideoView.isPlaying()) {
            CommonVideoView commonVideoView2 = this.f267609d;
            if (commonVideoView2 != null) {
                commonVideoView2.pause();
            } else {
                C87412m.m108603p("playView");
                throw null;
            }
        }
    }

    public void onResume() {
        super.onResume();
        CommonVideoView commonVideoView = this.f267609d;
        if (commonVideoView == null) {
            C87412m.m108603p("playView");
            throw null;
        } else if (!commonVideoView.isPlaying()) {
            CommonVideoView commonVideoView2 = this.f267609d;
            if (commonVideoView2 != null) {
                commonVideoView2.start();
            } else {
                C87412m.m108603p("playView");
                throw null;
            }
        }
    }
}

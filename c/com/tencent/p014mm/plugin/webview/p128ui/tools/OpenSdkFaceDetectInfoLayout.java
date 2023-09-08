package com.tencent.p014mm.plugin.webview.p128ui.tools;

import android.content.Context;
import android.os.Bundle;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.RequestStartFaceDetectEvent;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import eb0.C75592q0;
import gy3.C87412m;
import kotlin.Metadata;
import z04.C112551y;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u00109\u001a\u000208\u0012\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=B#\b\u0016\u0012\u0006\u00109\u001a\u000208\u0012\b\u0010;\u001a\u0004\u0018\u00010:\u0012\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b<\u0010@R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\n8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0017\u00103\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0011\u00107\u001a\u0002048F¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006A"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/OpenSdkFaceDetectInfoLayout;", "Landroid/widget/LinearLayout;", "Landroid/view/View;", "d", "Landroid/view/View;", "getRootContentView", "()Landroid/view/View;", "setRootContentView", "(Landroid/view/View;)V", "rootContentView", "Landroid/widget/EditText;", "e", "Landroid/widget/EditText;", "getNameEt", "()Landroid/widget/EditText;", "setNameEt", "(Landroid/widget/EditText;)V", "nameEt", "f", "getIdCardEt", "setIdCardEt", "idCardEt", "Landroid/widget/Button;", "g", "Landroid/widget/Button;", "getNextBt", "()Landroid/widget/Button;", "setNextBt", "(Landroid/widget/Button;)V", "nextBt", "Landroid/widget/CheckBox;", "h", "Landroid/widget/CheckBox;", "getProtocolCheckBox", "()Landroid/widget/CheckBox;", "setProtocolCheckBox", "(Landroid/widget/CheckBox;)V", "protocolCheckBox", "", "i", "Ljava/lang/String;", "getFaceAppId", "()Ljava/lang/String;", "setFaceAppId", "(Ljava/lang/String;)V", "faceAppId", "Landroid/text/TextWatcher;", "j", "Landroid/text/TextWatcher;", "getMTextWatcher", "()Landroid/text/TextWatcher;", "mTextWatcher", "Lcom/tencent/mm/ui/MMActivity;", "getActivityContext", "()Lcom/tencent/mm/ui/MMActivity;", "activityContext", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.OpenSdkFaceDetectInfoLayout */
public final class OpenSdkFaceDetectInfoLayout extends LinearLayout {

    /* renamed from: n */
    public static final /* synthetic */ int f211208n = 0;

    /* renamed from: d */
    public View f211209d;

    /* renamed from: e */
    public EditText f211210e;

    /* renamed from: f */
    public EditText f211211f;

    /* renamed from: g */
    public Button f211212g;

    /* renamed from: h */
    public CheckBox f211213h;

    /* renamed from: i */
    public String f211214i = "";

    /* renamed from: j */
    public final TextWatcher f211215j = new C72626r(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenSdkFaceDetectInfoLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.d1g, this);
        C87412m.m108593f(inflate, "getInflater(context).inf…t_user_info_layout, this)");
        setRootContentView(inflate);
    }

    /* renamed from: a */
    public static final boolean m84959a(OpenSdkFaceDetectInfoLayout openSdkFaceDetectInfoLayout) {
        openSdkFaceDetectInfoLayout.getActivityContext().hideVKB();
        String obj = openSdkFaceDetectInfoLayout.getNameEt().getText().toString();
        String obj2 = openSdkFaceDetectInfoLayout.getIdCardEt().getText().toString();
        if (Util.isNullOrNil(obj) || Util.isNullOrNil(obj2)) {
            Log.m105925i("MicroMsg.OpenSdkFaceDetectInfoLayout", "faceVerify name=%s, idNumber=%s", obj, obj2);
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString("k_user_name", C75592q0.m90772b());
        bundle.putInt(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2);
        bundle.putString("request_verify_pre_info", "{\"name\": \"" + obj + "\", \"id_card_number\": \"" + obj2 + "\"}");
        bundle.putString("appId", openSdkFaceDetectInfoLayout.f211214i);
        RequestStartFaceDetectEvent requestStartFaceDetectEvent = new RequestStartFaceDetectEvent();
        requestStartFaceDetectEvent.f9451d.f9453a = openSdkFaceDetectInfoLayout.getActivityContext();
        RequestStartFaceDetectEvent.C1121a aVar = requestStartFaceDetectEvent.f9451d;
        aVar.f9455c = 9;
        aVar.f9454b = bundle;
        requestStartFaceDetectEvent.publish();
        Log.m105925i("MicroMsg.OpenSdkFaceDetectInfoLayout", "start face detect event result: %b", Boolean.valueOf(requestStartFaceDetectEvent.f9452e.f9456a));
        return true;
    }

    /* renamed from: b */
    public final void mo100002b() {
        Button nextBt = getNextBt();
        String obj = getNameEt().getText().toString();
        boolean z = false;
        if (!(obj == null || C112551y.m153811k(obj))) {
            String obj2 = getIdCardEt().getText().toString();
            if (!(obj2 == null || C112551y.m153811k(obj2)) && ((getIdCardEt().getText().toString().length() == 18 || getIdCardEt().getText().toString().length() == 15) && getProtocolCheckBox().isChecked())) {
                z = true;
            }
        }
        nextBt.setEnabled(z);
    }

    public final MMActivity getActivityContext() {
        Context context = getContext();
        C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        return (MMActivity) context;
    }

    public final String getFaceAppId() {
        return this.f211214i;
    }

    public final EditText getIdCardEt() {
        EditText editText = this.f211211f;
        if (editText != null) {
            return editText;
        }
        C87412m.m108603p("idCardEt");
        throw null;
    }

    public final TextWatcher getMTextWatcher() {
        return this.f211215j;
    }

    public final EditText getNameEt() {
        EditText editText = this.f211210e;
        if (editText != null) {
            return editText;
        }
        C87412m.m108603p("nameEt");
        throw null;
    }

    public final Button getNextBt() {
        Button button = this.f211212g;
        if (button != null) {
            return button;
        }
        C87412m.m108603p("nextBt");
        throw null;
    }

    public final CheckBox getProtocolCheckBox() {
        CheckBox checkBox = this.f211213h;
        if (checkBox != null) {
            return checkBox;
        }
        C87412m.m108603p("protocolCheckBox");
        throw null;
    }

    public final View getRootContentView() {
        View view = this.f211209d;
        if (view != null) {
            return view;
        }
        C87412m.m108603p("rootContentView");
        throw null;
    }

    public final void setFaceAppId(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f211214i = str;
    }

    public final void setIdCardEt(EditText editText) {
        C87412m.m108594g(editText, "<set-?>");
        this.f211211f = editText;
    }

    public final void setNameEt(EditText editText) {
        C87412m.m108594g(editText, "<set-?>");
        this.f211210e = editText;
    }

    public final void setNextBt(Button button) {
        C87412m.m108594g(button, "<set-?>");
        this.f211212g = button;
    }

    public final void setProtocolCheckBox(CheckBox checkBox) {
        C87412m.m108594g(checkBox, "<set-?>");
        this.f211213h = checkBox;
    }

    public final void setRootContentView(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f211209d = view;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenSdkFaceDetectInfoLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        View inflate = C85868k2.m106137b(context).inflate(C0966R.C0971layout.d1g, this);
        C87412m.m108593f(inflate, "getInflater(context).inf…t_user_info_layout, this)");
        setRootContentView(inflate);
    }
}

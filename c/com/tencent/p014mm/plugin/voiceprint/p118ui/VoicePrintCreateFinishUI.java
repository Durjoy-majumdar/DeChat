package com.tencent.p014mm.plugin.voiceprint.p118ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import fy3.C32224a;
import gy3.C87413o;
import kotlin.Metadata;
import p162hk.C8536a;
import p192l4.C10462b;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/voiceprint/ui/VoicePrintCreateFinishUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoicePrintCreateFinishUI */
public final class VoicePrintCreateFinishUI extends MMActivity {

    /* renamed from: f */
    public static final /* synthetic */ int f21698f = 0;

    /* renamed from: d */
    public final C13601g f21699d = C36568h.m40985a(new C5699a(this));

    /* renamed from: e */
    public final C13601g f21700e = C36568h.m40985a(new C5701c(this));

    /* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoicePrintCreateFinishUI$a */
    public static final class C5699a extends C87413o implements C32224a<C8536a> {

        /* renamed from: d */
        public final /* synthetic */ VoicePrintCreateFinishUI f21701d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5699a(VoicePrintCreateFinishUI voicePrintCreateFinishUI) {
            super(0);
            this.f21701d = voicePrintCreateFinishUI;
        }

        public Object invoke() {
            View findViewById = this.f21701d.getBodyView().findViewById(C0966R.C0970id.f359512o00);
            int i = C0966R.C0970id.nzy;
            TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.nzy);
            if (textView != null) {
                i = C0966R.C0970id.nzz;
                TextView textView2 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.nzz);
                if (textView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) findViewById;
                    i = C0966R.C0970id.f359513o01;
                    Button button = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.f359513o01);
                    if (button != null) {
                        i = C0966R.C0970id.f359519lb2;
                        ImageView imageView = (ImageView) C10462b.m10395a(findViewById, C0966R.C0970id.f359519lb2);
                        if (imageView != null) {
                            return new C8536a(constraintLayout, textView, textView2, constraintLayout, button, imageView);
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i)));
        }
    }

    /* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoicePrintCreateFinishUI$b */
    public static final class C5700b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ VoicePrintCreateFinishUI f21702d;

        public C5700b(VoicePrintCreateFinishUI voicePrintCreateFinishUI) {
            this.f21702d = voicePrintCreateFinishUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f21702d.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.voiceprint.ui.VoicePrintCreateFinishUI$c */
    public static final class C5701c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ VoicePrintCreateFinishUI f21703d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C5701c(VoicePrintCreateFinishUI voicePrintCreateFinishUI) {
            super(0);
            this.f21703d = voicePrintCreateFinishUI;
        }

        public Object invoke() {
            return Integer.valueOf(this.f21703d.getIntent().getIntExtra("kscene_type", 0));
        }
    }

    /* renamed from: H7 */
    public final C8536a mo6730H7() {
        return (C8536a) ((C36570n) this.f21699d).getValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.d5u;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(C0966R.color.al6));
        setBackBtn(new C5700b(this), C0966R.raw.actionbar_icon_dark_close);
        C85875k4.m106191k0(mo6730H7().f27593b.getPaint());
        C85875k4.m106191k0(mo6730H7().f27592a.getPaint());
        C85875k4.m106191k0(mo6730H7().f27594c.getPaint());
        mo6730H7().f27594c.setOnClickListener(new C5714f(this));
        mo6730H7().f27592a.setOnClickListener(new C5715g(this));
        switch (((Number) ((C36570n) this.f21700e).getValue()).intValue()) {
            case 72:
                mo6730H7().f27593b.setText(getString(C0966R.string.n64));
                mo6730H7().f27592a.setVisibility(0);
                return;
            case 73:
                mo6730H7().f27593b.setText(getString(C0966R.string.f361505n63));
                mo6730H7().f27592a.setVisibility(8);
                return;
            case 75:
                ImageView imageView = mo6730H7().f27595d;
                Drawable drawable = getDrawable(C0966R.raw.icons_outlined_error);
                C74933u4.m89769f(drawable, getResources().getColor(C0966R.color.Yellow_100));
                imageView.setBackground(drawable);
                mo6730H7().f27593b.setText(getString(C0966R.string.n65));
                mo6730H7().f27594c.setText(getString(C0966R.string.n66));
                mo6730H7().f27592a.setVisibility(8);
                return;
            case 76:
                ImageView imageView2 = mo6730H7().f27595d;
                Drawable drawable2 = getDrawable(C0966R.raw.icons_outlined_error);
                C74933u4.m89769f(drawable2, getResources().getColor(C0966R.color.Yellow_100));
                imageView2.setBackground(drawable2);
                mo6730H7().f27593b.setText(getString(C0966R.string.kd_));
                mo6730H7().f27594c.setText(getString(C0966R.string.f8028zq));
                mo6730H7().f27592a.setVisibility(8);
                return;
            case 77:
                ImageView imageView3 = mo6730H7().f27595d;
                Drawable drawable3 = getDrawable(C0966R.raw.icons_outlined_error);
                C74933u4.m89769f(drawable3, getResources().getColor(C0966R.color.Yellow_100));
                imageView3.setBackground(drawable3);
                mo6730H7().f27593b.setText(getString(C0966R.string.kda));
                mo6730H7().f27594c.setText(getString(C0966R.string.f8028zq));
                mo6730H7().f27592a.setVisibility(8);
                return;
            default:
                mo6730H7().f27593b.setVisibility(8);
                mo6730H7().f27592a.setVisibility(8);
                return;
        }
    }
}

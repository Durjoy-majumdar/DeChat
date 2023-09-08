package com.tencent.p014mm.plugin.textstatus.p112ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusSelectLabelActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusSelectLabelActivity */
public final class TextStatusSelectLabelActivity extends MMActivity {

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusSelectLabelActivity$a */
    public static final class C71532a implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a */
        public final /* synthetic */ TextStatusSelectLabelActivity f207281a;

        public C71532a(TextStatusSelectLabelActivity textStatusSelectLabelActivity) {
            this.f207281a = textStatusSelectLabelActivity;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            Intent intent = new Intent();
            intent.putExtra("SELECT_VISIBILITY", i);
            this.f207281a.setResult(-1, intent);
            this.f207281a.finish();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c9w;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.k2_);
        RadioGroup radioGroup = (RadioGroup) findViewById(C0966R.C0970id.isu);
        if (radioGroup != null) {
            radioGroup.setOnCheckedChangeListener(new C71532a(this));
        }
    }
}

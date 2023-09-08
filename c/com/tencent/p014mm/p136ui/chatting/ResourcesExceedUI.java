package com.tencent.p014mm.p136ui.chatting;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import j20.C117292a;
import java.util.ArrayList;
import p206nj.C11171e;

/* renamed from: com.tencent.mm.ui.chatting.ResourcesExceedUI */
public class ResourcesExceedUI extends MMActivity {

    /* renamed from: d */
    public int f121518d = 0;

    /* renamed from: com.tencent.mm.ui.chatting.ResourcesExceedUI$a */
    public class C44772a implements MenuItem.OnMenuItemClickListener {
        public C44772a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            ResourcesExceedUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.ResourcesExceedUI$b */
    public class C44773b implements View.OnTouchListener {
        public C44773b() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/ResourcesExceedUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            ResourcesExceedUI.this.finish();
            C117292a.m165362h(false, this, "com/tencent/mm/ui/chatting/ResourcesExceedUI$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bta;
    }

    public void initView() {
        hideTitleView();
        fullScreenNoTitleBar(true);
        if (C11171e.m11046c(19)) {
            getWindow().setFlags(201327616, 201327616);
        } else {
            getWindow().setFlags(1024, 1024);
        }
        setBackBtn(new C44772a());
        TextView textView = (TextView) findViewById(C0966R.C0970id.c9y);
        int i = this.f121518d;
        if (i == 0) {
            textView.setText(C0966R.string.kab);
        } else if (i == 1) {
            textView.setText(C0966R.string.fqr);
        } else if (i == 2) {
            textView.setText(C0966R.string.cuz);
        }
        findViewById(C0966R.C0970id.iwq).setOnTouchListener(new C44773b());
    }

    public void onCreate(Bundle bundle) {
        customfixStatusbar(true);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        getWindow().getDecorView().setSystemUiVisibility(1280);
        this.f121518d = getIntent().getIntExtra("clean_view_type", 0);
        setMMTitle("");
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
    }
}

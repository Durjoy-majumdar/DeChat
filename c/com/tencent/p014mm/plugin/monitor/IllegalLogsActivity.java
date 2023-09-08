package com.tencent.p014mm.plugin.monitor;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import java.util.HashSet;
import java.util.Set;
import nj3.C88989a;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.monitor.IllegalLogsActivity */
public class IllegalLogsActivity extends MMActivity {

    /* renamed from: com.tencent.mm.plugin.monitor.IllegalLogsActivity$a */
    public class C69854a implements MenuItem.OnMenuItemClickListener {
        public C69854a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            IllegalLogsActivity.this.finish();
            return true;
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a3g;
    }

    public void onCreate(Bundle bundle) {
        Set set;
        Log.m105919d("MicroMsg.EmptyActivity", "onCreate %s", Integer.valueOf(hashCode()));
        LinearLayout linearLayout = new LinearLayout(this);
        super.onCreate(bundle);
        setBackBtn(new C69854a());
        Intent intent = getIntent();
        if (intent.hasExtra("process")) {
            String stringExtra = intent.getStringExtra("process");
            setMMTitle("违规日志，进程：" + stringExtra);
            set = MultiProcessMMKV.getMMKV("xlog_illegal.txt").decodeStringSet(stringExtra);
        } else {
            set = new HashSet();
        }
        ListView listView = new ListView(this);
        listView.setAdapter(new ArrayAdapter(this, 17367043, (String[]) set.toArray(new String[0])));
        listView.setDivider(new ColorDrawable(getResources().getColor(C0966R.color.f3131gg)));
        listView.setDividerHeight(1);
        linearLayout.addView(listView);
        setContentView((View) linearLayout);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }
}

package com.tencent.p014mm.plugin.textstatus.p112ui;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C87412m;
import java.util.ArrayList;
import jq3.C60898l;
import kotlin.Metadata;
import qz2.C47916g;
import qz2.C47917h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusSquareActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-textstatus_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusSquareActivity */
public final class TextStatusSquareActivity extends MMActivity {

    /* renamed from: d */
    public ArrayList<C47917h> f117012d = new ArrayList<>();

    /* renamed from: e */
    public WxRecyclerView f117013e;

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusSquareActivity$a */
    public static final class C43241a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ TextStatusSquareActivity f117014d;

        public C43241a(TextStatusSquareActivity textStatusSquareActivity) {
            this.f117014d = textStatusSquareActivity;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f117014d.onBackPressed();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusSquareActivity$b */
    public static final class C43242b extends RecyclerView.C0129l {

        /* renamed from: d */
        public final /* synthetic */ TextStatusSquareActivity f117015d;

        public C43242b(TextStatusSquareActivity textStatusSquareActivity) {
            this.f117015d = textStatusSquareActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
            r4 = r4.getAdapter();
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo121f(android.graphics.Rect r2, int r3, androidx.recyclerview.widget.RecyclerView r4) {
            /*
                r1 = this;
                java.lang.String r0 = "outRect"
                gy3.C87412m.m108594g(r2, r0)
                java.lang.String r0 = "parent"
                gy3.C87412m.m108594g(r4, r0)
                com.tencent.mm.plugin.textstatus.ui.TextStatusSquareActivity r4 = r1.f117015d
                com.tencent.mm.view.recyclerview.WxRecyclerView r4 = r4.f117013e
                r0 = 1
                if (r4 == 0) goto L_0x001c
                androidx.recyclerview.widget.RecyclerView$e r4 = r4.getAdapter()
                if (r4 == 0) goto L_0x001c
                int r4 = r4.getItemCount()
                goto L_0x001d
            L_0x001c:
                r4 = 1
            L_0x001d:
                int r4 = r4 - r0
                if (r3 != r4) goto L_0x002b
                com.tencent.mm.plugin.textstatus.ui.TextStatusSquareActivity r3 = r1.f117015d
                r4 = 16
                int r3 = kg3.C76577a.m92151b(r3, r4)
                r2.bottom = r3
                goto L_0x0035
            L_0x002b:
                com.tencent.mm.plugin.textstatus.ui.TextStatusSquareActivity r3 = r1.f117015d
                r4 = 8
                int r3 = kg3.C76577a.m92151b(r3, r4)
                r2.bottom = r3
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.textstatus.p112ui.TextStatusSquareActivity.C43242b.mo121f(android.graphics.Rect, int, androidx.recyclerview.widget.RecyclerView):void");
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.c9z;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        setBackBtn(new C43241a(this));
        Bundle extras = getIntent().getExtras();
        String string = extras != null ? extras.getString("TEXT_STATUS") : null;
        Bundle extras2 = getIntent().getExtras();
        if (extras2 != null) {
            extras2.getString("TOPIC_ID");
        }
        Bundle extras3 = getIntent().getExtras();
        if (extras3 != null) {
            extras3.getString("STATUS_ID");
        }
        for (int i = 0; i < 11; i++) {
            this.f117012d.add(new C47917h(String.valueOf(i), APMidasPayAPI.ENV_TEST, "", "", ""));
        }
        WxRecyclerView wxRecyclerView = (WxRecyclerView) findViewById(C0966R.C0970id.iiq);
        this.f117013e = wxRecyclerView;
        if (wxRecyclerView != null) {
            wxRecyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
        }
        WxRecyclerView wxRecyclerView2 = this.f117013e;
        if (wxRecyclerView2 != null) {
            wxRecyclerView2.setAdapter(new WxRecyclerAdapter(new TextStatusSquareActivity$buildItemConverts$1(), this.f117012d, false));
        }
        WxRecyclerView wxRecyclerView3 = this.f117013e;
        RecyclerView.C16613e adapter = wxRecyclerView3 != null ? wxRecyclerView3.getAdapter() : null;
        C87412m.m108592e(adapter, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<*>");
        C60898l.m71328U5((WxRecyclerAdapter) adapter, new C47916g('#' + string, "共324人 同城23人"), false, 2, (Object) null);
        WxRecyclerView wxRecyclerView4 = this.f117013e;
        if (wxRecyclerView4 != null) {
            wxRecyclerView4.mo17085h0(new C43242b(this));
        }
    }
}

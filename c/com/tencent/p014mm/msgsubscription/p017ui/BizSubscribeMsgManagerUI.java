package com.tencent.p014mm.msgsubscription.p017ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MMBaseAccessibilityConfig;
import com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import f40.C86737h0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import kotlin.Metadata;
import vd0.C22735a;
import vd0.C22738c;
import zd0.C119100f;
import zd0.C23463g;
import zd0.C23464h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/msgsubscription/ui/BizSubscribeMsgManagerUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "Lvd0/c;", "<init>", "()V", "a", "plugin-comm_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C86737h0
/* renamed from: com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI */
public final class BizSubscribeMsgManagerUI extends MMSecDataActivity implements C22738c {

    /* renamed from: o */
    public static final /* synthetic */ int f49055o = 0;

    /* renamed from: d */
    public String f49056d = "";

    /* renamed from: e */
    public String f49057e = "";

    /* renamed from: f */
    public C119100f<?> f49058f;

    /* renamed from: g */
    public ArrayList<SubscribeMsgTmpItem> f49059g = new ArrayList<>();

    /* renamed from: h */
    public MMSwitchBtn f49060h;

    /* renamed from: i */
    public C22735a f49061i;

    /* renamed from: j */
    public MaxRecyclerView f49062j;

    /* renamed from: n */
    public LinearLayout f49063n;

    /* renamed from: com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI$a */
    public static final class C1310a extends MMBaseAccessibilityConfig {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1310a(AppCompatActivity appCompatActivity) {
            super(appCompatActivity);
            C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        }

        public void initConfig() {
            root(C0966R.C0971layout.f6592j6).view(C0966R.C0970id.k_6).disable();
        }
    }

    /* renamed from: com.tencent.mm.msgsubscription.ui.BizSubscribeMsgManagerUI$b */
    public static final class C17811b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ BizSubscribeMsgManagerUI f49064d;

        public C17811b(BizSubscribeMsgManagerUI bizSubscribeMsgManagerUI) {
            this.f49064d = bizSubscribeMsgManagerUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f49064d.finish();
            return false;
        }
    }

    /* renamed from: H7 */
    public final void mo21973H7(boolean z) {
        Resources resources;
        int i;
        MaxRecyclerView maxRecyclerView = this.f49062j;
        if (maxRecyclerView != null) {
            maxRecyclerView.setVisibility((!(this.f49059g.isEmpty() ^ true) || !z) ? 8 : 0);
            TextView textView = (TextView) findViewById(C0966R.C0970id.k_8);
            if (!this.f49059g.isEmpty()) {
                textView.setVisibility(0);
                String string = getString(z ? C0966R.string.ao7 : C0966R.string.ao4);
                C87412m.m108593f(string, "if (show) getString(com.…_msg_close_with_nickname)");
                String format = String.format(string, Arrays.copyOf(new Object[]{this.f49057e}, 1));
                C87412m.m108593f(format, "format(format, *args)");
                textView.setText(format);
                int paddingLeft = textView.getPaddingLeft();
                if (z) {
                    resources = getResources();
                    i = C0966R.dimen.f3898i9;
                } else {
                    resources = getResources();
                    i = C0966R.dimen.f3956le;
                }
                textView.setPadding(paddingLeft, resources.getDimensionPixelSize(i), textView.getPaddingRight(), textView.getPaddingBottom());
            } else {
                textView.setVisibility(8);
            }
            C119100f<?> fVar = this.f49058f;
            if (fVar != null) {
                fVar.notifyDataSetChanged();
                return;
            }
            return;
        }
        C87412m.m108603p("subscribeMsgList");
        throw null;
    }

    public void finish() {
        C22735a aVar = this.f49061i;
        if (aVar != null) {
            aVar.mo35615g(this);
        }
        super.finish();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f6592j6;
    }

    public String getUserName() {
        return this.f49056d;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("key_biz_presenter_class");
        String str = "";
        if (stringExtra == null) {
            stringExtra = str;
        }
        if (!(stringExtra.length() == 0)) {
            try {
                C22735a aVar = (C22735a) Class.forName(stringExtra).newInstance();
                this.f49061i = aVar;
                if (aVar != null) {
                    aVar.f65425a = this;
                }
                if (aVar != null) {
                    aVar.mo35612d(this);
                }
                setMMTitle((int) C0966R.string.ao5);
                C22735a aVar2 = this.f49061i;
                CharSequence charSequence = null;
                this.f49058f = aVar2 != null ? aVar2.mo35611c(this) : null;
                View findViewById = findViewById(C0966R.C0970id.g1j);
                C87412m.m108593f(findViewById, "this.findViewById(R.id.ll_subscribe_msg)");
                this.f49063n = (LinearLayout) findViewById;
                View findViewById2 = findViewById(C0966R.C0970id.k_3);
                C87412m.m108593f(findViewById2, "this.findViewById(R.id.subscribe_msg_list)");
                MaxRecyclerView maxRecyclerView = (MaxRecyclerView) findViewById2;
                this.f49062j = maxRecyclerView;
                maxRecyclerView.setAdapter(this.f49058f);
                MaxRecyclerView maxRecyclerView2 = this.f49062j;
                if (maxRecyclerView2 != null) {
                    maxRecyclerView2.setLayoutManager(new LinearLayoutManager(this, 1, false));
                    View findViewById3 = findViewById(C0966R.C0970id.k_6);
                    C87412m.m108592e(findViewById3, "null cannot be cast to non-null type com.tencent.mm.ui.widget.MMSwitchBtn");
                    MMSwitchBtn mMSwitchBtn = (MMSwitchBtn) findViewById3;
                    this.f49060h = mMSwitchBtn;
                    mMSwitchBtn.setSwitchListener(new C23463g(this));
                    LinearLayout linearLayout = this.f49063n;
                    if (linearLayout != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(getResources().getString(C0966R.string.ao8));
                        sb.append(',');
                        MMSwitchBtn mMSwitchBtn2 = this.f49060h;
                        if (mMSwitchBtn2 != null) {
                            charSequence = mMSwitchBtn2.getContentDescription();
                        }
                        sb.append(charSequence);
                        linearLayout.setContentDescription(sb.toString());
                        MMSwitchBtn mMSwitchBtn3 = this.f49060h;
                        if (mMSwitchBtn3 != null) {
                            mMSwitchBtn3.setFocusable(false);
                        }
                        String stringExtra2 = getIntent().getStringExtra("key_biz_username");
                        if (stringExtra2 == null) {
                            stringExtra2 = str;
                        }
                        this.f49056d = stringExtra2;
                        String stringExtra3 = getIntent().getStringExtra("key_biz_nickname");
                        if (stringExtra3 != null) {
                            str = stringExtra3;
                        }
                        this.f49057e = str;
                        Log.m105919d("MicroMsg.BizSubscribeMsgManagerUI", "alvinluo SubscribeMsgManager username: %s, nickname: %s", this.f49056d, str);
                        C22735a aVar3 = this.f49061i;
                        if (aVar3 != null) {
                            aVar3.mo35609a(this.f49056d, new C23464h(this));
                        }
                        setBackBtn(new C17811b(this));
                        return;
                    }
                    C87412m.m108603p("ll");
                    throw null;
                }
                C87412m.m108603p("subscribeMsgList");
                throw null;
            } catch (Exception e) {
                throw new Exception("create presenter instance fail!", e);
            }
        } else {
            throw new Exception("Presenter ClassName is empty");
        }
    }

    public void onDestroy() {
        C22735a aVar = this.f49061i;
        super.onDestroy();
        Log.m105924i("MicroMsg.BizSubscribeMsgManagerUI", "alvinluo onDestroy");
    }

    public void onPause() {
        C22735a aVar = this.f49061i;
        if (aVar != null) {
            aVar.mo35613e(this);
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        C22735a aVar = this.f49061i;
        if (aVar != null) {
            aVar.mo35614f(this);
        }
    }

    public void onStart() {
        super.onStart();
    }

    public void onStop() {
        super.onStop();
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        C87412m.m108594g(hashSet, "set");
        super.superImportUIComponents(hashSet);
        hashSet.add(C1310a.class);
    }

    /* renamed from: z0 */
    public void mo21975z0(SubscribeMsgTmpItem subscribeMsgTmpItem, int i) {
        C119100f<?> fVar = this.f49058f;
        if (fVar != null) {
            fVar.notifyItemChanged(i);
        }
    }
}

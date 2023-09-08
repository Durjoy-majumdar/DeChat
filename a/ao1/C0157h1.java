package ao1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import dp1.C7435f2;
import er1.C58771q3;
import fy3.C32227p;
import gy3.C87412m;
import java.util.List;
import je1.C9317i1;
import nr3.C89059e;
import org.json.JSONException;
import org.json.JSONObject;
import rs1.C13442s8;
import rx3.C13598b0;
import te3.C51270sn1;

/* renamed from: ao1.h1 */
public final class C0157h1 extends UIComponent {

    /* renamed from: d */
    public LinearLayout f600d;

    /* renamed from: e */
    public boolean f601e;

    /* renamed from: f */
    public int f602f;

    /* renamed from: g */
    public C32227p<? super String, ? super String, C13598b0> f603g;

    /* renamed from: h */
    public List<? extends C51270sn1> f604h;

    /* renamed from: i */
    public C0158a f605i;

    /* renamed from: j */
    public int f606j = -1;

    /* renamed from: n */
    public String f607n = "";

    /* renamed from: ao1.h1$a */
    public static final class C0158a extends RecyclerView.C16613e<C0159b> {

        /* renamed from: d */
        public List<? extends C51270sn1> f608d;

        /* renamed from: e */
        public final C32227p<String, Integer, C13598b0> f609e;

        public C0158a(List<? extends C51270sn1> list, C32227p<? super String, ? super Integer, C13598b0> pVar) {
            C87412m.m108594g(list, "dataList");
            C87412m.m108594g(pVar, "onItemClick");
            this.f608d = list;
            this.f609e = pVar;
        }

        public int getItemCount() {
            return this.f608d.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C0159b bVar = (C0159b) zVar;
            C87412m.m108594g(bVar, "holder");
            C51270sn1 sn12 = (C51270sn1) this.f608d.get(i);
            StringBuilder sb = new StringBuilder();
            C58771q3 q3Var = C58771q3.f168268a;
            sb.append('#');
            sb.append(sn12.f141617d);
            String sb4 = sb.toString();
            TextView textView = bVar.f610z;
            if (textView != null) {
                textView.setText(sb4);
            }
            bVar.f44854d.setOnClickListener(new C0154g1(this, sn12, i));
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.ann, viewGroup, false);
            C87412m.m108593f(inflate, "view");
            return new C0159b(inflate);
        }
    }

    /* renamed from: ao1.h1$b */
    public static final class C0159b extends RecyclerView.C16631z {

        /* renamed from: z */
        public TextView f610z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0159b(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f610z = (TextView) view.findViewById(C0966R.C0970id.ksg);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0157h1(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final void mo148c3(int i, String str, int i2) {
        JSONObject jSONObject = new JSONObject();
        if (i == 0) {
            try {
                jSONObject.put("topic_num", this.f602f);
            } catch (JSONException unused) {
            }
        } else {
            jSONObject.put("topic", str);
            jSONObject.put("num", i2);
        }
        C13442s8 f = C13442s8.f38060Q0.mo12873f(getContext());
        C7435f2.f25626a.mo8577a(f != null ? f.mo12861q3() : null, "post_comm_topic_page", i, jSONObject);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C89059e i = new C9317i1(1).mo9225i();
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        i.mo11397F((MMActivity) activity);
        i.mo123420E(new C0172l1(this));
    }
}

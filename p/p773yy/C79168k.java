package p773yy;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.p136ui.base.NoMeasuredTextView;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.listview.PullDownListView;
import di3.C7335d;
import org.json.JSONObject;
import qy2.C47894a0;
import qy2.C47896n;
import qy2.C63347a;
import qy2.C77451h;
import qy2.C77453j;

/* renamed from: yy.k */
public interface C79168k extends C7335d {

    /* renamed from: yy.k$a */
    public interface C53638a {
    }

    /* renamed from: AK */
    void mo74104AK(TextView textView, String str, int i, C63347a.C47892c cVar, C63347a.C47893d dVar);

    /* renamed from: BS */
    boolean mo74105BS(String str);

    void Bb0(String str);

    /* renamed from: By */
    void mo74107By(Context context, String str);

    /* renamed from: Fe */
    CharSequence mo74108Fe(TextView textView, String str, CharSequence charSequence, C63347a.C47892c cVar, float f);

    /* renamed from: HD */
    void mo74109HD(String str, long j);

    ImageSpan Ig0(TextView textView, String str, C63347a.C47892c cVar, float f);

    /* renamed from: Ij */
    void mo74111Ij(long j, String str);

    /* renamed from: J6 */
    C77453j mo74112J6(Context context, RelativeLayout relativeLayout, LinearLayout linearLayout, int i);

    /* renamed from: Kw */
    C47896n mo74113Kw(Context context, C47894a0 a0Var);

    /* renamed from: Mg */
    void mo74114Mg(Activity activity, String str);

    /* renamed from: Nd */
    void mo74115Nd(String str, int i, Context context, C53638a aVar);

    void Ng0(TextView textView, String str);

    /* renamed from: O9 */
    MMFragment mo74117O9(Context context, Bundle bundle);

    /* renamed from: OU */
    long mo74118OU();

    /* renamed from: Py */
    void mo74119Py(View view, CharSequence charSequence);

    void Ru0(String str, String str2, Boolean bool);

    /* renamed from: V7 */
    boolean mo74121V7();

    /* renamed from: Xo */
    void mo74122Xo(Context context, PullDownListView pullDownListView);

    /* renamed from: Ye */
    Class<? extends UIComponent> mo74123Ye();

    /* renamed from: Yl */
    void mo74124Yl(NoMeasuredTextView noMeasuredTextView, String str, C63347a.C47892c cVar);

    /* renamed from: ZW */
    void mo74125ZW(Context context);

    /* renamed from: ej */
    C77453j mo74126ej(Context context, RelativeLayout relativeLayout, LinearLayout linearLayout);

    /* renamed from: if */
    String mo74127if(String str);

    /* renamed from: nC */
    void mo74128nC(TextView textView, String str, C63347a.C47892c cVar);

    /* renamed from: nj */
    void mo74129nj(Context context);

    /* renamed from: ns */
    void mo74130ns(TextView textView, String str, C63347a.C47892c cVar, C63347a.C47893d dVar);

    /* renamed from: o6 */
    String mo74131o6(String str);

    /* renamed from: ov */
    void mo74132ov(ImageView imageView, String str, C63347a.C47893d dVar, C63347a.C47891b bVar);

    String qb0();

    String r70();

    boolean s50();

    void sj0();

    JSONObject vd0(JSONObject jSONObject);

    /* renamed from: we */
    boolean mo74139we(Context context, JSONObject jSONObject);

    /* renamed from: z6 */
    C77451h mo74140z6(Context context, Runnable runnable, boolean z);
}

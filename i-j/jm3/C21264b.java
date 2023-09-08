package jm3;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.tencent.p014mm.p136ui.matrix.recyclerview.JsonItemView;
import com.tencent.xweb.file.XVFSFile;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: jm3.b */
public class C21264b extends C21263a<C21266b> {

    /* renamed from: n */
    public JSONArray f60067n;

    /* renamed from: o */
    public View.OnLongClickListener f60068o;

    /* renamed from: jm3.b$a */
    public class C21265a implements View.OnClickListener {

        /* renamed from: d */
        public Object f60069d;

        /* renamed from: e */
        public JsonItemView f60070e;

        /* renamed from: f */
        public boolean f60071f;

        /* renamed from: g */
        public int f60072g;

        /* renamed from: h */
        public boolean f60073h = true;

        /* renamed from: i */
        public boolean f60074i;

        public C21265a(Object obj, JsonItemView jsonItemView, boolean z, int i) {
            boolean z2 = true;
            this.f60069d = obj;
            this.f60070e = jsonItemView;
            this.f60071f = z;
            this.f60072g = i;
            this.f60074i = (obj == null || !(obj instanceof JSONArray)) ? false : z2;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/matrix/recyclerview/JsonViewerAdapter$JsonItemClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f60070e.getChildCount() == 1) {
                this.f60073h = false;
                this.f60070e.mo26281b(false);
                JsonItemView jsonItemView = this.f60070e;
                jsonItemView.setTag(jsonItemView.getRightText());
                this.f60070e.mo26282c(this.f60074i ? "[" : "{");
                JSONArray names = this.f60074i ? (JSONArray) this.f60069d : ((JSONObject) this.f60069d).names();
                int i = 0;
                while (names != null && i < names.length()) {
                    JsonItemView jsonItemView2 = new JsonItemView(this.f60070e.getContext(), (AttributeSet) null);
                    jsonItemView2.setTextSize(C21263a.f60066j);
                    jsonItemView2.setRightColor(C21263a.f60065i);
                    Object opt = names.opt(i);
                    if (this.f60074i) {
                        C21264b bVar = C21264b.this;
                        boolean z = i < names.length() - 1;
                        int i2 = this.f60072g;
                        bVar.getClass();
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C117362c.m165476a(i2));
                        jsonItemView2.f56343e.setVisibility(0);
                        jsonItemView2.f56343e.setText(spannableStringBuilder);
                        bVar.mo33235F4(opt, jsonItemView2, z, i2);
                    } else {
                        C21264b bVar2 = C21264b.this;
                        String str = (String) opt;
                        Object opt2 = ((JSONObject) this.f60069d).opt(str);
                        boolean z2 = i < names.length() - 1;
                        int i3 = this.f60072g;
                        bVar2.getClass();
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(C117362c.m165476a(i3));
                        spannableStringBuilder2.append(FastJsonResponse.QUOTE).append(str).append(FastJsonResponse.QUOTE).append(XVFSFile.PATH_SEPARATOR);
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(C21263a.f60060d), 0, spannableStringBuilder2.length() - 1, 33);
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(C21263a.f60065i), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                        jsonItemView2.f56343e.setVisibility(0);
                        jsonItemView2.f56343e.setText(spannableStringBuilder2);
                        bVar2.mo33235F4(opt2, jsonItemView2, z2, i3);
                    }
                    this.f60070e.mo26280a(jsonItemView2);
                    i++;
                }
                JsonItemView jsonItemView3 = new JsonItemView(this.f60070e.getContext(), (AttributeSet) null);
                jsonItemView3.setTextSize(C21263a.f60066j);
                jsonItemView3.setRightColor(C21263a.f60065i);
                StringBuilder sb = new StringBuilder(C117362c.m165476a(this.f60072g - 1));
                sb.append(this.f60074i ? "]" : "}");
                sb.append(this.f60071f ? "," : "");
                jsonItemView3.mo26282c(sb);
                this.f60070e.mo26280a(jsonItemView3);
                this.f60070e.requestLayout();
                this.f60070e.invalidate();
            } else {
                CharSequence rightText = this.f60070e.getRightText();
                JsonItemView jsonItemView4 = this.f60070e;
                jsonItemView4.mo26282c((CharSequence) jsonItemView4.getTag());
                this.f60070e.setTag(rightText);
                this.f60070e.mo26281b(!this.f60073h);
                for (int i4 = 1; i4 < this.f60070e.getChildCount(); i4++) {
                    View childAt = this.f60070e.getChildAt(i4);
                    int i5 = this.f60073h ? 0 : 8;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(Integer.valueOf(i5));
                    C117292a.m165358d(childAt, aVar.mo10232b(), "com/tencent/mm/ui/matrix/recyclerview/JsonViewerAdapter$JsonItemClickListener", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    childAt.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(childAt, "com/tencent/mm/ui/matrix/recyclerview/JsonViewerAdapter$JsonItemClickListener", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                this.f60073h = !this.f60073h;
            }
            C117292a.m165361g(this, "com/tencent/mm/ui/matrix/recyclerview/JsonViewerAdapter$JsonItemClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: jm3.b$b */
    public class C21266b extends RecyclerView.C16631z {

        /* renamed from: z */
        public JsonItemView f60077z;

        /* renamed from: jm3.b$b$a */
        public class C21267a implements View.OnLongClickListener {

            /* renamed from: d */
            public final /* synthetic */ JsonItemView f60078d;

            public C21267a(C21264b bVar, JsonItemView jsonItemView) {
                this.f60078d = jsonItemView;
            }

            public boolean onLongClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/matrix/recyclerview/JsonViewerAdapter$JsonItemViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
                C21266b bVar = C21266b.this;
                C21264b bVar2 = C21264b.this;
                if (bVar2.f60068o != null) {
                    try {
                        this.f60078d.setTag(bVar2.f60067n.get(bVar.mo17363j() - 1));
                    } catch (Exception unused) {
                    }
                    boolean onLongClick = C21264b.this.f60068o.onLongClick(view);
                    C117292a.m165362h(onLongClick, this, "com/tencent/mm/ui/matrix/recyclerview/JsonViewerAdapter$JsonItemViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                    return onLongClick;
                }
                C117292a.m165362h(false, this, "com/tencent/mm/ui/matrix/recyclerview/JsonViewerAdapter$JsonItemViewHolder$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
                return false;
            }
        }

        public C21266b(JsonItemView jsonItemView) {
            super(jsonItemView);
            mo17376v(false);
            this.f60077z = jsonItemView;
            jsonItemView.setOnLongClickListener(new C21267a(C21264b.this, jsonItemView));
        }
    }

    public C21264b(JSONArray jSONArray) {
        this.f60067n = jSONArray;
        if (jSONArray == null) {
            throw new IllegalArgumentException("jsonArray can not be null.");
        }
    }

    /* renamed from: F4 */
    public final void mo33235F4(Object obj, JsonItemView jsonItemView, boolean z, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (obj instanceof Number) {
            spannableStringBuilder.append(obj.toString());
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C21263a.f60062f), 0, spannableStringBuilder.length(), 33);
        } else if (obj instanceof Boolean) {
            spannableStringBuilder.append(obj.toString());
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C21263a.f60063g), 0, spannableStringBuilder.length(), 33);
        } else if (obj instanceof JSONObject) {
            jsonItemView.mo26281b(true);
            spannableStringBuilder.append("Object{...}");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C21263a.f60065i), 0, spannableStringBuilder.length(), 33);
            jsonItemView.setIconClickListener(new C21265a(obj, jsonItemView, z, i + 1));
        } else if (obj instanceof JSONArray) {
            jsonItemView.mo26281b(true);
            spannableStringBuilder.append("Array[").append(String.valueOf(((JSONArray) obj).length())).append("]");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C21263a.f60065i), 0, 6, 33);
            int i2 = length - 1;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C21263a.f60062f), 6, i2, 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C21263a.f60065i), i2, length, 33);
            jsonItemView.setIconClickListener(new C21265a(obj, jsonItemView, z, i + 1));
        } else if (obj != null) {
            jsonItemView.f56345g.setVisibility(8);
            spannableStringBuilder.append(FastJsonResponse.QUOTE).append(obj.toString()).append(FastJsonResponse.QUOTE);
            if (C117362c.f351355a.matcher(obj.toString()).matches()) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(C21263a.f60061e), 0, 1, 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(C21263a.f60064h), 1, spannableStringBuilder.length() - 1, 33);
                spannableStringBuilder.setSpan(new ForegroundColorSpan(C21263a.f60061e), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            } else {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(C21263a.f60061e), 0, spannableStringBuilder.length(), 33);
            }
        } else if (spannableStringBuilder.length() == 0 || obj == null) {
            jsonItemView.f56345g.setVisibility(8);
            spannableStringBuilder.append("null");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-1091275), 0, spannableStringBuilder.length(), 33);
        }
        if (z) {
            spannableStringBuilder.append(",");
        }
        jsonItemView.mo26282c(spannableStringBuilder);
    }

    public int getItemCount() {
        JSONArray jSONArray = this.f60067n;
        if (jSONArray != null) {
            return jSONArray.length() + 2;
        }
        return 0;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        JsonItemView jsonItemView = ((C21266b) zVar).f60077z;
        jsonItemView.setTextSize(C21263a.f60066j);
        jsonItemView.setRightColor(C21263a.f60065i);
        if (this.f60067n == null) {
            return;
        }
        if (i == 0) {
            jsonItemView.f56343e.setVisibility(8);
            jsonItemView.f56345g.setVisibility(8);
            jsonItemView.mo26282c("[");
        } else if (i == getItemCount() - 1) {
            jsonItemView.f56343e.setVisibility(8);
            jsonItemView.f56345g.setVisibility(8);
            jsonItemView.mo26282c("]");
        } else {
            Object opt = this.f60067n.opt(i - 1);
            if (i < getItemCount() - 2) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C117362c.m165476a(1));
                jsonItemView.f56343e.setVisibility(0);
                jsonItemView.f56343e.setText(spannableStringBuilder);
                mo33235F4(opt, jsonItemView, true, 1);
                return;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(C117362c.m165476a(1));
            jsonItemView.f56343e.setVisibility(0);
            jsonItemView.f56343e.setText(spannableStringBuilder2);
            mo33235F4(opt, jsonItemView, false, 1);
        }
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C21266b(new JsonItemView(viewGroup.getContext(), (AttributeSet) null));
    }
}

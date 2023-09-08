package com.tencent.p014mm.plugin.recordvideo.p095ui.editor.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import fy3.C32226l;
import gi2.C107817e;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Arrays;
import kg3.C76577a;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;
import rx3.C13598b0;
import sx3.C64197v;
import uh2.C111175f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u001d\b\u0016\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R0\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/view/FontSelectorView;", "Landroid/widget/LinearLayout;", "", "font", "Lrx3/b0;", "setSelectFont", "Lkotlin/Function1;", "f", "Lfy3/l;", "getFontSelectCallback", "()Lfy3/l;", "setFontSelectCallback", "(Lfy3/l;)V", "fontSelectCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.view.FontSelectorView */
public final class FontSelectorView extends LinearLayout {

    /* renamed from: g */
    public static final /* synthetic */ int f315699g = 0;

    /* renamed from: d */
    public final ArrayList<View> f315700d;

    /* renamed from: e */
    public ArrayList<JSONObject> f315701e;

    /* renamed from: f */
    public C32226l<? super String, C13598b0> f315702f;

    public FontSelectorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        this.f315700d = new ArrayList<>();
        this.f315701e = new ArrayList<>();
        setOrientation(0);
        setGravity(16);
        C111175f fVar = C111175f.f332956d;
        if (fVar.f315409b) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", C76577a.m92166q(getContext(), C0966R.string.f360820f13));
            jSONObject.put("key", "default");
            jSONObject.put("path", "default");
            this.f315701e.add(jSONObject);
            JSONArray c = fVar.mo151273c();
            if (c != null) {
                int length = c.length();
                for (int i2 = 0; i2 < length; i2++) {
                    this.f315701e.add(c.optJSONObject(i2));
                }
            }
            try {
                int i3 = 0;
                for (T next : this.f315701e) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        JSONObject jSONObject2 = (JSONObject) next;
                        TextView textView = new TextView(getContext());
                        String optString = jSONObject2.optString("name");
                        if (TextUtils.isEmpty(jSONObject2.optString("path"))) {
                            str = "";
                        } else {
                            str = C111175f.f332956d.mo151277g() + jSONObject2.optString("path");
                        }
                        textView.setText(optString);
                        String q = C76577a.m92166q(getContext(), C0966R.string.f7533ix);
                        C87412m.m108593f(q, "getString(context, R.string.aging_font_button)");
                        String format = String.format(q, Arrays.copyOf(new Object[]{optString}, 1));
                        C87412m.m108593f(format, "format(format, *args)");
                        textView.setContentDescription(format);
                        if (C86013q1.m106450k(str)) {
                            textView.setTypeface(Typeface.createFromFile(str));
                        } else {
                            textView.setTypeface(Typeface.DEFAULT);
                        }
                        textView.setBackground(getContext().getDrawable(C0966R.C0969drawable.a6d));
                        textView.setTextColor(getContext().getResources().getColor(C0966R.color.BW_BG_100));
                        textView.setTextSize(0, (float) getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3736cp));
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.width = getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3761db);
                        layoutParams.height = C76577a.m92151b(getContext(), 30);
                        if (i3 != this.f315701e.size() - 1) {
                            layoutParams.setMarginEnd(getContext().getResources().getDimensionPixelSize(C0966R.dimen.f3749d0));
                        }
                        textView.setGravity(17);
                        addView(textView, layoutParams);
                        this.f315700d.add(textView);
                        textView.setTag(Integer.valueOf(i3));
                        textView.setOnClickListener(new C107817e(this));
                        i3 = i4;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
                this.f315700d.get(0).setBackground(getContext().getDrawable(C0966R.C0969drawable.a6e));
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.FontSelectorView", e, "parse font error", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public final void mo151529a(int i) {
        int i2 = 0;
        for (T next : this.f315700d) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                View view = (View) next;
                if (i2 == i) {
                    view.setBackground(getContext().getDrawable(C0966R.C0969drawable.a6e));
                } else {
                    view.setBackground(getContext().getDrawable(C0966R.C0969drawable.a6d));
                }
                i2 = i3;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }

    public final C32226l<String, C13598b0> getFontSelectCallback() {
        return this.f315702f;
    }

    public final void setFontSelectCallback(C32226l<? super String, C13598b0> lVar) {
        this.f315702f = lVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        if (z04.C112550d0.m153801u(r8, r3, false) == true) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setSelectFont(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r1 = 0
            if (r0 == 0) goto L_0x000b
            r7.mo151529a(r1)
            return
        L_0x000b:
            java.util.ArrayList<org.json.JSONObject> r0 = r7.f315701e
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L_0x0012:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0045
            java.lang.Object r3 = r0.next()
            int r4 = r2 + 1
            if (r2 < 0) goto L_0x0040
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            r5 = 1
            if (r8 == 0) goto L_0x0038
            java.lang.String r6 = "path"
            java.lang.String r3 = r3.optString(r6)
            java.lang.String r6 = "jsonObject.optString(\"path\")"
            gy3.C87412m.m108593f(r3, r6)
            boolean r3 = z04.C112550d0.m153801u(r8, r3, r1)
            if (r3 != r5) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r5 = 0
        L_0x0039:
            if (r5 == 0) goto L_0x003e
            r7.mo151529a(r2)
        L_0x003e:
            r2 = r4
            goto L_0x0012
        L_0x0040:
            sx3.C64197v.m75542k()
            r8 = 0
            throw r8
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.recordvideo.p095ui.editor.view.FontSelectorView.setSelectFont(java.lang.String):void");
    }

    public FontSelectorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}

package com.tencent.p014mm.plugin.scanner.p101ui.widget;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import ul2.C111199e;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014B#\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0017"}, mo182094d2 = {"Lcom/tencent/mm/plugin/scanner/ui/widget/ScrollTab;", "Landroid/widget/LinearLayout;", "Lul2/e;", "", "getTabId", "", "getTabTitle", "tabId", "Lrx3/b0;", "setTabId", "tabTitle", "setTabTitle", "", "enable", "setTabEnabled", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-scan_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.scanner.ui.widget.ScrollTab */
public final class ScrollTab extends LinearLayout implements C111199e {

    /* renamed from: d */
    public TextView f20604d;

    /* renamed from: e */
    public int f20605e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ScrollTab(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public void mo6141a() {
        StringBuilder sb = new StringBuilder();
        TextView textView = this.f20604d;
        if (textView != null) {
            sb.append(textView.getText());
            sb.append(getContext().getString(C0966R.string.ief));
            String sb4 = sb.toString();
            StringBuilder sb5 = new StringBuilder();
            sb5.append("alvinluo onTabSelected ");
            TextView textView2 = this.f20604d;
            if (textView2 != null) {
                sb5.append(textView2.getText());
                sb5.append("  desc:");
                sb5.append(sb4);
                Log.m105918d("MicroMsg.ScrollTab", sb5.toString());
                TextView textView3 = this.f20604d;
                if (textView3 != null) {
                    textView3.setTextColor(getResources().getColor(C0966R.color.aa7));
                    TextView textView4 = this.f20604d;
                    if (textView4 != null) {
                        textView4.setContentDescription(sb4);
                        TextView textView5 = this.f20604d;
                        if (textView5 != null) {
                            textView5.setAlpha(1.0f);
                            TextView textView6 = this.f20604d;
                            if (textView6 != null) {
                                TextPaint paint = textView6.getPaint();
                                if (paint != null) {
                                    paint.setStyle(Paint.Style.FILL_AND_STROKE);
                                }
                                TextView textView7 = this.f20604d;
                                if (textView7 != null) {
                                    TextPaint paint2 = textView7.getPaint();
                                    if (paint2 != null) {
                                        paint2.setStrokeWidth(0.8f);
                                        return;
                                    }
                                    return;
                                }
                                C87412m.m108603p("tabTitle");
                                throw null;
                            }
                            C87412m.m108603p("tabTitle");
                            throw null;
                        }
                        C87412m.m108603p("tabTitle");
                        throw null;
                    }
                    C87412m.m108603p("tabTitle");
                    throw null;
                }
                C87412m.m108603p("tabTitle");
                throw null;
            }
            C87412m.m108603p("tabTitle");
            throw null;
        }
        C87412m.m108603p("tabTitle");
        throw null;
    }

    /* renamed from: b */
    public void mo6142b() {
        StringBuilder sb = new StringBuilder();
        sb.append("alvinluo onTabUnselected ");
        TextView textView = this.f20604d;
        if (textView != null) {
            sb.append(textView.getText());
            sb.append("  desc:");
            TextView textView2 = this.f20604d;
            if (textView2 != null) {
                sb.append(textView2.getText());
                Log.m105918d("MicroMsg.ScrollTab", sb.toString());
                TextView textView3 = this.f20604d;
                if (textView3 != null) {
                    textView3.setTextColor(getResources().getColor(C0966R.color.aa7));
                    TextView textView4 = this.f20604d;
                    if (textView4 == null) {
                        C87412m.m108603p("tabTitle");
                        throw null;
                    } else if (textView4 != null) {
                        textView4.setContentDescription(textView4.getText());
                        TextView textView5 = this.f20604d;
                        if (textView5 != null) {
                            textView5.setAlpha(0.5f);
                            TextView textView6 = this.f20604d;
                            if (textView6 != null) {
                                TextPaint paint = textView6.getPaint();
                                if (paint != null) {
                                    paint.setStyle(Paint.Style.FILL);
                                    return;
                                }
                                return;
                            }
                            C87412m.m108603p("tabTitle");
                            throw null;
                        }
                        C87412m.m108603p("tabTitle");
                        throw null;
                    } else {
                        C87412m.m108603p("tabTitle");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("tabTitle");
                    throw null;
                }
            } else {
                C87412m.m108603p("tabTitle");
                throw null;
            }
        } else {
            C87412m.m108603p("tabTitle");
            throw null;
        }
    }

    public int getTabId() {
        return this.f20605e;
    }

    public String getTabTitle() {
        TextView textView = this.f20604d;
        if (textView != null) {
            return textView.getText().toString();
        }
        C87412m.m108603p("tabTitle");
        throw null;
    }

    public void setTabEnabled(boolean z) {
        Log.m105927v("MicroMsg.ScrollTab", "alvinluo setTabEnabled %b", Boolean.valueOf(z));
        if (z) {
            setAlpha(1.0f);
        } else {
            setAlpha(0.3f);
        }
    }

    public void setTabId(int i) {
        this.f20605e = i;
    }

    public void setTabTitle(String str) {
        C87412m.m108594g(str, "tabTitle");
        TextView textView = this.f20604d;
        if (textView != null) {
            textView.setText(str);
        } else {
            C87412m.m108603p("tabTitle");
            throw null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollTab(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f20605e = -1;
        View findViewById = LayoutInflater.from(context).inflate(C0966R.C0971layout.f359850b52, this).findViewById(C0966R.C0970id.j46);
        C87412m.m108593f(findViewById, "view.findViewById(R.id.scroll_tab_title)");
        TextView textView = (TextView) findViewById;
        this.f20604d = textView;
        textView.setAlpha(0.5f);
    }
}

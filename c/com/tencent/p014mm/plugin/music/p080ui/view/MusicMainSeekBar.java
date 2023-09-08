package com.tencent.p014mm.plugin.music.p080ui.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import gy3.C8479f0;
import gy3.C8480h;
import gy3.C87412m;
import kotlin.Metadata;
import p192l4.C10462b;
import y00.C66480a;
import ya2.C15943i;
import ya2.C66602g;
import ya2.C66603h;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB!\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018B\u0019\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006R\"\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, mo182094d2 = {"Lcom/tencent/mm/plugin/music/ui/view/MusicMainSeekBar;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/plugin/music/ui/view/MusicMainSeekBar$b;", "onSeekBarChange", "Lrx3/b0;", "setOnSeekBarChange", "", "currentPos", "setProgress", "totalDuration", "setMaxProgress", "", "d", "Z", "isSeeking", "()Z", "setSeeking", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "b", "music-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.music.ui.view.MusicMainSeekBar */
public final class MusicMainSeekBar extends FrameLayout {

    /* renamed from: h */
    public static final C56891a f162979h = new C56891a((C8480h) null);

    /* renamed from: d */
    public boolean f162980d;

    /* renamed from: e */
    public C56892b f162981e;

    /* renamed from: f */
    public String f162982f;

    /* renamed from: g */
    public C66480a f162983g;

    /* renamed from: com.tencent.mm.plugin.music.ui.view.MusicMainSeekBar$a */
    public static final class C56891a {
        public C56891a(C8480h hVar) {
        }

        /* renamed from: a */
        public final String mo80331a(int i) {
            StringBuilder sb = new StringBuilder();
            long j = (long) i;
            long j2 = j / 60000;
            long floor = (long) Math.floor(((double) (j % 60000)) / 1000.0d);
            if (j2 < 10) {
                sb.append("0");
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(j2);
            sb4.append(XVFSFile.PATH_SEPARATOR_CHAR);
            sb.append(sb4.toString());
            if (floor < 10) {
                sb.append("0");
            }
            sb.append(floor);
            String sb5 = sb.toString();
            C87412m.m108593f(sb5, "time.toString()");
            return sb5;
        }
    }

    /* renamed from: com.tencent.mm.plugin.music.ui.view.MusicMainSeekBar$b */
    public interface C56892b {
        /* renamed from: a */
        void mo80332a();

        /* renamed from: b */
        void mo80333b(int i, int i2);

        /* renamed from: c */
        void mo80334c(int i, int i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicMainSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f162982f = "04:00";
        View inflate = LayoutInflater.from(getContext()).inflate(C0966R.C0971layout.bim, this, false);
        addView(inflate);
        LinearLayout linearLayout = (LinearLayout) inflate;
        int i2 = C0966R.C0970id.j8l;
        SeekBar seekBar = (SeekBar) C10462b.m10395a(inflate, C0966R.C0970id.j8l);
        if (seekBar != null) {
            i2 = C0966R.C0970id.kkk;
            TextView textView = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.kkk);
            if (textView != null) {
                i2 = C0966R.C0970id.kkl;
                TextView textView2 = (TextView) C10462b.m10395a(inflate, C0966R.C0970id.kkl);
                if (textView2 != null) {
                    this.f162983g = new C66480a(linearLayout, linearLayout, seekBar, textView, textView2);
                    Drawable drawable = getResources().getDrawable(C0966R.C0969drawable.ain);
                    C8479f0 f0Var = new C8479f0();
                    f0Var.f27484d = getResources().getDrawable(C0966R.C0969drawable.aio);
                    C66480a aVar = this.f162983g;
                    if (aVar != null) {
                        aVar.f191253a.setOnTouchListener(new C66602g(this));
                        C66480a aVar2 = this.f162983g;
                        if (aVar2 != null) {
                            aVar2.f191254b.setOnSeekBarChangeListener(new C66603h(this, f0Var, drawable));
                            C66480a aVar3 = this.f162983g;
                            if (aVar3 != null) {
                                aVar3.f191254b.setOnTouchListener(C15943i.f42829d);
                                return;
                            } else {
                                C87412m.m108603p("seekBarBinding");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("seekBarBinding");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("seekBarBinding");
                        throw null;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }

    /* renamed from: a */
    public final void mo80326a(int i) {
        C66480a aVar = this.f162983g;
        if (aVar != null) {
            TextView textView = aVar.f191256d;
            if (textView != null) {
                textView.setText(f162979h.mo80331a(i));
            }
            C66480a aVar2 = this.f162983g;
            if (aVar2 != null) {
                TextView textView2 = aVar2.f191255c;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(this.f162982f));
                    return;
                }
                return;
            }
            C87412m.m108603p("seekBarBinding");
            throw null;
        }
        C87412m.m108603p("seekBarBinding");
        throw null;
    }

    public final void setMaxProgress(int i) {
        this.f162982f = f162979h.mo80331a(i);
        C66480a aVar = this.f162983g;
        if (aVar != null) {
            aVar.f191254b.setMax(i);
            Log.m105924i("MicroMsg.MusicMainSeekBar", "maxDuration:" + this.f162982f + ", " + i);
            return;
        }
        C87412m.m108603p("seekBarBinding");
        throw null;
    }

    public final void setOnSeekBarChange(C56892b bVar) {
        C87412m.m108594g(bVar, "onSeekBarChange");
        this.f162981e = bVar;
    }

    public final void setProgress(int i) {
        if (!this.f162980d) {
            mo80326a(i);
            C66480a aVar = this.f162983g;
            if (aVar != null) {
                aVar.f191254b.setProgress(i);
            } else {
                C87412m.m108603p("seekBarBinding");
                throw null;
            }
        }
    }

    public final void setSeeking(boolean z) {
        this.f162980d = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MusicMainSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }
}

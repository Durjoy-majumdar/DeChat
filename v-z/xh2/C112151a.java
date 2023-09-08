package xh2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.recordvideo.model.audio.AudioCacheInfo;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.AudioWaveView;
import com.tencent.p014mm.plugin.recordvideo.p095ui.editor.MusicLrcView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32227p;
import gc0.C20828a;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import jh2.C60863m;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: xh2.a */
public final class C112151a extends RecyclerView.C16613e<C112152a> {

    /* renamed from: d */
    public final ArrayList<AudioCacheInfo> f335823d = new ArrayList<>();

    /* renamed from: e */
    public int f335824e = -1;

    /* renamed from: f */
    public String f335825f;

    /* renamed from: g */
    public int f335826g = C0966R.C0969drawable.f4532f8;

    /* renamed from: h */
    public int f335827h = C0966R.raw.finder_bgm_gif_first_page;

    /* renamed from: i */
    public int f335828i = C0966R.color.aef;

    /* renamed from: j */
    public int f335829j = C0966R.color.aem;

    /* renamed from: n */
    public int f335830n = C0966R.color.aeh;

    /* renamed from: o */
    public C32227p<? super Integer, ? super AudioCacheInfo, C13598b0> f335831o;

    /* renamed from: xh2.a$a */
    public class C112152a extends RecyclerView.C16631z {

        /* renamed from: xh2.a$a$a */
        public static final class C112153a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C112152a f335832d;

            /* renamed from: e */
            public final /* synthetic */ C112151a f335833e;

            /* renamed from: f */
            public final /* synthetic */ View f335834f;

            public C112153a(C112152a aVar, C112151a aVar2, View view) {
                this.f335832d = aVar;
                this.f335833e = aVar2;
                this.f335834f = view;
            }

            public final void onClick(View view) {
                C32227p<? super Integer, ? super AudioCacheInfo, C13598b0> pVar;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/recordvideo/ui/adapter/RecommendMusicAdapter$BaseViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                int j = this.f335832d.mo17363j();
                AudioCacheInfo F4 = this.f335833e.mo163962F4(j);
                if (!(F4 == null || (pVar = this.f335833e.f335831o) == null)) {
                    pVar.invoke(Integer.valueOf(j), F4);
                }
                this.f335834f.requestFocus();
                C117292a.m165361g(this, "com/tencent/mm/plugin/recordvideo/ui/adapter/RecommendMusicAdapter$BaseViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112152a(C112151a aVar, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            view.setOnClickListener(new C112153a(this, aVar, view));
        }

        /* renamed from: y */
        public void mo163966y(int i, AudioCacheInfo audioCacheInfo) {
            C87412m.m108594g(audioCacheInfo, "info");
        }
    }

    /* renamed from: xh2.a$b */
    public final class C112154b extends C112152a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112154b(C112151a aVar, View view) {
            super(aVar, view);
            C87412m.m108594g(view, "itemView");
        }
    }

    /* renamed from: xh2.a$c */
    public final class C112155c extends C112152a {

        /* renamed from: A */
        public final WeImageView f335835A;

        /* renamed from: B */
        public final MusicLrcView f335836B;

        /* renamed from: C */
        public final AudioWaveView f335837C;

        /* renamed from: D */
        public final ImageView f335838D;

        /* renamed from: E */
        public final /* synthetic */ C112151a f335839E;

        /* renamed from: z */
        public final View f335840z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112155c(C112151a aVar, View view) {
            super(aVar, view);
            C87412m.m108594g(view, "itemView");
            this.f335839E = aVar;
            View findViewById = view.findViewById(C0966R.C0970id.k7m);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…story_item_audio_loading)");
            this.f335840z = findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.k7n);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.…story_item_audio_preview)");
            this.f335835A = (WeImageView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.k7x);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.id.story_item_audio_title)");
            this.f335836B = (MusicLrcView) findViewById3;
            View findViewById4 = view.findViewById(C0966R.C0970id.lko);
            C87412m.m108593f(findViewById4, "itemView.findViewById(R.id.waveView)");
            this.f335837C = (AudioWaveView) findViewById4;
            View findViewById5 = view.findViewById(C0966R.C0970id.k7l);
            C87412m.m108593f(findViewById5, "itemView.findViewById(R.…_item_audio_finder_cover)");
            this.f335838D = (ImageView) findViewById5;
        }

        /* renamed from: y */
        public void mo163966y(int i, AudioCacheInfo audioCacheInfo) {
            String str;
            C87412m.m108594g(audioCacheInfo, "info");
            View view = this.f44854d;
            view.setBackground(C76577a.m92158i(view.getContext(), this.f335839E.f335826g));
            ViewGroup.LayoutParams layoutParams = this.f44854d.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = C76577a.m92145A(this.f44854d.getContext()) - C76577a.m92151b(this.f44854d.getContext(), 80);
            }
            boolean z = true;
            this.f44854d.setEnabled(true);
            boolean z2 = i == this.f335839E.f335824e;
            this.f44854d.setSelected(z2);
            Log.m105924i("MicroMsg.RecommendMusicAdapter", "LogStory: " + z2);
            this.f335837C.setVisibility(0);
            AudioWaveView audioWaveView = this.f335837C;
            ColorStateList e = C76577a.m92154e(this.f44854d.getContext(), this.f335839E.f335829j);
            C87412m.m108593f(e, "getColorStateList(itemVi…ntext, recWaveColorResId)");
            audioWaveView.setColor(e);
            this.f335837C.setShow(z2);
            Drawable i2 = C76577a.m92158i(this.f44854d.getContext(), this.f335839E.f335827h);
            ColorStateList e2 = C76577a.m92154e(this.f44854d.getContext(), this.f335839E.f335828i);
            this.f335835A.setImageDrawable(i2);
            WeImageView weImageView = this.f335835A;
            weImageView.setIconColor(e2.getColorForState(weImageView.getDrawableState(), 0));
            this.f335835A.setVisibility(0);
            this.f335836B.setTextColor(C76577a.m92154e(this.f44854d.getContext(), this.f335839E.f335830n));
            ArrayList<AudioCacheInfo.C57170c> arrayList = audioCacheInfo.f163815g;
            if (arrayList == null || arrayList.isEmpty()) {
                MusicLrcView musicLrcView = this.f335836B;
                if (audioCacheInfo.f163816h.isEmpty()) {
                    str = audioCacheInfo.f163825t;
                } else {
                    str = audioCacheInfo.f163825t + " - " + Util.listToString(audioCacheInfo.f163816h, ",");
                }
                musicLrcView.setText(str);
                this.f335836B.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                this.f335836B.setMarqueeRepeatLimit(-1);
                MusicLrcView.m142616c(this.f335836B, false, 0, 2, (Object) null);
            } else {
                this.f335836B.mo151499a(audioCacheInfo.f163815g, (String) null);
                this.f335836B.setEllipsize((TextUtils.TruncateAt) null);
                MusicLrcView.m142616c(this.f335836B, z2, 0, 2, (Object) null);
            }
            this.f335836B.setVisibility(0);
            View view2 = this.f335840z;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/recordvideo/ui/adapter/RecommendMusicAdapter$RecommendMusicViewHolder", "update", "(ILcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/recordvideo/ui/adapter/RecommendMusicAdapter$RecommendMusicViewHolder", "update", "(ILcom/tencent/mm/plugin/recordvideo/model/audio/AudioCacheInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (audioCacheInfo.f163827v.length() <= 0) {
                z = false;
            }
            if (z) {
                this.f335838D.setVisibility(0);
                C20828a.m22825b().mo32518g(audioCacheInfo.f163827v, this.f335838D);
                return;
            }
            this.f335838D.setVisibility(8);
        }
    }

    /* renamed from: xh2.a$d */
    public final class C112156d extends C112152a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112156d(C112151a aVar, View view) {
            super(aVar, view);
            C87412m.m108594g(view, "itemView");
        }
    }

    /* renamed from: xh2.a$e */
    public final class C112157e extends C112152a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112157e(C112151a aVar, View view) {
            super(aVar, view);
            C87412m.m108594g(view, "itemView");
        }
    }

    /* renamed from: xh2.a$f */
    public final class C112158f extends C112152a {

        /* renamed from: A */
        public final TextView f335841A;

        /* renamed from: B */
        public final MusicLrcView f335842B;

        /* renamed from: C */
        public final int f335843C;

        /* renamed from: D */
        public final /* synthetic */ C112151a f335844D;

        /* renamed from: z */
        public final WeImageView f335845z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112158f(C112151a aVar, View view) {
            super(aVar, view);
            C87412m.m108594g(view, "itemView");
            this.f335844D = aVar;
            View findViewById = view.findViewById(C0966R.C0970id.k7s);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…audio_search_result_icon)");
            this.f335845z = (WeImageView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.k7u);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.…udio_search_result_title)");
            this.f335841A = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.k7t);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.…_audio_search_result_tip)");
            this.f335842B = (MusicLrcView) findViewById3;
            this.f335843C = C76577a.m92153d(view.getContext(), C0966R.color.ahy);
        }

        /* renamed from: y */
        public void mo163966y(int i, AudioCacheInfo audioCacheInfo) {
            String str;
            C87412m.m108594g(audioCacheInfo, "info");
            boolean z = i == this.f335844D.f335824e;
            this.f44854d.setSelected(z);
            Drawable i2 = C76577a.m92158i(this.f44854d.getContext(), this.f335844D.f335827h);
            ColorStateList e = C76577a.m92154e(this.f44854d.getContext(), C0966R.color.aef);
            this.f335845z.setImageDrawable(i2);
            WeImageView weImageView = this.f335845z;
            weImageView.setIconColor(e.getColorForState(weImageView.getDrawableState(), 0));
            if (audioCacheInfo.f163816h.isEmpty()) {
                str = audioCacheInfo.f163825t;
            } else {
                str = audioCacheInfo.f163825t + " - " + Util.listToString(audioCacheInfo.f163816h, ",");
            }
            this.f335841A.setText(MusicLrcView.f315656o.mo151509a(str, this.f335844D.f335825f, this.f335843C));
            this.f335842B.mo151499a(audioCacheInfo.f163815g, this.f335844D.f335825f);
            MusicLrcView.m142616c(this.f335842B, z, 0, 2, (Object) null);
            View findViewById = this.f44854d.findViewById(C0966R.C0970id.k7r);
            if (findViewById != null) {
                findViewById.setTag(C0966R.C0970id.d3q, str);
            }
        }
    }

    /* renamed from: F4 */
    public final AudioCacheInfo mo163962F4(int i) {
        return (AudioCacheInfo) C110818d0.m150917O(this.f335823d, i);
    }

    /* renamed from: G4 */
    public final void mo163963G4(Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        if (!(num == null || num.intValue() == 0)) {
            this.f335826g = num.intValue();
        }
        if (!(num2 == null || num2.intValue() == 0)) {
            this.f335827h = num2.intValue();
        }
        if (!(num3 == null || num3.intValue() == 0)) {
            this.f335828i = num3.intValue();
        }
        if (!(num4 == null || num4.intValue() == 0)) {
            this.f335829j = num4.intValue();
        }
        if (num5 != null && num5.intValue() != 0) {
            this.f335830n = num5.intValue();
        }
    }

    /* renamed from: O4 */
    public final void mo163964O4(Integer num) {
        if (num == null) {
            notifyItemChanged(this.f335824e);
            this.f335824e = -1;
            notifyItemChanged(-1);
            return;
        }
        notifyItemChanged(this.f335824e);
        int intValue = num.intValue();
        this.f335824e = intValue;
        notifyItemChanged(intValue);
    }

    /* renamed from: g5 */
    public final void mo163965g5(List<AudioCacheInfo> list) {
        C87412m.m108594g(list, "audios");
        this.f335823d.clear();
        this.f335823d.addAll(list);
        this.f335824e = -1;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f335823d.size();
    }

    public int getItemViewType(int i) {
        AudioCacheInfo F4 = mo163962F4(i);
        if (F4 != null) {
            return F4.f163820o;
        }
        return 1;
    }

    public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
        int i2;
        C112152a aVar = (C112152a) zVar;
        C87412m.m108594g(aVar, "holder");
        AudioCacheInfo F4 = mo163962F4(aVar.f44857g);
        C60863m mVar = C60863m.f173404c;
        mVar.mo85772f(F4);
        AudioCacheInfo F42 = mo163962F4(i);
        C87412m.m108591d(F42);
        if (!F42.f163818j && ((i2 = F42.f163820o) == 1 || i2 == 3)) {
            Context context = aVar.f44854d.getContext();
            C87412m.m108593f(context, "holder.itemView.context");
            mVar.mo85768b(context, F42, new C66280b(F42));
        }
        aVar.mo163966y(i, F42);
    }

    public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C87412m.m108594g(viewGroup, "parent");
        if (i == 2) {
            View inflate = C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.f360026c72, viewGroup, false);
            C87412m.m108593f(inflate, "getInflater(parent.conte…_entrance, parent, false)");
            return new C112156d(this, inflate);
        } else if (i == 3) {
            View inflate2 = C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.c74, viewGroup, false);
            C87412m.m108593f(inflate2, "getInflater(parent.conte…ch_result, parent, false)");
            return new C112158f(this, inflate2);
        } else if (i == 4) {
            View inflate3 = C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.f360025c71, viewGroup, false);
            C87412m.m108593f(inflate3, "getInflater(parent.conte…o_loading, parent, false)");
            return new C112154b(this, inflate3);
        } else if (i == 5) {
            View inflate4 = C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.f360027c73, viewGroup, false);
            C87412m.m108593f(inflate4, "getInflater(parent.conte…h_loading, parent, false)");
            return new C112157e(this, inflate4);
        } else {
            View inflate5 = C85868k2.m106137b(viewGroup.getContext()).inflate(C0966R.C0971layout.f360024c70, viewGroup, false);
            C87412m.m108593f(inflate5, "getInflater(parent.conte…tem_audio, parent, false)");
            return new C112155c(this, inflate5);
        }
    }
}

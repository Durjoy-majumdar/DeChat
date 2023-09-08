package qj1;

import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.live.view.FinderMarqueeTextView;
import org.libpag.PAGFile;
import org.libpag.PAGView;

/* renamed from: qj1.te */
public final class C12675te<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C12625qe f36307d;

    public C12675te(C12625qe qeVar) {
        this.f36307d = qeVar;
    }

    public void onChanged(Object obj) {
        String str = (String) obj;
        C12625qe qeVar = this.f36307d;
        WeImageView weImageView = (WeImageView) qeVar.f36185p.findViewById(C0966R.C0970id.mvt);
        PAGView pAGView = (PAGView) qeVar.f36185p.findViewById(C0966R.C0970id.f359213mw3);
        if (pAGView != null) {
            pAGView.setComposition(PAGFile.Load(qeVar.f36185p.getContext().getAssets(), "finder_live_sing_song_play.pag"));
        }
        if (pAGView != null) {
            pAGView.setRepeatCount(0);
        }
        FinderMarqueeTextView finderMarqueeTextView = (FinderMarqueeTextView) qeVar.f36185p.findViewById(C0966R.C0970id.mw4);
        finderMarqueeTextView.setMaxWidth((int) (finderMarqueeTextView.getTextSize() * ((float) 6)));
        if (str == null || str.length() == 0) {
            weImageView.setIconColor(qeVar.f36185p.getContext().getResources().getColor(C0966R.color.al_));
            finderMarqueeTextView.setText(qeVar.f166287d.getContext().getResources().getString(C0966R.string.mc9));
            finderMarqueeTextView.setTextColor(qeVar.f36185p.getContext().getResources().getColor(C0966R.color.al_));
            weImageView.setVisibility(0);
            pAGView.setVisibility(8);
        } else {
            if (qeVar.f36187r) {
                weImageView.setVisibility(8);
                pAGView.setVisibility(0);
                if (!pAGView.isPlaying()) {
                    pAGView.play();
                }
            } else {
                weImageView.setVisibility(0);
                pAGView.setVisibility(8);
            }
            finderMarqueeTextView.setText(str);
        }
        finderMarqueeTextView.setSelected(true);
    }
}

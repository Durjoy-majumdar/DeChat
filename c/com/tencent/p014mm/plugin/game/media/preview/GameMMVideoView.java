package com.tencent.p014mm.plugin.game.media.preview;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.modelvideo.MMVideoView;

/* renamed from: com.tencent.mm.plugin.game.media.preview.GameMMVideoView */
public class GameMMVideoView extends MMVideoView {
    public GameMMVideoView(Context context) {
        super(context);
    }

    /* renamed from: N */
    public boolean mo129178N() {
        return false;
    }

    /* renamed from: R */
    public void mo129179R() {
        super.mo129179R();
    }

    public String getFilePath() {
        return this.f267504p0;
    }

    public String getMediaId() {
        return super.getMediaId();
    }

    /* renamed from: k */
    public void mo127239k() {
    }

    public void setFilepath(String str) {
        super.setFilepath(str);
    }

    public GameMMVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GameMMVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

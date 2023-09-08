package com.tencent.tavkit.composition.model;

import android.graphics.Matrix;
import com.tencent.tav.coremedia.CGRect;
import com.tencent.tav.coremedia.CMTimeRange;
import com.tencent.tavkit.composition.video.TAVAttachTimeRangeSourceEffect;
import com.tencent.tavkit.composition.video.TAVVideoEffect;
import com.tencent.tavkit.utils.C106943Utils;
import java.util.ArrayList;
import java.util.List;

public class TAVVideoConfiguration implements Cloneable {
    public static CGRect DEFAULT_VIDEO_FRAME;
    public static final CGRect FIX_RENDER_SIZE = new CGRect();
    public static final CGRect SOURCE_SIZE;
    private TAVVideoConfigurationContentMode contentMode = TAVVideoConfigurationContentMode.aspectFit;
    private List<TAVVideoEffect> effects = new ArrayList();
    private CGRect frame = DEFAULT_VIDEO_FRAME;
    private int preferRotation = 0;
    private Matrix transform = new Matrix();

    public enum TAVVideoConfigurationContentMode {
        aspectFit,
        aspectFill,
        scaleToFit
    }

    static {
        CGRect cGRect = new CGRect();
        SOURCE_SIZE = cGRect;
        DEFAULT_VIDEO_FRAME = cGRect;
    }

    public void addEffect(TAVVideoEffect tAVVideoEffect) {
        if (this.effects == null) {
            this.effects = new ArrayList();
        }
        this.effects.add(tAVVideoEffect);
    }

    public boolean frameEnable() {
        CGRect cGRect = this.frame;
        return (cGRect == null || cGRect == FIX_RENDER_SIZE || cGRect == SOURCE_SIZE || !C106943Utils.isRectValid(cGRect)) ? false : true;
    }

    public TAVVideoConfigurationContentMode getContentMode() {
        return this.contentMode;
    }

    public List<TAVVideoEffect> getEffects() {
        return this.effects;
    }

    public CGRect getFrame() {
        return this.frame;
    }

    public int getPreferRotation() {
        return this.preferRotation;
    }

    public Matrix getTransform() {
        return this.transform;
    }

    public void setContentMode(TAVVideoConfigurationContentMode tAVVideoConfigurationContentMode) {
        this.contentMode = tAVVideoConfigurationContentMode;
    }

    public void setEffects(List<TAVVideoEffect> list) {
        this.effects = list;
    }

    public void setFrame(CGRect cGRect) {
        this.frame = cGRect;
    }

    public void setPreferRotation(int i) {
        this.preferRotation = i;
    }

    public void setTransform(Matrix matrix) {
        this.transform = matrix;
    }

    public String toString() {
        return "TAVVideoConfiguration{contentMode=" + this.contentMode + ", frame=" + this.frame + ", transform=" + this.transform + '}';
    }

    public void updateTimeRange(CMTimeRange cMTimeRange) {
        List<TAVVideoEffect> list = this.effects;
        if (list != null) {
            for (TAVVideoEffect next : list) {
                if (next instanceof TAVAttachTimeRangeSourceEffect) {
                    ((TAVAttachTimeRangeSourceEffect) next).attachTimeRange(cMTimeRange);
                }
            }
        }
    }

    public TAVVideoConfiguration clone() {
        TAVVideoConfiguration tAVVideoConfiguration = new TAVVideoConfiguration();
        tAVVideoConfiguration.contentMode = this.contentMode;
        tAVVideoConfiguration.frame = this.frame;
        tAVVideoConfiguration.transform = this.transform;
        tAVVideoConfiguration.effects = new ArrayList(this.effects);
        tAVVideoConfiguration.preferRotation = this.preferRotation;
        return tAVVideoConfiguration;
    }
}

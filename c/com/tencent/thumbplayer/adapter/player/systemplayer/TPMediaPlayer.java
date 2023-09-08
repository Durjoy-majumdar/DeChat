package com.tencent.thumbplayer.adapter.player.systemplayer;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Handler;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.tencent.thumbplayer.core.common.TPSystemInfo;
import com.tencent.thumbplayer.utils.TPLogUtil;
import java.io.FileDescriptor;
import java.util.Map;

public class TPMediaPlayer extends MediaPlayer {
    private static final String TAG = "TPThumbPlayer[TPMediaPlayer.java]";

    public void finalize() {
        try {
            super.finalize();
        } catch (Exception e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
        }
    }

    public int getCurrentPosition() {
        try {
            return super.getCurrentPosition();
        } catch (Exception e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
            return 0;
        }
    }

    public int getDuration() {
        try {
            return super.getDuration();
        } catch (Exception e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
            return 0;
        }
    }

    public int getSelectedTrack(int i) {
        try {
            return super.getSelectedTrack(i);
        } catch (Exception e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
            return 0;
        }
    }

    public MediaPlayer.TrackInfo[] getTrackInfo() {
        try {
            return super.getTrackInfo();
        } catch (Exception e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
            return new MediaPlayer.TrackInfo[0];
        }
    }

    public int getVideoHeight() {
        try {
            return super.getVideoHeight();
        } catch (Exception e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
            return 0;
        }
    }

    public int getVideoWidth() {
        try {
            return super.getVideoWidth();
        } catch (Exception e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
            return 0;
        }
    }

    public void prepare() {
        try {
            super.prepare();
        } catch (Exception e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
        }
    }

    public void release() {
        try {
            if ("N1W".equalsIgnoreCase(TPSystemInfo.getDeviceName()) || "X909T".equalsIgnoreCase(TPSystemInfo.getDeviceName()) || "X909".equalsIgnoreCase(TPSystemInfo.getDeviceName()) || "N1T".equalsIgnoreCase(TPSystemInfo.getDeviceName())) {
                super.setOnPreparedListener((MediaPlayer.OnPreparedListener) null);
                super.setOnCompletionListener((MediaPlayer.OnCompletionListener) null);
                super.setOnErrorListener((MediaPlayer.OnErrorListener) null);
                super.setOnInfoListener((MediaPlayer.OnInfoListener) null);
                super.setOnBufferingUpdateListener((MediaPlayer.OnBufferingUpdateListener) null);
                super.setOnSeekCompleteListener((MediaPlayer.OnSeekCompleteListener) null);
                super.setOnVideoSizeChangedListener((MediaPlayer.OnVideoSizeChangedListener) null);
                ((Handler) getClass().getDeclaredField("mA2dpHandler").get(this)).removeCallbacksAndMessages((Object) null);
            }
        } catch (NoSuchFieldException e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
        } catch (IllegalAccessException e2) {
            TPLogUtil.m21895e(TAG, (Throwable) e2);
        }
        try {
            super.release();
        } catch (Exception e3) {
            TPLogUtil.m21895e(TAG, (Throwable) e3);
        }
    }

    public void reset() {
        try {
            super.reset();
        } catch (Exception e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
        }
    }

    public void setDataSource(Context context, Uri uri) {
        try {
            super.setDataSource(context, uri);
        } catch (Exception e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
        }
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        try {
            super.setDisplay(surfaceHolder);
        } catch (Exception e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
        }
    }

    public void setLooping(boolean z) {
        try {
            super.setLooping(z);
        } catch (Exception e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
        }
    }

    public void setPlaybackParams(PlaybackParams playbackParams) {
        try {
            super.setPlaybackParams(playbackParams);
        } catch (Exception e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
        }
    }

    public void setSurface(Surface surface) {
        try {
            super.setSurface(surface);
        } catch (Exception e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
        }
    }

    public void setVolume(float f, float f2) {
        try {
            super.setVolume(f, f2);
        } catch (Exception e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
        }
    }

    public void stop() {
        try {
            super.stop();
        } catch (Exception e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
        }
    }

    public void setDataSource(FileDescriptor fileDescriptor) {
        try {
            super.setDataSource(fileDescriptor);
        } catch (Exception e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
        }
    }

    public void setDataSource(Context context, Uri uri, Map<String, String> map) {
        try {
            super.setDataSource(context, uri, map);
        } catch (Exception e) {
            TPLogUtil.m21895e(TAG, (Throwable) e);
        }
    }
}

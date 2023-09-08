package com.tencent.tav.player;

import android.content.Context;
import android.media.AudioManager;

public class AudioFocusHelper {
    private AudioManager.OnAudioFocusChangeListener mAudioFocusListener;
    private AudioManager mAudioManager;
    private Context mContext;
    /* access modifiers changed from: private */
    public boolean mIsAudioFocus;
    /* access modifiers changed from: private */
    public Player mPlayer;

    public AudioFocusHelper(Context context, Player player) {
        this.mContext = context;
        this.mPlayer = player;
    }

    private void ensureAudioManager() {
        if (this.mAudioManager == null) {
            this.mAudioManager = (AudioManager) this.mContext.getSystemService("audio");
        }
    }

    private AudioManager.OnAudioFocusChangeListener getAudioFocusChangeListener() {
        if (this.mAudioFocusListener == null) {
            this.mAudioFocusListener = new AudioManager.OnAudioFocusChangeListener() {
                public void onAudioFocusChange(int i) {
                    if (AudioFocusHelper.this.mPlayer != null) {
                        if (i == -2) {
                            AudioFocusHelper.this.onAudioFocusLoss(true);
                        } else if (i == -1) {
                            AudioFocusHelper.this.onAudioFocusLoss(false);
                        } else if (i == 1) {
                            try {
                                boolean unused = AudioFocusHelper.this.mIsAudioFocus = true;
                            } catch (Exception unused2) {
                            }
                        }
                    }
                }
            };
        }
        return this.mAudioFocusListener;
    }

    /* access modifiers changed from: private */
    public void onAudioFocusLoss(boolean z) {
        if (!z) {
            this.mAudioManager.abandonAudioFocus(this.mAudioFocusListener);
            this.mIsAudioFocus = false;
        }
        Player player = this.mPlayer;
        if (player != null && player.isPlaying()) {
            this.mPlayer.pause();
        }
    }

    public void release() {
        AudioManager audioManager = this.mAudioManager;
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this.mAudioFocusListener);
            this.mAudioManager = null;
            this.mAudioFocusListener = null;
            this.mIsAudioFocus = false;
        }
        if (this.mPlayer != null) {
            this.mPlayer = null;
        }
    }

    public void requestFocus() {
        ensureAudioManager();
        if (!this.mIsAudioFocus) {
            boolean z = true;
            if (this.mAudioManager.requestAudioFocus(getAudioFocusChangeListener(), 3, 1) != 1) {
                z = false;
            }
            this.mIsAudioFocus = z;
        }
    }
}

package p172io.flutter.plugin.platform;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.activity.C103394c;
import java.io.FileNotFoundException;
import java.util.List;
import p172io.flutter.Log;
import p172io.flutter.embedding.engine.systemchannels.PlatformChannel;
import p849e3.C107192g0;

/* renamed from: io.flutter.plugin.platform.PlatformPlugin */
public class PlatformPlugin {
    public static final int DEFAULT_SYSTEM_UI = 1280;
    private static final String TAG = "PlatformPlugin";
    private final Activity activity;
    private PlatformChannel.SystemChromeStyle currentTheme;
    private int mEnabledOverlays;
    public final PlatformChannel.PlatformMessageHandler mPlatformMessageHandler;
    /* access modifiers changed from: private */
    public final PlatformChannel platformChannel;
    private final PlatformPluginDelegate platformPluginDelegate;

    /* renamed from: io.flutter.plugin.platform.PlatformPlugin$3 */
    public static /* synthetic */ class C246273 {

        /* renamed from: $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$Brightness */
        public static final /* synthetic */ int[] f70241xfa6fb21b;

        /* renamed from: $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType */
        public static final /* synthetic */ int[] f70242x98e77c60;

        /* renamed from: $SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay */
        public static final /* synthetic */ int[] f70243x4c113a23;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|15|16|17|18|19|20|21|22|(3:23|24|26)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0069 */
        static {
            /*
                io.flutter.embedding.engine.systemchannels.PlatformChannel$Brightness[] r0 = p172io.flutter.embedding.engine.systemchannels.PlatformChannel.Brightness.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f70241xfa6fb21b = r0
                r1 = 1
                io.flutter.embedding.engine.systemchannels.PlatformChannel$Brightness r2 = p172io.flutter.embedding.engine.systemchannels.PlatformChannel.Brightness.DARK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f70241xfa6fb21b     // Catch:{ NoSuchFieldError -> 0x001d }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$Brightness r3 = p172io.flutter.embedding.engine.systemchannels.PlatformChannel.Brightness.LIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiOverlay[] r2 = p172io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f70243x4c113a23 = r2
                io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiOverlay r3 = p172io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay.TOP_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f70243x4c113a23     // Catch:{ NoSuchFieldError -> 0x0038 }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$SystemUiOverlay r3 = p172io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay.BOTTOM_OVERLAYS     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                io.flutter.embedding.engine.systemchannels.PlatformChannel$HapticFeedbackType[] r2 = p172io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f70242x98e77c60 = r2
                io.flutter.embedding.engine.systemchannels.PlatformChannel$HapticFeedbackType r3 = p172io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.STANDARD     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r1 = f70242x98e77c60     // Catch:{ NoSuchFieldError -> 0x0053 }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$HapticFeedbackType r2 = p172io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.LIGHT_IMPACT     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                int[] r0 = f70242x98e77c60     // Catch:{ NoSuchFieldError -> 0x005e }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$HapticFeedbackType r1 = p172io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.MEDIUM_IMPACT     // Catch:{ NoSuchFieldError -> 0x005e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                int[] r0 = f70242x98e77c60     // Catch:{ NoSuchFieldError -> 0x0069 }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$HapticFeedbackType r1 = p172io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.HEAVY_IMPACT     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r0 = f70242x98e77c60     // Catch:{ NoSuchFieldError -> 0x0074 }
                io.flutter.embedding.engine.systemchannels.PlatformChannel$HapticFeedbackType r1 = p172io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType.SELECTION_CLICK     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p172io.flutter.plugin.platform.PlatformPlugin.C246273.<clinit>():void");
        }
    }

    /* renamed from: io.flutter.plugin.platform.PlatformPlugin$PlatformPluginDelegate */
    public interface PlatformPluginDelegate {
        boolean popSystemNavigator();
    }

    public PlatformPlugin(Activity activity2, PlatformChannel platformChannel2) {
        this(activity2, platformChannel2, (PlatformPluginDelegate) null);
    }

    /* access modifiers changed from: private */
    public boolean clipboardHasStrings() {
        ClipDescription primaryClipDescription;
        ClipboardManager clipboardManager = (ClipboardManager) this.activity.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* access modifiers changed from: private */
    public CharSequence getClipboardData(PlatformChannel.ClipboardContentFormat clipboardContentFormat) {
        ClipboardManager clipboardManager = (ClipboardManager) this.activity.getSystemService("clipboard");
        if (!clipboardManager.hasPrimaryClip()) {
            return null;
        }
        try {
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            if (primaryClip == null) {
                return null;
            }
            if (clipboardContentFormat != null) {
                if (clipboardContentFormat != PlatformChannel.ClipboardContentFormat.PLAIN_TEXT) {
                    return null;
                }
            }
            ClipData.Item itemAt = primaryClip.getItemAt(0);
            if (itemAt.getUri() != null) {
                this.activity.getContentResolver().openTypedAssetFileDescriptor(itemAt.getUri(), "text/*", (Bundle) null);
            }
            return itemAt.coerceToText(this.activity);
        } catch (SecurityException e) {
            Log.m165293w(TAG, "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e);
            return null;
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    public void playSystemSound(PlatformChannel.SoundType soundType) {
        if (soundType == PlatformChannel.SoundType.CLICK) {
            this.activity.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* access modifiers changed from: private */
    public void popSystemNavigator() {
        PlatformPluginDelegate platformPluginDelegate2 = this.platformPluginDelegate;
        if (platformPluginDelegate2 == null || !platformPluginDelegate2.popSystemNavigator()) {
            Activity activity2 = this.activity;
            if (activity2 instanceof C103394c) {
                try {
                    ((C103394c) activity2).getOnBackPressedDispatcher().mo164667b();
                } catch (Exception unused) {
                }
            } else {
                activity2.finish();
            }
        }
    }

    /* access modifiers changed from: private */
    public void restoreSystemChromeSystemUIOverlays() {
        updateSystemUiOverlays();
    }

    /* access modifiers changed from: private */
    public void setClipboardData(String str) {
        ((ClipboardManager) this.activity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    /* access modifiers changed from: private */
    public void setSystemChromeApplicationSwitcherDescription(PlatformChannel.AppSwitcherDescription appSwitcherDescription) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28 && i > 21) {
            this.activity.setTaskDescription(new ActivityManager.TaskDescription(appSwitcherDescription.label, (Bitmap) null, appSwitcherDescription.color));
        }
        if (i >= 28) {
            this.activity.setTaskDescription(new ActivityManager.TaskDescription(appSwitcherDescription.label, 0, appSwitcherDescription.color));
        }
    }

    /* access modifiers changed from: private */
    public void setSystemChromeChangeListener() {
        this.activity.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() {
            public void onSystemUiVisibilityChange(int i) {
                if ((i & 4) == 0) {
                    PlatformPlugin.this.platformChannel.systemChromeChanged(false);
                } else {
                    PlatformPlugin.this.platformChannel.systemChromeChanged(true);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void setSystemChromeEnabledSystemUIMode(PlatformChannel.SystemUiMode systemUiMode) {
        int i;
        if (systemUiMode == PlatformChannel.SystemUiMode.LEAN_BACK) {
            i = 1798;
        } else if (systemUiMode == PlatformChannel.SystemUiMode.IMMERSIVE) {
            i = 3846;
        } else if (systemUiMode == PlatformChannel.SystemUiMode.IMMERSIVE_STICKY) {
            i = 5894;
        } else if (systemUiMode == PlatformChannel.SystemUiMode.EDGE_TO_EDGE && Build.VERSION.SDK_INT >= 29) {
            i = 1792;
        } else {
            return;
        }
        this.mEnabledOverlays = i;
        updateSystemUiOverlays();
    }

    /* access modifiers changed from: private */
    public void setSystemChromeEnabledSystemUIOverlays(List<PlatformChannel.SystemUiOverlay> list) {
        int i = list.size() == 0 ? 5894 : 1798;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int i3 = C246273.f70243x4c113a23[list.get(i2).ordinal()];
            if (i3 == 1) {
                i &= -5;
            } else if (i3 == 2) {
                i = i & -513 & -3;
            }
        }
        this.mEnabledOverlays = i;
        updateSystemUiOverlays();
    }

    /* access modifiers changed from: private */
    public void setSystemChromePreferredOrientations(int i) {
        this.activity.setRequestedOrientation(i);
    }

    /* access modifiers changed from: private */
    public void setSystemChromeSystemUIOverlayStyle(PlatformChannel.SystemChromeStyle systemChromeStyle) {
        Window window = this.activity.getWindow();
        C107192g0 g0Var = new C107192g0(window, window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            PlatformChannel.Brightness brightness = systemChromeStyle.statusBarIconBrightness;
            if (brightness != null) {
                int i2 = C246273.f70241xfa6fb21b[brightness.ordinal()];
                if (i2 == 1) {
                    g0Var.f320795a.mo136862b(true);
                } else if (i2 == 2) {
                    g0Var.f320795a.mo136862b(false);
                }
            }
            Integer num = systemChromeStyle.statusBarColor;
            if (num != null) {
                window.setStatusBarColor(num.intValue());
            }
        }
        Boolean bool = systemChromeStyle.systemStatusBarContrastEnforced;
        if (bool != null && i >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i >= 26) {
            PlatformChannel.Brightness brightness2 = systemChromeStyle.systemNavigationBarIconBrightness;
            if (brightness2 != null) {
                int i3 = C246273.f70241xfa6fb21b[brightness2.ordinal()];
                if (i3 == 1) {
                    g0Var.f320795a.mo136861a(true);
                } else if (i3 == 2) {
                    g0Var.f320795a.mo136861a(false);
                }
            }
            Integer num2 = systemChromeStyle.systemNavigationBarColor;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        if (systemChromeStyle.systemNavigationBarDividerColor != null && i >= 28) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(134217728);
            window.setNavigationBarDividerColor(systemChromeStyle.systemNavigationBarDividerColor.intValue());
        }
        Boolean bool2 = systemChromeStyle.systemNavigationBarContrastEnforced;
        if (bool2 != null && i >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.currentTheme = systemChromeStyle;
    }

    public void destroy() {
        this.platformChannel.setPlatformMessageHandler((PlatformChannel.PlatformMessageHandler) null);
    }

    public void updateSystemUiOverlays() {
        this.activity.getWindow().getDecorView().setSystemUiVisibility(this.mEnabledOverlays);
        PlatformChannel.SystemChromeStyle systemChromeStyle = this.currentTheme;
        if (systemChromeStyle != null) {
            setSystemChromeSystemUIOverlayStyle(systemChromeStyle);
        }
    }

    public void vibrateHapticFeedback(PlatformChannel.HapticFeedbackType hapticFeedbackType) {
        View decorView = this.activity.getWindow().getDecorView();
        int i = C246273.f70242x98e77c60[hapticFeedbackType.ordinal()];
        if (i == 1) {
            decorView.performHapticFeedback(0);
        } else if (i == 2) {
            decorView.performHapticFeedback(1);
        } else if (i == 3) {
            decorView.performHapticFeedback(3);
        } else if (i != 4) {
            if (i == 5) {
                decorView.performHapticFeedback(4);
            }
        } else if (Build.VERSION.SDK_INT >= 23) {
            decorView.performHapticFeedback(6);
        }
    }

    public PlatformPlugin(Activity activity2, PlatformChannel platformChannel2, PlatformPluginDelegate platformPluginDelegate2) {
        C246251 r0 = new PlatformChannel.PlatformMessageHandler() {
            public boolean clipboardHasStrings() {
                return PlatformPlugin.this.clipboardHasStrings();
            }

            public CharSequence getClipboardData(PlatformChannel.ClipboardContentFormat clipboardContentFormat) {
                return PlatformPlugin.this.getClipboardData(clipboardContentFormat);
            }

            public void playSystemSound(PlatformChannel.SoundType soundType) {
                PlatformPlugin.this.playSystemSound(soundType);
            }

            public void popSystemNavigator() {
                PlatformPlugin.this.popSystemNavigator();
            }

            public void restoreSystemUiOverlays() {
                PlatformPlugin.this.restoreSystemChromeSystemUIOverlays();
            }

            public void setApplicationSwitcherDescription(PlatformChannel.AppSwitcherDescription appSwitcherDescription) {
                PlatformPlugin.this.setSystemChromeApplicationSwitcherDescription(appSwitcherDescription);
            }

            public void setClipboardData(String str) {
                PlatformPlugin.this.setClipboardData(str);
            }

            public void setPreferredOrientations(int i) {
                PlatformPlugin.this.setSystemChromePreferredOrientations(i);
            }

            public void setSystemUiChangeListener() {
                PlatformPlugin.this.setSystemChromeChangeListener();
            }

            public void setSystemUiOverlayStyle(PlatformChannel.SystemChromeStyle systemChromeStyle) {
                PlatformPlugin.this.setSystemChromeSystemUIOverlayStyle(systemChromeStyle);
            }

            public void showSystemOverlays(List<PlatformChannel.SystemUiOverlay> list) {
                PlatformPlugin.this.setSystemChromeEnabledSystemUIOverlays(list);
            }

            public void showSystemUiMode(PlatformChannel.SystemUiMode systemUiMode) {
                PlatformPlugin.this.setSystemChromeEnabledSystemUIMode(systemUiMode);
            }

            public void vibrateHapticFeedback(PlatformChannel.HapticFeedbackType hapticFeedbackType) {
                PlatformPlugin.this.vibrateHapticFeedback(hapticFeedbackType);
            }
        };
        this.mPlatformMessageHandler = r0;
        this.activity = activity2;
        this.platformChannel = platformChannel2;
        platformChannel2.setPlatformMessageHandler(r0);
        this.platformPluginDelegate = platformPluginDelegate2;
        this.mEnabledOverlays = 1280;
    }
}

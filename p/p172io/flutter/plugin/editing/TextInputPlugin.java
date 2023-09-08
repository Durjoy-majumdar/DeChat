package p172io.flutter.plugin.editing;

import android.content.ContentResolver;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.tencent.p014mm.sdk.platformtools.StartupILogsReport;
import com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel;
import j20.C117292a;
import java.util.HashMap;
import k20.C9556a;
import p172io.flutter.Log;
import p172io.flutter.embedding.android.KeyboardManager;
import p172io.flutter.embedding.engine.systemchannels.TextInputChannel;
import p172io.flutter.plugin.editing.ListenableEditingState;
import p172io.flutter.plugin.platform.PlatformViewsController;

/* renamed from: io.flutter.plugin.editing.TextInputPlugin */
public class TextInputPlugin implements ListenableEditingState.EditingStateWatcher {
    private static final String TAG = "TextInputPlugin";
    /* access modifiers changed from: private */
    public final AutofillManager afm;
    private TextInputChannel.Configuration configuration;
    private ImeSyncDeferringInsetsCallback imeSyncCallback;
    /* access modifiers changed from: private */
    public InputTarget inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
    private Rect lastClientRect;
    private InputConnection lastInputConnection;
    private SparseArray<TextInputChannel.Configuration> mAutofillConfigurations;
    private ListenableEditingState mEditable;
    private final InputMethodManager mImm;
    private TextInputChannel.TextEditState mLastKnownFrameworkTextEditingState;
    private boolean mRestartInputPending;
    /* access modifiers changed from: private */
    public final View mView;
    /* access modifiers changed from: private */
    public TextInputChannel.WxInputConfiguration mWxInputConfiguration;
    /* access modifiers changed from: private */
    public WxKeyboardAction mWxKeyboardAction;
    private PlatformViewsController platformViewsController;
    private final TextInputChannel textInputChannel;

    /* renamed from: io.flutter.plugin.editing.TextInputPlugin$InputTarget */
    public static class InputTarget {

        /* renamed from: id */
        public int f324800id;
        public Type type;

        /* renamed from: io.flutter.plugin.editing.TextInputPlugin$InputTarget$Type */
        public enum Type {
            NO_TARGET,
            FRAMEWORK_CLIENT,
            PLATFORM_VIEW
        }

        public InputTarget(Type type2, int i) {
            this.type = type2;
            this.f324800id = i;
        }
    }

    /* renamed from: io.flutter.plugin.editing.TextInputPlugin$MinMax */
    public interface MinMax {
        void inspect(double d, double d2);
    }

    public TextInputPlugin(View view, TextInputChannel textInputChannel2, PlatformViewsController platformViewsController2) {
        int i = 0;
        this.mView = view;
        this.mEditable = new ListenableEditingState((TextInputChannel.TextEditState) null, view);
        this.mImm = (InputMethodManager) view.getContext().getSystemService("input_method");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.afm = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        } else {
            this.afm = null;
        }
        if (i2 >= 30) {
            i = (view.getWindowSystemUiVisibility() & 2) == 0 ? 0 | WindowInsets.Type.navigationBars() : i;
            ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = new ImeSyncDeferringInsetsCallback(view, (view.getWindowSystemUiVisibility() & 4) == 0 ? i | WindowInsets.Type.statusBars() : i, WindowInsets.Type.ime());
            this.imeSyncCallback = imeSyncDeferringInsetsCallback;
            imeSyncDeferringInsetsCallback.install();
        }
        this.textInputChannel = textInputChannel2;
        textInputChannel2.setTextInputMethodHandler(new TextInputChannel.TextInputMethodHandler() {
            public void clearClient() {
                TextInputPlugin.this.clearTextInputClient();
            }

            public void finishAutofillContext(boolean z) {
                if (Build.VERSION.SDK_INT >= 26 && TextInputPlugin.this.afm != null) {
                    if (z) {
                        TextInputPlugin.this.afm.commit();
                    } else {
                        TextInputPlugin.this.afm.cancel();
                    }
                }
            }

            public void hide() {
                if (TextInputPlugin.this.inputTarget.type == InputTarget.Type.PLATFORM_VIEW) {
                    TextInputPlugin.this.notifyViewExited();
                } else if (TextInputPlugin.this.mWxKeyboardAction == null || !TextInputPlugin.this.mWxKeyboardAction.hideKeyboard()) {
                    TextInputPlugin textInputPlugin = TextInputPlugin.this;
                    textInputPlugin.hideTextInput(textInputPlugin.mView);
                }
            }

            public void requestAutofill() {
                TextInputPlugin.this.notifyViewEntered();
            }

            public void sendAppPrivateCommand(String str, Bundle bundle) {
                TextInputPlugin.this.sendTextInputAppPrivateCommand(str, bundle);
            }

            public void setClient(int i, TextInputChannel.Configuration configuration) {
                TextInputPlugin.this.setTextInputClient(i, configuration);
                TextInputChannel.WxInputConfiguration unused = TextInputPlugin.this.mWxInputConfiguration = configuration.wxInputConfiguration;
            }

            public void setEditableSizeAndTransform(double d, double d2, double[] dArr) {
                TextInputPlugin.this.saveEditableSizeAndTransform(d, d2, dArr);
            }

            public void setEditingState(TextInputChannel.TextEditState textEditState) {
                TextInputPlugin textInputPlugin = TextInputPlugin.this;
                textInputPlugin.setTextInputEditingState(textInputPlugin.mView, textEditState);
            }

            public void setPlatformViewClient(int i) {
                TextInputPlugin.this.setPlatformViewTextInputClient(i);
            }

            public void show() {
                if (TextInputPlugin.this.mWxKeyboardAction == null || !TextInputPlugin.this.mWxKeyboardAction.showKeyboard(TextInputPlugin.this.mView, TextInputPlugin.this.mWxInputConfiguration)) {
                    TextInputPlugin textInputPlugin = TextInputPlugin.this;
                    textInputPlugin.showTextInput(textInputPlugin.mView);
                }
            }
        });
        textInputChannel2.requestExistingInputState();
        this.platformViewsController = platformViewsController2;
        platformViewsController2.attachTextInputPlugin(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.inputType;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean canShowTextInput() {
        /*
            r3 = this;
            io.flutter.embedding.engine.systemchannels.TextInputChannel$Configuration r0 = r3.configuration
            r1 = 1
            if (r0 == 0) goto L_0x0012
            io.flutter.embedding.engine.systemchannels.TextInputChannel$InputType r0 = r0.inputType
            if (r0 != 0) goto L_0x000a
            goto L_0x0012
        L_0x000a:
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputType r0 = r0.type
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputType r2 = p172io.flutter.embedding.engine.systemchannels.TextInputChannel.TextInputType.NONE
            if (r0 == r2) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p172io.flutter.plugin.editing.TextInputPlugin.canShowTextInput():boolean");
    }

    private static boolean composingChanged(TextInputChannel.TextEditState textEditState, TextInputChannel.TextEditState textEditState2) {
        int i = textEditState.composingEnd - textEditState.composingStart;
        if (i != textEditState2.composingEnd - textEditState2.composingStart) {
            return true;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (textEditState.text.charAt(textEditState.composingStart + i2) != textEditState2.text.charAt(textEditState2.composingStart + i2)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public void hideTextInput(View view) {
        notifyViewExited();
        this.mImm.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
    }

    private static int inputTypeFromTextInputType(TextInputChannel.InputType inputType, boolean z, boolean z2, boolean z3, boolean z4, TextInputChannel.TextCapitalization textCapitalization) {
        TextInputChannel.TextInputType textInputType = inputType.type;
        if (textInputType == TextInputChannel.TextInputType.DATETIME) {
            return 4;
        }
        if (textInputType == TextInputChannel.TextInputType.NUMBER) {
            int i = 2;
            if (inputType.isSigned) {
                i = 4098;
            }
            return inputType.isDecimal ? i | 8192 : i;
        } else if (textInputType == TextInputChannel.TextInputType.PHONE) {
            return 3;
        } else {
            if (textInputType == TextInputChannel.TextInputType.NONE) {
                return 0;
            }
            int i2 = 1;
            if (textInputType == TextInputChannel.TextInputType.MULTILINE) {
                i2 = StartupILogsReport.TYPEID_FIRST_UI_SHOWN_MISC_JSON;
            } else if (textInputType == TextInputChannel.TextInputType.EMAIL_ADDRESS) {
                i2 = 33;
            } else if (textInputType == TextInputChannel.TextInputType.URL) {
                i2 = 17;
            } else if (textInputType == TextInputChannel.TextInputType.VISIBLE_PASSWORD) {
                i2 = 145;
            } else if (textInputType == TextInputChannel.TextInputType.NAME) {
                i2 = 97;
            } else if (textInputType == TextInputChannel.TextInputType.POSTAL_ADDRESS) {
                i2 = 113;
            }
            if (z) {
                i2 = i2 | 524288 | 128;
            } else {
                if (z2) {
                    i2 |= 32768;
                }
                if (!z3) {
                    i2 |= 524288;
                }
            }
            return textCapitalization == TextInputChannel.TextCapitalization.CHARACTERS ? i2 | 4096 : textCapitalization == TextInputChannel.TextCapitalization.WORDS ? i2 | 8192 : textCapitalization == TextInputChannel.TextCapitalization.SENTENCES ? i2 | 16384 : i2;
        }
    }

    private boolean isRestartAlwaysRequired() {
        if (this.mImm.getCurrentInputMethodSubtype() == null || !Build.MANUFACTURER.equals("samsung")) {
            return false;
        }
        ContentResolver contentResolver = this.mView.getContext().getContentResolver();
        C9556a aVar = new C9556a();
        aVar.mo10233c("default_input_method");
        aVar.mo10233c(contentResolver);
        String str = (String) C117292a.m165364j(new Object(), aVar.mo10232b(), "io/flutter/plugin/editing/TextInputPlugin", "isRestartAlwaysRequired", "()Z", "android/provider/Settings$Secure", "getString", "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
        if (str == null) {
            return false;
        }
        return str.contains("Samsung");
    }

    private boolean needsAutofill() {
        return this.mAutofillConfigurations != null;
    }

    private void notifyValueChanged(String str) {
        if (Build.VERSION.SDK_INT >= 26 && this.afm != null && needsAutofill()) {
            this.afm.notifyValueChanged(this.mView, this.configuration.autofill.uniqueIdentifier.hashCode(), AutofillValue.forText(str));
        }
    }

    /* access modifiers changed from: private */
    public void notifyViewEntered() {
        if (Build.VERSION.SDK_INT >= 26 && this.afm != null && needsAutofill()) {
            String str = this.configuration.autofill.uniqueIdentifier;
            int[] iArr = new int[2];
            this.mView.getLocationOnScreen(iArr);
            Rect rect = new Rect(this.lastClientRect);
            rect.offset(iArr[0], iArr[1]);
            this.afm.notifyViewEntered(this.mView, str.hashCode(), rect);
        }
    }

    /* access modifiers changed from: private */
    public void notifyViewExited() {
        TextInputChannel.Configuration configuration2;
        if (Build.VERSION.SDK_INT >= 26 && this.afm != null && (configuration2 = this.configuration) != null && configuration2.autofill != null && needsAutofill()) {
            this.afm.notifyViewExited(this.mView, this.configuration.autofill.uniqueIdentifier.hashCode());
        }
    }

    /* access modifiers changed from: private */
    public void saveEditableSizeAndTransform(double d, double d2, double[] dArr) {
        double d3 = d;
        double d4 = d2;
        final double[] dArr2 = dArr;
        final double[] dArr3 = new double[4];
        final boolean z = dArr2[3] == 0.0d && dArr2[7] == 0.0d && dArr2[15] == 1.0d;
        double d5 = dArr2[12];
        double d6 = dArr2[15];
        double d7 = d5 / d6;
        dArr3[1] = d7;
        dArr3[0] = d7;
        double d8 = dArr2[13] / d6;
        dArr3[3] = d8;
        dArr3[2] = d8;
        C1084772 r102 = new MinMax() {
            public void inspect(double d, double d2) {
                double d3 = 1.0d;
                if (!z) {
                    double[] dArr = dArr2;
                    d3 = 1.0d / (((dArr[3] * d) + (dArr[7] * d2)) + dArr[15]);
                }
                double[] dArr2 = dArr2;
                double d4 = ((dArr2[0] * d) + (dArr2[4] * d2) + dArr2[12]) * d3;
                double d5 = ((dArr2[1] * d) + (dArr2[5] * d2) + dArr2[13]) * d3;
                double[] dArr3 = dArr3;
                if (d4 < dArr3[0]) {
                    dArr3[0] = d4;
                } else if (d4 > dArr3[1]) {
                    dArr3[1] = d4;
                }
                if (d5 < dArr3[2]) {
                    dArr3[2] = d5;
                } else if (d5 > dArr3[3]) {
                    dArr3[3] = d5;
                }
            }
        };
        r102.inspect(d3, 0.0d);
        r102.inspect(d3, d4);
        r102.inspect(0.0d, d4);
        Float valueOf = Float.valueOf(this.mView.getContext().getResources().getDisplayMetrics().density);
        this.lastClientRect = new Rect((int) (dArr3[0] * ((double) valueOf.floatValue())), (int) (dArr3[2] * ((double) valueOf.floatValue())), (int) Math.ceil(dArr3[1] * ((double) valueOf.floatValue())), (int) Math.ceil(dArr3[3] * ((double) valueOf.floatValue())));
    }

    /* access modifiers changed from: private */
    public void setPlatformViewTextInputClient(int i) {
        this.inputTarget = new InputTarget(InputTarget.Type.PLATFORM_VIEW, i);
        this.lastInputConnection = null;
    }

    private void updateAutofillConfigurationIfNeeded(TextInputChannel.Configuration configuration2) {
        if (Build.VERSION.SDK_INT >= 26) {
            if (configuration2 == null || configuration2.autofill == null) {
                this.mAutofillConfigurations = null;
                return;
            }
            TextInputChannel.Configuration[] configurationArr = configuration2.fields;
            SparseArray<TextInputChannel.Configuration> sparseArray = new SparseArray<>();
            this.mAutofillConfigurations = sparseArray;
            if (configurationArr == null) {
                sparseArray.put(configuration2.autofill.uniqueIdentifier.hashCode(), configuration2);
                return;
            }
            for (TextInputChannel.Configuration configuration3 : configurationArr) {
                TextInputChannel.Configuration.Autofill autofill = configuration3.autofill;
                if (autofill != null) {
                    this.mAutofillConfigurations.put(autofill.uniqueIdentifier.hashCode(), configuration3);
                    this.afm.notifyValueChanged(this.mView, autofill.uniqueIdentifier.hashCode(), AutofillValue.forText(autofill.editState.text));
                }
            }
        }
    }

    public void autofill(SparseArray<AutofillValue> sparseArray) {
        TextInputChannel.Configuration.Autofill autofill;
        TextInputChannel.Configuration.Autofill autofill2;
        if (Build.VERSION.SDK_INT >= 26 && (autofill = this.configuration.autofill) != null) {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < sparseArray.size(); i++) {
                TextInputChannel.Configuration configuration2 = this.mAutofillConfigurations.get(sparseArray.keyAt(i));
                if (!(configuration2 == null || (autofill2 = configuration2.autofill) == null)) {
                    String charSequence = sparseArray.valueAt(i).getTextValue().toString();
                    TextInputChannel.TextEditState textEditState = new TextInputChannel.TextEditState(charSequence, charSequence.length(), charSequence.length(), -1, -1);
                    if (autofill2.uniqueIdentifier.equals(autofill.uniqueIdentifier)) {
                        this.mEditable.setEditingState(textEditState);
                    } else {
                        hashMap.put(autofill2.uniqueIdentifier, textEditState);
                    }
                }
            }
            this.textInputChannel.updateEditingStateWithTag(this.inputTarget.f324800id, hashMap);
        }
    }

    public void clearPlatformViewClient(int i) {
        InputTarget inputTarget2 = this.inputTarget;
        if (inputTarget2.type == InputTarget.Type.PLATFORM_VIEW && inputTarget2.f324800id == i) {
            this.inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
            notifyViewExited();
            this.mImm.hideSoftInputFromWindow(this.mView.getApplicationWindowToken(), 0);
            this.mImm.restartInput(this.mView);
            this.mRestartInputPending = false;
        }
    }

    public void clearTextInputClient() {
        this.mEditable.removeEditingStateListener(this);
        notifyViewExited();
        updateAutofillConfigurationIfNeeded((TextInputChannel.Configuration) null);
        this.inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, 0);
        this.lastClientRect = null;
    }

    public InputConnection createInputConnection(View view, KeyboardManager keyboardManager, EditorInfo editorInfo) {
        InputTarget.Type type = this.inputTarget.type;
        if (type == InputTarget.Type.NO_TARGET) {
            this.lastInputConnection = null;
            return null;
        } else if (type == InputTarget.Type.PLATFORM_VIEW) {
            return null;
        } else {
            TextInputChannel.Configuration configuration2 = this.configuration;
            int inputTypeFromTextInputType = inputTypeFromTextInputType(configuration2.inputType, configuration2.obscureText, configuration2.autocorrect, configuration2.enableSuggestions, configuration2.enableIMEPersonalizedLearning, configuration2.textCapitalization);
            editorInfo.inputType = inputTypeFromTextInputType;
            editorInfo.imeOptions = TPMediaCodecProfileLevel.HEVCHighTierLevel62;
            if (Build.VERSION.SDK_INT >= 26 && !this.configuration.enableIMEPersonalizedLearning) {
                editorInfo.imeOptions = 33554432 | TPMediaCodecProfileLevel.HEVCMainTierLevel62;
            }
            Integer num = this.configuration.inputAction;
            int intValue = num == null ? (inputTypeFromTextInputType & 131072) != 0 ? 1 : 6 : num.intValue();
            String str = this.configuration.actionLabel;
            if (str != null) {
                editorInfo.actionLabel = str;
                editorInfo.actionId = intValue;
            }
            editorInfo.imeOptions = intValue | editorInfo.imeOptions;
            InputConnectionAdaptor inputConnectionAdaptor = new InputConnectionAdaptor(view, this.inputTarget.f324800id, this.textInputChannel, keyboardManager, this.mEditable, editorInfo);
            editorInfo.initialSelStart = this.mEditable.getSelectionStart();
            editorInfo.initialSelEnd = this.mEditable.getSelectionEnd();
            this.lastInputConnection = inputConnectionAdaptor;
            return inputConnectionAdaptor;
        }
    }

    public void destroy() {
        this.platformViewsController.detachTextInputPlugin();
        this.textInputChannel.setTextInputMethodHandler((TextInputChannel.TextInputMethodHandler) null);
        notifyViewExited();
        this.mEditable.removeEditingStateListener(this);
        ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback = this.imeSyncCallback;
        if (imeSyncDeferringInsetsCallback != null) {
            imeSyncDeferringInsetsCallback.remove();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        if (r7 == r1.composingEnd) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void didChangeEditingState(boolean r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x000b
            io.flutter.plugin.editing.ListenableEditingState r9 = r8.mEditable
            java.lang.String r9 = r9.toString()
            r8.notifyValueChanged(r9)
        L_0x000b:
            io.flutter.plugin.editing.ListenableEditingState r9 = r8.mEditable
            int r9 = r9.getSelectionStart()
            io.flutter.plugin.editing.ListenableEditingState r10 = r8.mEditable
            int r10 = r10.getSelectionEnd()
            io.flutter.plugin.editing.ListenableEditingState r11 = r8.mEditable
            int r11 = r11.getComposingStart()
            io.flutter.plugin.editing.ListenableEditingState r0 = r8.mEditable
            int r7 = r0.getComposingEnd()
            io.flutter.plugin.editing.ListenableEditingState r0 = r8.mEditable
            java.util.ArrayList r0 = r0.extractBatchTextEditingDeltas()
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState r1 = r8.mLastKnownFrameworkTextEditingState
            if (r1 == 0) goto L_0x0052
            io.flutter.plugin.editing.ListenableEditingState r1 = r8.mEditable
            java.lang.String r1 = r1.toString()
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState r2 = r8.mLastKnownFrameworkTextEditingState
            java.lang.String r2 = r2.text
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0050
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState r1 = r8.mLastKnownFrameworkTextEditingState
            int r2 = r1.selectionStart
            if (r9 != r2) goto L_0x0050
            int r2 = r1.selectionEnd
            if (r10 != r2) goto L_0x0050
            int r2 = r1.composingStart
            if (r11 != r2) goto L_0x0050
            int r1 = r1.composingEnd
            if (r7 != r1) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r1 = 0
            goto L_0x0053
        L_0x0052:
            r1 = 1
        L_0x0053:
            if (r1 != 0) goto L_0x00ac
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "send EditingState to flutter: "
            r1.append(r2)
            io.flutter.plugin.editing.ListenableEditingState r2 = r8.mEditable
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TextInputPlugin"
            p172io.flutter.Log.m165290v(r2, r1)
            io.flutter.embedding.engine.systemchannels.TextInputChannel$Configuration r1 = r8.configuration
            boolean r1 = r1.enableDeltaModel
            if (r1 == 0) goto L_0x0086
            io.flutter.embedding.engine.systemchannels.TextInputChannel r1 = r8.textInputChannel
            io.flutter.plugin.editing.TextInputPlugin$InputTarget r2 = r8.inputTarget
            int r2 = r2.f324800id
            r1.updateEditingStateWithDeltas(r2, r0)
            io.flutter.plugin.editing.ListenableEditingState r0 = r8.mEditable
            r0.clearBatchDeltas()
            goto L_0x0099
        L_0x0086:
            io.flutter.embedding.engine.systemchannels.TextInputChannel r0 = r8.textInputChannel
            io.flutter.plugin.editing.TextInputPlugin$InputTarget r1 = r8.inputTarget
            int r1 = r1.f324800id
            io.flutter.plugin.editing.ListenableEditingState r2 = r8.mEditable
            java.lang.String r2 = r2.toString()
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r7
            r0.updateEditingState(r1, r2, r3, r4, r5, r6)
        L_0x0099:
            io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState r6 = new io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState
            io.flutter.plugin.editing.ListenableEditingState r0 = r8.mEditable
            java.lang.String r1 = r0.toString()
            r0 = r6
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r8.mLastKnownFrameworkTextEditingState = r6
            goto L_0x00b1
        L_0x00ac:
            io.flutter.plugin.editing.ListenableEditingState r9 = r8.mEditable
            r9.clearBatchDeltas()
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p172io.flutter.plugin.editing.TextInputPlugin.didChangeEditingState(boolean, boolean, boolean):void");
    }

    public Editable getEditable() {
        return this.mEditable;
    }

    public ImeSyncDeferringInsetsCallback getImeSyncCallback() {
        return this.imeSyncCallback;
    }

    public InputMethodManager getInputMethodManager() {
        return this.mImm;
    }

    public InputConnection getLastInputConnection() {
        return this.lastInputConnection;
    }

    public boolean handleKeyEvent(KeyEvent keyEvent) {
        InputConnection inputConnection;
        if (!getInputMethodManager().isAcceptingText() || (inputConnection = this.lastInputConnection) == null) {
            return false;
        }
        return inputConnection instanceof InputConnectionAdaptor ? ((InputConnectionAdaptor) inputConnection).handleKeyEvent(keyEvent) : inputConnection.sendKeyEvent(keyEvent);
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        Rect rect;
        ViewStructure viewStructure2 = viewStructure;
        if (Build.VERSION.SDK_INT >= 26 && needsAutofill()) {
            String str = this.configuration.autofill.uniqueIdentifier;
            AutofillId autofillId = viewStructure.getAutofillId();
            for (int i2 = 0; i2 < this.mAutofillConfigurations.size(); i2++) {
                int keyAt = this.mAutofillConfigurations.keyAt(i2);
                TextInputChannel.Configuration.Autofill autofill = this.mAutofillConfigurations.valueAt(i2).autofill;
                if (autofill != null) {
                    viewStructure2.addChildCount(1);
                    ViewStructure newChild = viewStructure2.newChild(i2);
                    newChild.setAutofillId(autofillId, keyAt);
                    newChild.setAutofillHints(autofill.hints);
                    newChild.setAutofillType(1);
                    newChild.setVisibility(0);
                    String str2 = autofill.hintText;
                    if (str2 != null) {
                        newChild.setHint(str2);
                    }
                    if (str.hashCode() != keyAt || (rect = this.lastClientRect) == null) {
                        ViewStructure viewStructure3 = newChild;
                        viewStructure3.setDimens(0, 0, 0, 0, 1, 1);
                        viewStructure3.setAutofillValue(AutofillValue.forText(autofill.editState.text));
                    } else {
                        newChild.setDimens(rect.left, rect.top, 0, 0, rect.width(), this.lastClientRect.height());
                        newChild.setAutofillValue(AutofillValue.forText(this.mEditable));
                    }
                }
            }
        }
    }

    public void sendTextInputAppPrivateCommand(String str, Bundle bundle) {
        this.mImm.sendAppPrivateCommand(this.mView, str, bundle);
    }

    public void setTextInputClient(int i, TextInputChannel.Configuration configuration2) {
        notifyViewExited();
        this.configuration = configuration2;
        if (canShowTextInput()) {
            this.inputTarget = new InputTarget(InputTarget.Type.FRAMEWORK_CLIENT, i);
        } else {
            this.inputTarget = new InputTarget(InputTarget.Type.NO_TARGET, i);
        }
        this.mEditable.removeEditingStateListener(this);
        TextInputChannel.Configuration.Autofill autofill = configuration2.autofill;
        this.mEditable = new ListenableEditingState(autofill != null ? autofill.editState : null, this.mView);
        updateAutofillConfigurationIfNeeded(configuration2);
        this.mRestartInputPending = true;
        this.lastClientRect = null;
        this.mEditable.addEditingStateListener(this);
    }

    public void setTextInputEditingState(View view, TextInputChannel.TextEditState textEditState) {
        TextInputChannel.TextEditState textEditState2;
        if (!this.mRestartInputPending && (textEditState2 = this.mLastKnownFrameworkTextEditingState) != null && textEditState2.hasComposing()) {
            boolean composingChanged = composingChanged(this.mLastKnownFrameworkTextEditingState, textEditState);
            this.mRestartInputPending = composingChanged;
            if (composingChanged) {
                Log.m165288i(TAG, "Composing region changed by the framework. Restarting the input method.");
            }
        }
        this.mLastKnownFrameworkTextEditingState = textEditState;
        this.mEditable.setEditingState(textEditState);
        if (this.mRestartInputPending) {
            this.mImm.restartInput(view);
            this.mRestartInputPending = false;
        }
    }

    public void setWxKeyboardAction(WxKeyboardAction wxKeyboardAction) {
        this.mWxKeyboardAction = wxKeyboardAction;
    }

    public void showTextInput(View view) {
        if (canShowTextInput()) {
            view.requestFocus();
            this.mImm.showSoftInput(view, 0);
            return;
        }
        hideTextInput(view);
    }
}

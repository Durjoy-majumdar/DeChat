package com.eclipsesource.mmv8;

final class V8ContextSessionMgr {
    private V8ContextWrapper currentContext;

    /* renamed from: v8 */
    private final C80135V8 f234639v8;

    public V8ContextSessionMgr(C80135V8 v8) {
        this.f234639v8 = v8;
    }

    public void enterContext(V8ContextWrapper v8ContextWrapper) {
        if (v8ContextWrapper != null && !v8ContextWrapper.equals(this.currentContext)) {
            this.f234639v8.switchV8Context(v8ContextWrapper.getPtr());
            this.currentContext = v8ContextWrapper;
        }
    }

    public void releaseContext(V8ContextWrapper v8ContextWrapper) {
        if (v8ContextWrapper != null) {
            this.f234639v8.releaseV8Context(v8ContextWrapper.getPtr());
        }
    }
}

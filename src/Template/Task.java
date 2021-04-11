package Template;

public abstract class Task {
    private AuditTrail auditTrail;

    public Task() {
        this.auditTrail = new AuditTrail();
    }

    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute(){
        auditTrail.record();
    }

    protected abstract void doExecute();
}

public class routes {
  /**
   * This is the current state of play reverse router generation.
   *
   * Uncomment this, and any changes to ControllersImpl triggers recompilation
   * of anything that uses the reverse router
   */
  // public static final ControllersImpl Controllers = new ControllersImpl();

  /**
   * This a proposed solution to prevent full-app recompilation when any
   * Controller changes its public interface. Changes to ControllersImpl do
   * not trigger a full-app recompilation due to abstraction against a trait.
   */
  public static final ControllersTrait Controllers = new ControllersImpl();
}
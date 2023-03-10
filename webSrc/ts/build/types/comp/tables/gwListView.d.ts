import { GwDomNode, GwEventType, GwKeyboardNavigation, GwMap } from "../../types/gwTypes";
import { GwDraggableSystem } from "../../core/util/GwDraggableSystem";
/**
 * Guidewire's TypeScript APIs are an early-stage feature and are subject to change in a future release.
 */
export declare class GwListView extends GwDraggableSystem implements GwKeyboardNavigation {
    getSystemName(): string;
    private readonly PREFERENCE_TYPE;
    private readonly COLUMN_PREFERENCES;
    private readonly FIRST_HEADER_CELL_CLASS;
    private readonly LAST_HEADER_CELL_CLASS;
    init(isFullPageReload: boolean): void;
    /**
     * @public
     * @param targetGroupRowNode
     */
    toggleRowGroup(targetRowGroupEl: GwDomNode): void;
    /**
     * Handles any commands an LV header cell might fire. Grouping, sorting, etc.
     * @param headerNode
     * @param args
     * @param event
     */
    headerAction(headerNode: GwDomNode, args: GwMap, event?: GwEventType): void;
    /**
     * @public
     * Filters the ListView using the given "opKey", which corresponds to specific Header's
     * filter values
     * @param filterNode
     * @param args
     */
    filter(filterNode: GwDomNode, args: GwMap): void;
    /**
     * A helper method for triggering the paging event
     */
    page(pageNode: HTMLInputElement, pageArgs: GwMap): void;
    resetTablePreferences(headerNode: GwDomNode): void;
    /**
     * A helper method for hiding columns on the client side
     */
    private hideColumnByHeaderId(associatedHeaderId);
    private getCellAtIndexIncludingColspan(tr, index);
    sizeColumnByCellId(cellId: string, size: string, minSize?: string | null, maxSize?: string | null, storeValue?: boolean, addSizingClass?: boolean, resetting?: boolean): void;
    /**
     * A helper method for showing columns on the client side
     */
    showColumnByHeaderId(associatedHeaderId: string): void;
    applyPreferences(): void;
    /**
     * Called when a column begins dragging, or when an LV has sizes restored to it on page load
     * @param {GwDomNode | null} listViewElement
     */
    removeStretchFromLV(listViewElement: GwDomNode | null): void;
    /**
     * Called by gwDraggableColumn if the drag event is cancelled by the user
     * @param {GwDomNode | null} listViewElement
     */
    restoreStretchToLV(listViewElement: GwDomNode | null): void;
    storeColumnOrder(listViewElement: GwDomNode): void;
    toggleColumnVisibility(target: GwDomNode, args: GwMap): void;
    toggleGroupedBy(target: GwDomNode, args: GwMap): void;
    private getHeaderTD(headerId);
    private resetHiddenColumns(listViewElement);
    private storeHiddenColumnValueInLVPreferences(listViewId, headerId, hiddenValue?);
    storeSizedColumnValueInLVPreferences(listViewId: string, headerId: string, size: string): void;
    private storeColumnOrderingInLVPreferences(listViewId, columnIdsInOrder);
    private getColumnPreferences(listViewId);
    private getListViewRenderIds();
    private moveColumn(listViewElement, sourceIndex, targetIndex);
    getFirstValueWidgetInCell(td: HTMLTableDataCellElement): GwDomNode | null;
    private headerCells(listViewElement);
    private headerValueWidgets(listViewElement);
    private headerColumnIds(listViewElement);
    private headerColumnIdsInRenderOrder(listViewElement);
    applyColumnClasses(listViewElement: GwDomNode): void;
    private refreshHeaderCellWithTargetClass(listViewElement, targetClass, firstOrLast);
    private applyColumnOrdering(listViewElement, columnOrdering);
    markColumnsAsOrdered(listViewElement: GwDomNode): void;
    /**
     * @public
     * Handles an "Alt-Shift-Left" shortcut while in the context of an LV
     * @param node the node that received the shortcut
     * @param info the method info
     * @param event the event
     */
    left(node: GwDomNode, info: GwMap, event: GwEventType): boolean;
    /**
     * @public
     * Handles an "Alt-Shift-Right" shortcut while in the context of an LV
     * @param node the node that received the shortcut
     * @param info the method info
     * @param event the event
     */
    right(node: GwDomNode, info: GwMap, event: GwEventType): boolean;
    /**
     * @public
     * Handles an "Alt-Shift-Up" shortcut while in the context of an LV
     * @param node the node that received the shortcut
     * @param info the method info
     * @param event the event
     */
    up(node: GwDomNode, info: GwMap, event: GwEventType): boolean;
    /**
     * @public
     * Handles an "Alt-Shift-Down" shortcut while in the context of an LV
     * @param node the node that received the shortcut
     * @param info the method info
     * @param event the event
     */
    down(node: GwDomNode, info: GwMap, event: GwEventType): boolean;
    private moveDownInListDetail(row);
    private moveUpInListDetail(row);
    private moveToAndPossiblySelectListDetailRow(row);
    /**
     * Called by gwDraggable.ts
     */
    dragStart(actionInner: GwDomNode): void;
    /**
     * Called by gwDraggable.ts
     */
    dragEnd(): void;
    /**
     * Called by gwDraggable.ts
     */
    dragCancel(): void;
    /**
     * Called by gwDraggable.ts
     */
    drag(): void;
}
export declare const gwListView: GwListView;

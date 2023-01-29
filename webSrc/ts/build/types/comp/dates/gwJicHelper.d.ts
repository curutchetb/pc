import { GwDomNode, GwMap, GwTypedMap } from "../../types/gwTypes";
import { GwDateInfo } from "./GwDateInfo";
import { GwEraDetail } from "./GwEraDetail";
/**
 * Guidewire's TypeScript APIs are an early-stage feature and are subject to change in a future release.
 */
export declare class GwJicHelper {
    eraYearLocalizedSuffix: string;
    eraMonthLocalizedSuffix: string;
    highestEraOrder: number;
    readonly eraOrderIndexToDetails: GwTypedMap<GwEraDetail>;
    readonly eraQuickToDetails: GwTypedMap<GwEraDetail>;
    mapEraDataFromServer(): void;
    getInst(): GwDateInfo;
    getDateWidget(el: GwDomNode | null): GwDomNode;
    getEraInput(el: GwDomNode | null): HTMLInputElement | null;
    getTotalYearsForCurrentEraSelect(el: GwDomNode): number;
    getMonthSelect(el: GwDomNode | null): HTMLSelectElement;
    getEraYearSelect(el: GwDomNode | null): HTMLSelectElement;
    getEraSelect(el: GwDomNode | null): HTMLSelectElement;
    getDateInput(): HTMLInputElement;
    getEraValueForToday(): string;
    setEraValueFromPaste(eraVal: string, dateInput: HTMLInputElement): void;
    setEraYearSelect(eraYear: number): void;
    setEraSelect(eraValOrOrder: any, dateInput?: HTMLInputElement | null): void;
    setEraInputValue(eraValOrOrder: string | number | undefined, dateInput?: HTMLInputElement | null): void;
    getEraInputValue(el: GwDomNode | null): string | null;
    getEraDetailsForValueOrOrderOrThrow(eraValOrOrder: string | number | undefined): GwEraDetail;
    getEraDetailsForValueOrOrder(eraValOrOrder: string | number | undefined): GwEraDetail | null;
    eraYearToGregYear(eraYear: number, useEraSelectForValue?: boolean): number;
    gregYearToEraYear(gregDateObj: GwMap, forceUpdate?: boolean): number;
    getEraSelectValue(): string | undefined;
}
export declare const gwJicHelper: GwJicHelper;
